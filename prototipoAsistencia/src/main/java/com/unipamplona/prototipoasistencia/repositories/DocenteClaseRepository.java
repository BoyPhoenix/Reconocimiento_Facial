package com.unipamplona.prototipoasistencia.repositories;

import com.unipamplona.prototipoasistencia.models.DocenteClaseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DocenteClaseRepository extends JpaRepository<DocenteClaseModel, Long> {

    @Query(value = "select dc.* " +
            "from reconocer.persona as p, reconocer.docente as d, " +
            "reconocer.docenteclase as dc " +
            "where p.pers_id = d.pers_id and dc.doce_id = d.doce_id and " +
            "p.pers_documento = ?1 and d.doce_estado = 'ACTIVO' ", nativeQuery = true)
    List<DocenteClaseModel> buscarPorDocumento(String documento);

}
