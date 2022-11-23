import 'package:adobe_xd/gradient_xd_transform.dart';
import 'package:adobe_xd/pinned.dart';
import 'package:app_asistencia_proyecto_v1/widgets/mainHome.dart';
import 'package:app_asistencia_proyecto_v1/widgets/pantalla3-camara.dart';
import 'package:app_asistencia_proyecto_v1/widgets/pantalla3.dart';
import 'package:app_asistencia_proyecto_v1/widgets/pantalla4.dart';
import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:flutter/src/widgets/container.dart';
import 'package:flutter/src/widgets/framework.dart';
import 'package:get/get.dart';

import '../controllers/calculator_controller.dart';
import 'calc_button.dart';
import 'math_results.dart';

class pantalla2 extends StatelessWidget {
  final calculatorCtrl = Get.put(CalculatorController());

  @override
  Widget build(BuildContext context) {
//estilo para el boton
    final ElevatedButtonStyle = ElevatedButton.styleFrom(
      onPrimary: Colors.black,
      primary: Colors.white,

      //onPrimary: Colors.black,
      //padding: EdgeInsets.symmetric(horizontal: 100),
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

          // Adobe XD layer: 'FONDO PRINCIPAL' (shape)
          Container(
            decoration: BoxDecoration(
              image: DecorationImage(
                image: const AssetImage('assets/FONDO PRINCIPAL.png'),
                fit: BoxFit.fill,
              ),
            ),
          ),

          //MathResults(),

          Row(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              SizedBox(
                width: 550,
                height: 620,
              ),
              CalculatorButton(
                text: '7',
                onPressed: () => calculatorCtrl.addNumber('7'),
              ),
              CalculatorButton(
                //bgColor: Color(0xffA5A5A5),
                text: '8',
                onPressed: () => calculatorCtrl.addNumber('8'),
              ),
              CalculatorButton(
                text: '9',
                onPressed: () => calculatorCtrl.addNumber('9'),
              ),
            ],
          ),

          Row(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              SizedBox(
                width: 550,
                height: 820,
              ),
              CalculatorButton(
                text: '4',
                onPressed: () => calculatorCtrl.addNumber('4'),
              ),
              CalculatorButton(
                text: '5',
                onPressed: () => calculatorCtrl.addNumber('5'),
              ),
              CalculatorButton(
                text: '6',
                onPressed: () => calculatorCtrl.addNumber('6'),
              ),
            ],
          ),
          Row(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              SizedBox(
                width: 550,
                height: 1020,
              ),
              CalculatorButton(
                text: '1',
                onPressed: () => calculatorCtrl.addNumber('1'),
              ),
              CalculatorButton(
                text: '2',
                onPressed: () => calculatorCtrl.addNumber('2'),
              ),
              CalculatorButton(
                text: '3',
                onPressed: () => calculatorCtrl.addNumber('3'),
              ),
            ],
          ),

          Row(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              SizedBox(
                width: 550,
                height: 1220,
              ),
              CalculatorButton(
                text: 'Borrar',
                big: true,
                bgColor: Color(0xffA5A5A5),
                onPressed: () => calculatorCtrl.resetAll(),
              ),
              CalculatorButton(
                text: '0',
                onPressed: () => calculatorCtrl.addNumber('0'),
              ),
            ],
          ),

          Pinned.fromPins(
            Pin(size: 492.0, start: 50.0),
            Pin(size: 136.0, middle: 0.42),
            child: Text.rich(
              TextSpan(
                style: TextStyle(
                  fontFamily: 'Segoe UI',
                  fontSize: 80,
                  color: const Color(0xffffffff),
                  height: 0.375,
                ),
                children: [
                  TextSpan(
                    text: 'Inicia tu ',
                  ),
                  TextSpan(
                    text: 'clase\n',
                    style: TextStyle(
                      fontWeight: FontWeight.w700,
                    ),
                  ),
                ],
              ),
              textHeightBehavior:
                  TextHeightBehavior(applyHeightToFirstAscent: false),
              textAlign: TextAlign.right,
              softWrap: false,
            ),
          ),

          Pinned.fromPins(
            Pin(size: 244.0, start: 50.0),
            Pin(size: 97.0, middle: 0.37),
            child: Text(
              'Bienvenido\n',
              style: TextStyle(
                fontFamily: 'Segoe UI',
                fontSize: 50,
                color: const Color(0xffffffff),
                height: 0.6,
              ),
              textHeightBehavior:
                  TextHeightBehavior(applyHeightToFirstAscent: false),
              textAlign: TextAlign.right,
              softWrap: false,
            ),
          ),
          Pinned.fromPins(
            Pin(size: 450.0, start: 50.0),
            Pin(size: 97.0, middle: 0.55),
            child: Text(
              'Digita tu documento',
              style: TextStyle(
                fontFamily: 'Segoe UI',
                fontSize: 50,
                color: const Color(0xffffffff),
                height: 0.6,
              ),
              textHeightBehavior:
                  TextHeightBehavior(applyHeightToFirstAscent: false),
              textAlign: TextAlign.right,
              softWrap: false,
            ),
          ),
          Align(
            alignment: Alignment(-0.70, 0.21),
            child: Container(
              width: 120.0,
              height: 60.0,
              child: ElevatedButton(
                style: ElevatedButtonStyle,
                child: Text('Aceptar'),
                onPressed: () {
                  Navigator.push(
                    context,
                    MaterialPageRoute(
                      builder: (context) => Imagen(),
                    ),
                  );
                },
              ),
            ),
          ),
          Align(
            alignment: Alignment(-0.2, 0.21),
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
                      builder: (context) => mainHome(),
                    ),
                  );
                },
              ),
            ),
          ),
          Align(
            alignment: Alignment(0.0, 0.9),
            child:
                // Adobe XD layer: 'slogan_blanco' (shape)
                Container(
              width: 377.0,
              height: 188.0,
              decoration: BoxDecoration(
                image: DecorationImage(
                  image: const AssetImage('assets/slogan_blanco.png'),
                  fit: BoxFit.fill,
                ),
              ),
            ),
          ),
          Pinned.fromPins(
            Pin(size: 128.0, middle: 0.529),
            Pin(size: 28.0, end: 14.0),
            child: Stack(
              children: <Widget>[
                Pinned.fromPins(
                  Pin(size: 28.0, middle: 0.5),
                  Pin(start: 0.0, end: 0.0),
                  child: Container(
                    decoration: BoxDecoration(
                      color: const Color(0x47ffffff),
                      borderRadius:
                          BorderRadius.all(Radius.elliptical(9999.0, 9999.0)),
                      border: Border.all(
                          width: 1.0, color: const Color(0x47707070)),
                    ),
                  ),
                ),
                Pinned.fromPins(
                  Pin(size: 18.0, middle: 0.2273),
                  Pin(size: 18.0, end: 4.0),
                  child: Container(
                    decoration: BoxDecoration(
                      color: const Color(0x66ffffff),
                      borderRadius:
                          BorderRadius.all(Radius.elliptical(9999.0, 9999.0)),
                      border: Border.all(
                          width: 1.0, color: const Color(0x66707070)),
                    ),
                  ),
                ),
                Pinned.fromPins(
                  Pin(size: 18.0, start: 0.0),
                  Pin(size: 18.0, end: 4.0),
                  child: Container(
                    decoration: BoxDecoration(
                      color: const Color(0x66ffffff),
                      borderRadius:
                          BorderRadius.all(Radius.elliptical(9999.0, 9999.0)),
                      border: Border.all(
                          width: 1.0, color: const Color(0x66707070)),
                    ),
                  ),
                ),
                Pinned.fromPins(
                  Pin(size: 18.0, end: 0.0),
                  Pin(start: 5.0, end: 5.0),
                  child: Container(
                    decoration: BoxDecoration(
                      color: const Color(0x4dffffff),
                      borderRadius:
                          BorderRadius.all(Radius.elliptical(9999.0, 9999.0)),
                      border: Border.all(
                          width: 1.0, color: const Color(0x4d707070)),
                    ),
                  ),
                ),
                Pinned.fromPins(
                  Pin(size: 18.0, middle: 0.7727),
                  Pin(start: 5.0, end: 5.0),
                  child: Container(
                    decoration: BoxDecoration(
                      color: const Color(0x4dffffff),
                      borderRadius:
                          BorderRadius.all(Radius.elliptical(9999.0, 9999.0)),
                      border: Border.all(
                          width: 1.0, color: const Color(0x4d707070)),
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
