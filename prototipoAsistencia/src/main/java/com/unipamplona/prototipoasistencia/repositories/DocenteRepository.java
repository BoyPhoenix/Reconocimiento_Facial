package com.unipamplona.prototipoasistencia.repositories;

import com.unipamplona.prototipoasistencia.models.DocenteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DocenteRepository extends JpaRepository<DocenteModel, Long> {

    @Query(value = "select d.* " +
            "from reconocer.persona as p, reconocer.docente as d " +
            "where p.pers_id = d.pers_id and p.pers_documento = ?1 and d.doce_estado = 'ACTIVO' ", nativeQuery = true)
    DocenteModel buscarPorDocumento(String documento);

}
