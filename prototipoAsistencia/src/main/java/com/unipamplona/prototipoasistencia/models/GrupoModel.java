package com.unipamplona.prototipoasistencia.models;

import com.unipamplona.prototipoasistencia.utils.Estado;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "grupo", schema = "reconocer")
public class GrupoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "grup_id")
    private long grup_id;

    @JoinColumn(name = "asig_codigo", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private AsignaturaModel asignatura;

    @Column(name = "grup_codigo", length = 50, nullable = false)
    private String grup_codigo;

    @Column(name = "grup_nombre", length = 50, nullable = false)
    private String grup_nombre;

    @Column(name = "grup_estado", nullable = false,
            columnDefinition = "Varchar(30) not null constraint ck_grup_estado check (UPPER(grup_estado) in ('ACTIVO','INACTIVO') )")
    @Enumerated(value = EnumType.STRING)
    private Estado grup_estado;

    @Column(name = "grup_anio", nullable = false)
    private int grup_anio;

    @Column(name = "grup_periodo", length = 50, nullable = false)
    private String grup_periodo;

    @Column(name = "grup_fechacreacion", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date grup_fechacreacion;

    public GrupoModel() {
    }

    public GrupoModel(long grup_id, AsignaturaModel asignatura, String grup_codigo, String grup_nombre, Estado grup_estado, int grup_anio, String grup_periodo, Date grup_fechacreacion) {
        this.grup_id = grup_id;
        this.asignatura = asignatura;
        this.grup_codigo = grup_codigo;
        this.grup_nombre = grup_nombre;
        this.grup_estado = grup_estado;
        this.grup_anio = grup_anio;
        this.grup_periodo = grup_periodo;
        this.grup_fechacreacion = grup_fechacreacion;
    }

    public long getGrup_id() {
        return grup_id;
    }

    public void setGrup_id(long grup_id) {
        this.grup_id = grup_id;
    }

    public AsignaturaModel getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(AsignaturaModel asignatura) {
        this.asignatura = asignatura;
    }

    public String getGrup_codigo() {
        return grup_codigo;
    }

    public void setGrup_codigo(String grup_codigo) {
        this.grup_codigo = grup_codigo;
    }

    public String getGrup_nombre() {
        return grup_nombre;
    }

    public void setGrup_nombre(String grup_nombre) {
        this.grup_nombre = grup_nombre;
    }

    public Estado getGrup_estado() {
        return grup_estado;
    }

    public void setGrup_estado(Estado grup_estado) {
        this.grup_estado = grup_estado;
    }

    public int getGrup_anio() {
        return grup_anio;
    }

    public void setGrup_anio(int grup_anio) {
        this.grup_anio = grup_anio;
    }

    public String getGrup_periodo() {
        return grup_periodo;
    }

    public void setGrup_periodo(String grup_periodo) {
        this.grup_periodo = grup_periodo;
    }

    public Date getGrup_fechacreacion() {
        return grup_fechacreacion;
    }

    public void setGrup_fechacreacion(Date grup_fechacreacion) {
        this.grup_fechacreacion = grup_fechacreacion;
    }
}
