package com.unipamplona.prototipoasistencia.controllers;

import com.unipamplona.prototipoasistencia.models.AsistenciaModel;
import com.unipamplona.prototipoasistencia.models.ClaseSemanaModel;
import com.unipamplona.prototipoasistencia.services.AsistenciaService;
import com.unipamplona.prototipoasistencia.services.ClaseSemanaService;
import com.unipamplona.prototipoasistencia.utils.Estado;
import com.unipamplona.prototipoasistencia.utils.RespuestaUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;

@RestController
@RequestMapping("/attendance")
public class AsistenciaController {

    @Autowired
    AsistenciaService servicio;

    @Autowired
    ClaseSemanaService servicioClaseSemana;

    @GetMapping(path = "/{docl_id}/{clse_id}")
    public RespuestaUtil estudiantesPorClase(@PathVariable long docl_id, @PathVariable long clse_id) {
        try {
            ClaseSemanaModel buscar = this.servicioClaseSemana.buscarPorId(clse_id);
            if (buscar != null) {
                return new RespuestaUtil("Listar Asistencia",
                        this.servicio.estudiantesPorClase(docl_id, clse_id));
            }
            return new RespuestaUtil("Listar Asistencia",
                    new ArrayList<AsistenciaModel>());
        } catch (Exception e) {
            return new RespuestaUtil("Listar Asistencia", "Sin informacion");
        }
    }

    @PostMapping(path = "/{clse_id}")
    public RespuestaUtil tomarAsistencia(@PathVariable long clse_id,
                                         @RequestBody AsistenciaModel asistencia) {
        try {
            if (this.servicioClaseSemana.buscarPorId(clse_id) != null) {
                if (this.servicio.buscarEstudiante(clse_id, asistencia.getEstudiante().getEstu_id()) == null) {
                    asistencia.setClaseSemana(new ClaseSemanaModel());
                    asistencia.getClaseSemana().setClse_id(clse_id);
                    asistencia.setAsis_fecharegistro(new Date(System.currentTimeMillis()));
                    return new RespuestaUtil("Tomar asistencia", this.servicio.tomarAsistencia(asistencia));
                } else {
                    return new RespuestaUtil("Tomar asistencia", "Ya existe el estudiante");
                }
            } else {
                return new RespuestaUtil("Tomar asistencia", "clase no disponible");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new RespuestaUtil("Tomar asistencia", "Revisar los datos");
        }
    }
}
