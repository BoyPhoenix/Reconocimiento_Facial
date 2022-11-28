package com.unipamplona.prototipoasistencia.models;

import com.unipamplona.prototipoasistencia.utils.Estado;

import javax.persistence.*;

@Entity
@Table(name = "programa", schema = "reconocer")
public class ProgramaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prog_id")
    private long prog_id;

    @Column(name = "prog_codigo", length = 200, nullable = false)
    private String prog_codigo;

    @Column(name = "prog_nombre", length = 500, nullable = false)
    private String prog_nombre;

    @Column(name = "prog_estado", nullable = false,
            columnDefinition = "Varchar(30) not null constraint ck_prog_estado check (UPPER(prog_estado) in ('ACTIVO','INACTIVO') )")
    @Enumerated(value = EnumType.STRING)
    private Estado prog_estado;

    @Column(name = "prog_sede", length = 500, nullable = false)
    private String prog_sede;

    public ProgramaModel() {
    }

    public ProgramaModel(long prog_id, String prog_codigo, String prog_nombre, Estado prog_estado, String prog_sede) {
        this.prog_id = prog_id;
        this.prog_codigo = prog_codigo;
        this.prog_nombre = prog_nombre;
        this.prog_estado = prog_estado;
        this.prog_sede = prog_sede;
    }

    public long getProg_id() {
        return prog_id;
    }

    public void setProg_id(long prog_id) {
        this.prog_id = prog_id;
    }

    public String getProg_codigo() {
        return prog_codigo;
    }

    public void setProg_codigo(String prog_codigo) {
        this.prog_codigo = prog_codigo;
    }

    public String getProg_nombre() {
        return prog_nombre;
    }

    public void setProg_nombre(String prog_nombre) {
        this.prog_nombre = prog_nombre;
    }

    public Estado getProg_estado() {
        return prog_estado;
    }

    public void setProg_estado(Estado prog_estado) {
        this.prog_estado = prog_estado;
    }

    public String getProg_sede() {
        return prog_sede;
    }

    public void setProg_sede(String prog_sede) {
        this.prog_sede = prog_sede;
    }
}
