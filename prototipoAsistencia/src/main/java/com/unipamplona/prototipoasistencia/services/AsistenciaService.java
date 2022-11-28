package com.unipamplona.prototipoasistencia.services;

import com.unipamplona.prototipoasistencia.models.AsistenciaModel;
import com.unipamplona.prototipoasistencia.models.ClaseSemanaModel;
import com.unipamplona.prototipoasistencia.models.EstudianteModel;
import com.unipamplona.prototipoasistencia.repositories.AsistenciaRepository;
import com.unipamplona.prototipoasistencia.repositories.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

@Service
public class AsistenciaService {

    @Autowired
    public AsistenciaRepository repositorio;

    @Autowired
    public EstudianteRepository repositorioEstudiante;

    public List<AsistenciaModel> estudiantesPorClase(long docl_id, long clse_id) {
        List<AsistenciaModel> asis = this.repositorio.estudiantesPorClase(docl_id, clse_id);
        List<EstudianteModel> estu = this.repositorioEstudiante.estudiantesPorClase(docl_id);
        boolean encontrar;
        for (int i = 0; i < estu.size(); i++) {
            encontrar = false;
            for (int k = 0; k < asis.size(); k++) {
                if (estu.get(i).getEstu_id() == asis.get(k).getEstudiante().getEstu_id()) {
                    encontrar = true;
                    break;
                }
            }
            if (!encontrar) {
                asis.add(new AsistenciaModel(0, estu.get(i), new Date(System.currentTimeMillis())));
            }
        }

        Collections.sort(asis, new Comparator<AsistenciaModel>() {
            @Override
            public int compare(AsistenciaModel o1, AsistenciaModel o2) {
                String a1 = o1.getEstudiante().getPersona().getPers_apellidos() + " " + o1.getEstudiante().getPersona().getPers_nombres();
                String a2 = o2.getEstudiante().getPersona().getPers_apellidos() + " " + o2.getEstudiante().getPersona().getPers_nombres();
                return a1.compareToIgnoreCase(a2);
            }
        });

        return asis;
    }

    public AsistenciaModel tomarAsistencia(AsistenciaModel asistencia) {
        return this.repositorio.save(asistencia);
    }

    public AsistenciaModel buscarEstudiante(long clse_id, long estu_id){
        return  this.repositorio.buscarEstudiante(clse_id,estu_id);
    }
}
