package com.unipamplona.prototipoasistencia.models;

import com.unipamplona.prototipoasistencia.utils.Estado;

import javax.persistence.*;

@Entity
@Table(name = "asignatura", schema = "reconocer")
public class AsignaturaModel {
    @Id
    @Column(name = "asig_codigo")
    private long asig_codigo;

    @Column(name = "asig_nombre", length = 500, nullable = false)
    private String asig_nombre;

    @Column(name = "asig_estado", nullable = false,
            columnDefinition = "Varchar(30) not null constraint ck_asig_estado check (UPPER(asig_estado) in ('ACTIVO','INACTIVO') )")
    @Enumerated(value = EnumType.STRING)
    private Estado asig_estado;

    public AsignaturaModel() {
    }

    public AsignaturaModel(long asig_codigo, String asig_nombre, Estado asig_estado) {
        this.asig_codigo = asig_codigo;
        this.asig_nombre = asig_nombre;
        this.asig_estado = asig_estado;
    }

    public long getAsig_codigo() {
        return asig_codigo;
    }

    public void setAsig_codigo(long asig_codigo) {
        this.asig_codigo = asig_codigo;
    }

    public String getAsig_nombre() {
        return asig_nombre;
    }

    public void setAsig_nombre(String asig_nombre) {
        this.asig_nombre = asig_nombre;
    }

    public Estado getAsig_estado() {
        return asig_estado;
    }

    public void setAsig_estado(Estado asig_estado) {
        this.asig_estado = asig_estado;
    }
}
