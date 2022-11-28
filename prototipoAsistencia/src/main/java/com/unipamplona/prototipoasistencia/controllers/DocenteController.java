package com.unipamplona.prototipoasistencia.controllers;

import com.unipamplona.prototipoasistencia.services.DocenteService;
import com.unipamplona.prototipoasistencia.utils.RespuestaUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teacher")
public class DocenteController {

    @Autowired
    DocenteService servicio;

    @GetMapping(path = "/{documento}")
    public RespuestaUtil buscarPorDocumento(@PathVariable String documento) {
        try {
            return new RespuestaUtil("Buscar Docente", this.servicio.buscarPorDocumento(documento));
        } catch (Exception e) {
            return new RespuestaUtil("Buscar Docente", "No existe");
        }
    }


}
