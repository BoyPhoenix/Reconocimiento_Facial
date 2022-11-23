import 'package:app_asistencia_proyecto_v1/widgets/pantalla2.dart';
import 'package:app_asistencia_proyecto_v1/widgets/mainHome.dart';
import 'package:app_asistencia_proyecto_v1/widgets/pantalla3.dart';
import 'package:flutter/material.dart';

void main() {
  runApp(rutasApp());
}

class rutasApp extends StatelessWidget {
  //const rutasApp({super.key});
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: mainHome(),
/*       routes: {
        '/one': (context) => mainHome(),
        '/two': (context) => main2(),
        '/tree': (context) => pagina3(),
      }, */
      // initialRoute: '/one',

      // home: pantalla1(),
    );
  }
}
