package com.unipamplona.prototipoasistencia.services;

import com.unipamplona.prototipoasistencia.models.DocenteClaseModel;
import com.unipamplona.prototipoasistencia.repositories.DocenteClaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocenteClaseService {

    @Autowired
    public DocenteClaseRepository repositorio;

    public List<DocenteClaseModel> buscarPorDocumento(String documento){
        return this.repositorio.buscarPorDocumento(documento);
    }

}
