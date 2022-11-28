package com.unipamplona.prototipoasistencia.repositories;

import com.unipamplona.prototipoasistencia.models.AsistenciaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AsistenciaRepository extends JpaRepository<AsistenciaModel, Long> {

    @Query(value = "SELECT s.* " +
            "from reconocer.asistencia as s, reconocer.clasesemana as cs, " +
            "reconocer.docenteclase as dc,reconocer.docente as d, reconocer.persona as pd " +
            "where s.clse_id = cs.clse_id and cs.clse_id = ?2 and cs.clse_estado = 'ACTIVO' " +
            "and dc.doce_id = d.doce_id and d.pers_id = pd.pers_id " +
            "and dc.docl_id = cs.docl_id and dc.docl_id = ?1 ", nativeQuery = true)
    List<AsistenciaModel> estudiantesPorClase(long docl_id, long clse_id);

    @Query(value = "select * " +
            "from reconocer.asistencia as a " +
            "where a.clse_id = ?1 and a.estu_id = ?2 ", nativeQuery = true)
    AsistenciaModel buscarEstudiante(long clse_id, long estu_id);
}
