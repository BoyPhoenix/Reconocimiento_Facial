import face_recognition
import base64

# Convert the Base 64 of an image into a image
# Convierte un base 64 codificado de una imagen en una imagen
def convert_b64(b64):
    #decode base64 string data
    decoded_data=base64.b64decode((b64))
    #write the decoded data back to original format in  file
    img_file = open('image.jpg', 'wb')
    img_file.write(decoded_data)
    img_file.close()

# Compare Two photos, one taken from the database
# and the other one taken with the camera
# path -> path of image taken with the camera
# pers_id -> ID of the person to get photo from database
def CompareFF(path,b64):
    # ImageS -> Image selected from the database
    # ImageC -> Image taken with the camera
    convert_b64(b64)
    imageS = face_recognition.load_image_file("./image.jpg")
    imageC = face_recognition.load_image_file(path)
    # Encoding of images
    encodingS = face_recognition.face_encodings(imageS)[0]
    encodingC = face_recognition.face_encodings(imageC)[0]
    # Comapare econdings of images
    matches = face_recognition.compare_faces([encodingS],encodingC)
    # Convert the result Bool into a String
    matchs = matches[0].__str__()
    return matchs