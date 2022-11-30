package com.unipamplona.prototipoasistencia.repositories;

import com.unipamplona.prototipoasistencia.models.ClaseSemanaModel;
import com.unipamplona.prototipoasistencia.models.DocenteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClaseSemanaRepository extends JpaRepository<ClaseSemanaModel, Long> {

    @Query(value = "select cs.* " +
            "from reconocer.clasesemana as cs " +
            "where cs.docl_id = ?1 and cs.clse_estado = 'ACTIVO' " +
            "order by cs.clse_fecha limit 1 ", nativeQuery = true)
    ClaseSemanaModel buscarClaseActiva(long docl_id);

    @Query(value = "select cs.* " +
            "from reconocer.clasesemana as cs " +
            "where cs.clse_id = ?1 and cs.clse_estado = 'ACTIVO' ", nativeQuery = true)
    ClaseSemanaModel buscarPorId(long clse_id);
}
