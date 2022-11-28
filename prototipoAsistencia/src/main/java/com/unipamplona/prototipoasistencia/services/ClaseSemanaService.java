package com.unipamplona.prototipoasistencia.services;

import com.unipamplona.prototipoasistencia.models.ClaseSemanaModel;
import com.unipamplona.prototipoasistencia.repositories.ClaseSemanaRepository;
import com.unipamplona.prototipoasistencia.utils.Estado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClaseSemanaService {

    @Autowired
    public ClaseSemanaRepository repositorio;

    public ClaseSemanaModel agregar(ClaseSemanaModel claseSemana) {
        return this.repositorio.save(claseSemana);
    }

    public ClaseSemanaModel buscarClaseActiva(long docl_id){
        return this.repositorio.buscarClaseActiva(docl_id);
    }

    public ClaseSemanaModel buscarPorId(long clse_id){
        return this.repositorio.buscarPorId(clse_id);
    }

    public ClaseSemanaModel terminarClase(long id) {
        return this.repositorio.findById(id)
                .map(claseSemana -> {
                    claseSemana.setClse_estado(Estado.INACTIVO);
                    return this.repositorio.save(claseSemana);
                }).get();
    }

}
