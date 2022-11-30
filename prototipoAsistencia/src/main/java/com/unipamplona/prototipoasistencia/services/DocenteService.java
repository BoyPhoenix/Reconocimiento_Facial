package com.unipamplona.prototipoasistencia.services;

import com.unipamplona.prototipoasistencia.models.DocenteModel;
import com.unipamplona.prototipoasistencia.repositories.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocenteService {

    @Autowired
    public DocenteRepository repositorio;

    public DocenteModel buscarPorDocumento(String documento){
        return this.repositorio.buscarPorDocumento(documento);
    }
}
