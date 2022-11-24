import 'package:adobe_xd/gradient_xd_transform.dart';
import 'package:adobe_xd/pinned.dart';
import 'package:app_asistencia_proyecto_v1/widgets/pantalla2.dart';
import 'package:flutter/material.dart';
import 'package:image_picker/image_picker.dart';
import 'dart:io';

class Imagen extends StatefulWidget {
  @override
  State<Imagen> createState() => _ImagenState();
}

//File imagen;
final picker = ImagePicker();
Future selImagen(op) async {
  var pickedFile;
  if (op == 1) {
    pickedFile = await picker.getImage(source: ImageSource.camera);
  } else {
    pickedFile = await picker.getImage(source: ImageSource.gallery);
  }
  StepState() {
    if (pickedFile != null) {
      //imagen=File(pickedFile.path);
    } else {
      print('no nada ');
    }
  }
}

class _ImagenState extends State<Imagen> {
  opciones(context) {
    showDialog(
        context: context,
        builder: (BuildContext context) {
          return AlertDialog(
            contentPadding: EdgeInsets.all(0),
            content: SingleChildScrollView(
              child: Column(children: [
                InkWell(
                  onTap: () {
                    selImagen(1);
                  },
                  child: Container(
                    padding: EdgeInsets.all(20),
                    decoration: BoxDecoration(
                        border: Border(
                            bottom: BorderSide(width: 1, color: Colors.grey))),
                    child: Row(
                      children: [
                        Expanded(
                          child: Text(
                            "toma una foto",
                            style: TextStyle(fontSize: 16),
                          ),
                        ),
                        Icon(Icons.camera_alt, color: Colors.blue)
                      ],
                    ),
                  ),
                ),
                InkWell(
                  onTap: () {
                    selImagen(2);
                  },
                  child: Container(
                    padding: EdgeInsets.all(20),
                    decoration: BoxDecoration(
                        border: Border(
                            bottom: BorderSide(width: 1, color: Colors.grey))),
                    child: Row(
                      children: [
                        Expanded(
                          child: Text(
                            "cargar una foto",
                            style: TextStyle(fontSize: 16),
                          ),
                        ),
                        Icon(Icons.image, color: Colors.blue)
                      ],
                    ),
                  ),
                ),
              ]),
            ),
          );
        });
  }

  final ElevatedButtonStyle = ElevatedButton.styleFrom(
    onPrimary: Color(0xf761292a),
    primary: Colors.white,
  );
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: const Color(0xffffffff),
      body: Stack(
        children: <Widget>[
          Container(
            decoration: BoxDecoration(
              gradient: RadialGradient(
                center: Alignment(-0.141, -0.533),
                radius: 0.436,
                colors: [
                  const Color(0xff652827),
                  const Color(0xff511d1c),
                  const Color(0xff511d1c),
                  const Color(0xff331414)
                ],
                stops: [0.0, 1.0, 1.0, 1.0],
                transform: GradientXDTransform(1.0, 0.0, 0.0, 2.198, 0.0, -0.28,
                    Alignment(-0.141, -0.533)),
              ),
              border: Border.all(width: 1.0, color: const Color(0xff707070)),
            ),
          ),
          Container(
            decoration: BoxDecoration(
              image: DecorationImage(
                image: const AssetImage('assets/fondo_blanco.png'),
                fit: BoxFit.fill,
              ),
            ),
            //margin: EdgeInsets.fromLTRB(-160.0, -6.0, -117.0, -6.0),
          ),
          Pinned.fromPins(
            Pin(size: 150.0, start: 380.0),
            Pin(size: 60.0, middle: 0.85),
            child: Container(
              width: 120.0,
              height: 60.0,
              child: ElevatedButton(
                style: ElevatedButtonStyle,
                child: Text('capturar'),
                onPressed: () {
                  opciones(context);
                },
              ),
            ),
          ),
          Pinned.fromPins(
            Pin(size: 294.0, middle: 0.5082),
            Pin(size: 348.0, start: 39.0),
            child:
                // Adobe XD layer: 'escudo_62_anios' (shape)
                Container(
              decoration: BoxDecoration(
                image: DecorationImage(
                  image: const AssetImage('assets/escudo_62_anios.png'),
                  fit: BoxFit.fill,
                ),
              ),
            ),
          ),
          Align(
            alignment: Alignment(-0, 0),
            child: Container(
              width: 120.0,
              height: 60.0,
              child: ElevatedButton(
                style: ElevatedButtonStyle,
                child: Text('Atras'),
                onPressed: () {
                  Navigator.push(
                    context,
                    MaterialPageRoute(
                      builder: (context) => pantalla2(),
                    ),
                  );
                },
              ),
            ),
          ),
          Pinned.fromPins(
              Pin(size: 300.0, start: 315.0), Pin(size: 60.0, middle: 0.75),
              child: TextField(
                decoration: InputDecoration(
                  filled: true,
                  fillColor: Colors.red,
                  border: OutlineInputBorder(),
                  contentPadding: EdgeInsets.all(20),
                  enabledBorder: OutlineInputBorder(
                      borderSide: BorderSide(
                    color: Colors.white,
                  )),
                ),
              )),
          Pinned.fromPins(
              Pin(size: 600.0, start: 160.0), Pin(size: 110.0, middle: 0.70),
              child: TextField(
                decoration: InputDecoration(
                  filled: true,
                  fillColor: Colors.black,
                  border: OutlineInputBorder(),
                  contentPadding: EdgeInsets.all(20),
                  enabledBorder: OutlineInputBorder(
                      borderSide: BorderSide(
                    color: Colors.white,
                  )),
                ),
              )),
          Pinned.fromPins(
            Pin(size: 230.0, start: 300.0),
            Pin(size: 110.0, middle: 0.60),
            child: SizedBox(
              width: 148.0,
              height: 83.0,
              child: Text(
                'Docente\n',
                style: TextStyle(
                  fontFamily: 'Segoe UI',
                  fontSize: 40,
                  color: const Color(0xff1c0708),
                  height: 0.75,
                ),
                textHeightBehavior:
                    TextHeightBehavior(applyHeightToFirstAscent: false),
                textAlign: TextAlign.right,
                softWrap: false,
              ),
            ),
          ),
          Pinned.fromPins(
            Pin(size: 128.0, middle: 0.5),
            Pin(size: 28.0, end: 17.0),
            child: Stack(
              children: <Widget>[
                Pinned.fromPins(
                  Pin(size: 28.0, middle: 0.5),
                  Pin(start: 0.0, end: 0.0),
                  child: Container(
                    decoration: BoxDecoration(
                      color: const Color(0xd961292a),
                      borderRadius:
                          BorderRadius.all(Radius.elliptical(9999.0, 9999.0)),
                      border: Border.all(
                          width: 1.0, color: const Color(0xd9ffffff)),
                    ),
                  ),
                ),
                Pinned.fromPins(
                  Pin(size: 18.0, middle: 0.2273),
                  Pin(size: 18.0, end: 4.0),
                  child: Container(
                    decoration: BoxDecoration(
                      color: const Color(0xd961292a),
                      borderRadius:
                          BorderRadius.all(Radius.elliptical(9999.0, 9999.0)),
                      border: Border.all(
                          width: 1.0, color: const Color(0xd9ffffff)),
                    ),
                  ),
                ),
                Pinned.fromPins(
                  Pin(size: 18.0, start: 0.0),
                  Pin(size: 18.0, end: 4.0),
                  child: Container(
                    decoration: BoxDecoration(
                      color: const Color(0xd961292a),
                      borderRadius:
                          BorderRadius.all(Radius.elliptical(9999.0, 9999.0)),
                      border: Border.all(
                          width: 1.0, color: const Color(0xd9ffffff)),
                    ),
                  ),
                ),
                Pinned.fromPins(
                  Pin(size: 18.0, end: 0.0),
                  Pin(start: 5.0, end: 5.0),
                  child: Container(
                    decoration: BoxDecoration(
                      color: const Color(0xd961292a),
                      borderRadius:
                          BorderRadius.all(Radius.elliptical(9999.0, 9999.0)),
                      border: Border.all(
                          width: 1.0, color: const Color(0xd9ffffff)),
                    ),
                  ),
                ),
                Pinned.fromPins(
                  Pin(size: 18.0, middle: 0.7727),
                  Pin(start: 5.0, end: 5.0),
                  child: Container(
                    decoration: BoxDecoration(
                      color: const Color(0xd961292a),
                      borderRadius:
                          BorderRadius.all(Radius.elliptical(9999.0, 9999.0)),
                      border: Border.all(
                          width: 1.0, color: const Color(0xd9ffffff)),
                    ),
                  ),
                ),
              ],
            ),
          ),
        ],
      ),
    );
  }
}
