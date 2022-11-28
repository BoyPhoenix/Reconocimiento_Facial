from Config import config
import psycopg2
import base64

# Gets the tuple connection: connection and cursor
# Obtiene la tupla de la conexion: connection y cursor
def get_connection_cursor_tuple():
    connection = None
    try:
        params = config()
        print('Connecting to the PostgreSQL database...')
        connection = psycopg2.connect(**params)
        cursor = connection.cursor()
    except (Exception, psycopg2.DatabaseError) as error:
        print(error)
    return connection, cursor

# Gets Base 64 of the image with path
# Convierte la imagen a Base 64 con el path 
def get_b64(path):
    with open(path,"rb") as image_file:
        encoded_string = base64.b64encode(image_file.read())
    return encoded_string

# Update the photo of a person in the database
# Actualiza la foto de una person en la base de datos
# (Connection,Cursor) -> Tupla de conexion de la base de datos
# file_name -> Nombre de la foto (path)
# pers_id -> ID de la persona en la base de datos
def update_photo(connection, cursor, file_name, pers_id):
    query = "UPDATE reconocer.personafoto SET pefo_imagen = %s WHERE pers_id = %s"
    image = (get_b64(file_name))
    imageD = image.decode("utf-8")
    try:
        cursor.execute(query,(imageD,pers_id))
        connection.commit()  # commit the changes to the database is advised for big files, see documentation
        count = cursor.rowcount # check that the images were all successfully added
        print (count, "Records inserted successfully into table")
    except (Exception, psycopg2.DatabaseError) as error:
        print(error)

# Select the photo of a person in the database
# Toma la imagen de una persona en la base de datos
# Cursor -> Conexion a la base de datos
# pers_id -> ID de la persona en la base datos
def select_photo(cursor,pers_id):
    query = "SELECT pefo_imagen FROM reconocer.personafoto WHERE pers_id = %s"
    try:
        cursor.execute(query,(pers_id,))
        (photo,) = cursor.fetchone()
        print ("Records has been extracted successfully into table")
        return photo
    except (Exception, psycopg2.DatabaseError) as error:
        print(error)
