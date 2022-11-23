import 'package:adobe_xd/gradient_xd_transform.dart';
import 'package:adobe_xd/pinned.dart';
import 'package:app_asistencia_proyecto_v1/widgets/pantalla2.dart';
import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:flutter/src/widgets/container.dart';
import 'package:flutter/src/widgets/framework.dart';

class mainHome extends StatelessWidget {
  const mainHome({super.key});

  @override
  Widget build(BuildContext context) {
//estilo para el boton
    final ElevatedButtonStyle = ElevatedButton.styleFrom(
      primary: Colors.white,
      onPrimary: Color(0xff582120),
      padding: EdgeInsets.symmetric(horizontal: 100),
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
          Align(
            alignment: Alignment(-0.07, 1.0),
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

          // Adobe XD layer: 'FONDO PRINCIPAL' (shape)
          Container(
            decoration: BoxDecoration(
              image: DecorationImage(
                image: const AssetImage('assets/FONDO PRINCIPAL.png'),
                fit: BoxFit.fill,
              ),
            ),
          ),
          Align(
            alignment: Alignment(-0.036, 0.32),
            child: Container(
              width: 298.0,
              height: 73.0,
              child: ElevatedButton(
                style: ElevatedButtonStyle,
                child: Text("Iniciar clase"),
                onPressed: () {
                  Navigator.push(
                    context,
                    MaterialPageRoute(
                      builder: (context) => pantalla2(),
                    ),
                  );
                  //home: main2(),
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
        ],
      ),
    );
  }
}
