package com.unipamplona.prototipoasistencia.models;

import javax.persistence.*;


@Entity
@Table(name = "docenteclase", schema = "reconocer")
public class DocenteClaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "docl_id")
    private long docl_id;

    @JoinColumn(name = "grup_id", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private GrupoModel grupo;

    @JoinColumn(name = "doce_id", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private DocenteModel docente;

    @Column(name = "docl_anio", nullable = false)
    private int docl_anio;

    @Column(name = "docl_periodo", length = 50, nullable = false)
    private String docl_periodo;

    @Column(name = "dia_id", nullable = false)
    private int dia_id;

    @Column(name = "docl_horainicio", length = 50, nullable = false)
    private String docl_horainicio;

    @Column(name = "docl_horafin", length = 50, nullable = false)
    private String docl_horafin;


    public DocenteClaseModel() {
    }

    public DocenteClaseModel(long docl_id, GrupoModel grupo, DocenteModel docente, int docl_anio, String docl_periodo, int dia_id, String docl_horainicio, String docl_horafin) {
        this.docl_id = docl_id;
        this.grupo = grupo;
        this.docente = docente;
        this.docl_anio = docl_anio;
        this.docl_periodo = docl_periodo;
        this.dia_id = dia_id;
        this.docl_horainicio = docl_horainicio;
        this.docl_horafin = docl_horafin;
    }

    public long getDocl_id() {
        return docl_id;
    }

    public void setDocl_id(long docl_id) {
        this.docl_id = docl_id;
    }

    public GrupoModel getGrupo() {
        return grupo;
    }

    public void setGrupo(GrupoModel grupo) {
        this.grupo = grupo;
    }

    public DocenteModel getDocente() {
        return docente;
    }

    public void setDocente(DocenteModel docente) {
        this.docente = docente;
    }

    public int getDocl_anio() {
        return docl_anio;
    }

    public void setDocl_anio(int docl_anio) {
        this.docl_anio = docl_anio;
    }

    public String getDocl_periodo() {
        return docl_periodo;
    }

    public void setDocl_periodo(String docl_periodo) {
        this.docl_periodo = docl_periodo;
    }

    public int getDia_id() {
        return dia_id;
    }

    public void setDia_id(int dia_id) {
        this.dia_id = dia_id;
    }

    public String getDocl_horainicio() {
        return docl_horainicio;
    }

    public void setDocl_horainicio(String docl_horainicio) {
        this.docl_horainicio = docl_horainicio;
    }

    public String getDocl_horafin() {
        return docl_horafin;
    }

    public void setDocl_horafin(String docl_horafin) {
        this.docl_horafin = docl_horafin;
    }
}
