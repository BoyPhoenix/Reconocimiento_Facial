from flask import Flask, request, jsonify
from werkzeug import utils
import os
import Recognition,Query

app = Flask(__name__)

@app.route("/compare", methods=["POST"])
def face():
    imagefile = request.files["image"]
    pers_doc = request.form["pers_doc"]
    filename =  utils.secure_filename(imagefile.filename)
    namefile = "./" + filename
    imagefile.save(namefile)
    _,cursor = Query.get_connection_cursor_tuple()
    b64 = Query.select_photo(cursor,pers_doc)
    Result = Recognition.CompareFF(namefile,b64)
    os.remove(namefile)
    os.remove("./image.jpg")
    return jsonify({
        "Result": Result
    })

@app.route("/update", methods=["POST"])
def update():
    imagefile = request.files["image"]
    pers_doc = request.form["pers_doc"]
    filename =  utils.secure_filename(imagefile.filename)
    namefile = "./" + filename
    imagefile.save(namefile)
    connection ,cursor = Query.get_connection_cursor_tuple()
    Query.update_photo(connection,cursor,namefile,pers_doc)
    os.remove(namefile)
    return jsonify({
        #Image has been changed
        "Result": "La imagen ha sido cambiada"
    })

if __name__ == "__main__":
    app.run(debug=True,port=4040)