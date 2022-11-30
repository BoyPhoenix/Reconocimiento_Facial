package com.unipamplona.prototipoasistencia.repositories;

import com.unipamplona.prototipoasistencia.models.EstudianteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EstudianteRepository extends JpaRepository<EstudianteModel, Long> {
    @Query(value = "SELECT e.* " +
            "FROM reconocer.docenteclase as dc, reconocer.grupo as g, reconocer.grupomatricula as gm, " +
            "reconocer.estudiante as e, reconocer.persona as pe, " +
            "reconocer.docente as d, reconocer.persona as pd " +
            "WHERE dc.grup_id = g.grup_id and gm.grup_id = g.grup_id and gm.estu_id = e.estu_id " +
            "and e.pers_id = pe.pers_id and  dc.docl_id = ?1 and e.estu_estado = 'ACTIVO' " +
            "and dc.doce_id = d.doce_id and d.pers_id = pd.pers_id " +
            "ORDER by pe.pers_apellidos, pe.pers_nombres ", nativeQuery = true)
    List<EstudianteModel> estudiantesPorClase(long docl_id);
}
