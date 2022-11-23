import 'package:adobe_xd/gradient_xd_transform.dart';
import 'package:adobe_xd/pinned.dart';
import 'package:app_asistencia_proyecto_v1/widgets/pantalla3.dart';
import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:flutter/src/widgets/container.dart';
import 'package:flutter/src/widgets/framework.dart';

class pantalla4 extends StatelessWidget {
  const pantalla4({super.key});
  @override
  Widget build(BuildContext context) {
//estilo para el boton
    final ElevatedButtonStyle = ElevatedButton.styleFrom(
      onPrimary: Color(0xf761292a),
      primary: Colors.white,
    );
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
            Pin(size: 128.0, middle: 0.5017),
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
          Pinned.fromPins(
            Pin(start: 0.0, end: -3.0),
            Pin(size: 60.0, start: 0.0),
            child: Stack(
              children: <Widget>[
                Container(
                  color: const Color(0xff61292a),
                ),
                Pinned.fromPins(
                  Pin(size: 50.0, start: 15.0),
                  Pin(start: 5.0, end: 5.0),
                  child: Container(
                    decoration: BoxDecoration(
                      color: const Color(0xffffffff),
                      borderRadius:
                          BorderRadius.all(Radius.elliptical(9999.0, 9999.0)),
                      border: Border.all(
                          width: 1.0, color: const Color(0xff707070)),
                    ),
                  ),
                ),
                Pinned.fromPins(
                  Pin(size: 155.0, start: 78.0),
                  Pin(size: 30.0, middle: 0.5),
                  child: Text(
                    'Mayra muñeton',
                    style: TextStyle(
                      fontFamily: 'Segoe UI',
                      fontSize: 22,
                      color: const Color(0xffffffff),
                      height: 1.3636363636363635,
                    ),
                    textHeightBehavior:
                        TextHeightBehavior(applyHeightToFirstAscent: false),
                    textAlign: TextAlign.right,
                    softWrap: false,
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
