package com.unipamplona.prototipoasistencia.controllers;

import com.unipamplona.prototipoasistencia.models.ClaseSemanaModel;
import com.unipamplona.prototipoasistencia.services.ClaseSemanaService;
import com.unipamplona.prototipoasistencia.services.DocenteClaseService;
import com.unipamplona.prototipoasistencia.utils.Estado;
import com.unipamplona.prototipoasistencia.utils.RespuestaUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/classweek")
public class ClaseSemanaController {

    @Autowired
    ClaseSemanaService servicio;

    @PostMapping()
    public RespuestaUtil agregar(@RequestBody ClaseSemanaModel claseSemana) {
        try {
            ClaseSemanaModel buscar = servicio.buscarClaseActiva(claseSemana.getDocenteClase().getDocl_id());
            if (buscar == null) {
                claseSemana.setClse_fecha(new Date(System.currentTimeMillis()));
                claseSemana.setClse_estado(Estado.ACTIVO);
                return new RespuestaUtil("Agregar Clase Semana", this.servicio.agregar(claseSemana));
            } else {
                return new RespuestaUtil("Agregar Clase Semana", buscar);
            }

        } catch (Exception e) {
            return new RespuestaUtil("Agregar Clase Semana", "Revisar los datos");
        }
    }

    @PatchMapping(path = "/{id}")
    public RespuestaUtil terminarClase(@PathVariable Long id) {
        try {
            return new RespuestaUtil("Terminar Clase Semana", this.servicio.terminarClase(id));
        } catch (Exception e) {
            return new RespuestaUtil("Terminar Clase Semana", "No existe");
        }
    }


}
