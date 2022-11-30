package com.unipamplona.prototipoasistencia.controllers;

import com.unipamplona.prototipoasistencia.services.DocenteClaseService;
import com.unipamplona.prototipoasistencia.utils.RespuestaUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teacherclass")
public class DocenteClaseController {

    @Autowired
    DocenteClaseService servicio;

    @GetMapping(path = "/{documento}/{verificar}")
    public RespuestaUtil buscarPorDocumento(@PathVariable String documento, @PathVariable boolean verificar) {
        try {
            if (verificar) {
                return new RespuestaUtil("Buscar Clases del Docente", this.servicio.buscarPorDocumento(documento));
            }
            return new RespuestaUtil("Buscar Clases del Docente", "No tiene acceso");
        } catch (Exception e) {
            return new RespuestaUtil("Buscar Clases del Docente", "No existe");
        }
    }

}
