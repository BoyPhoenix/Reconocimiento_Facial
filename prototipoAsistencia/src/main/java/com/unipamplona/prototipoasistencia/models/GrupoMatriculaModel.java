package com.unipamplona.prototipoasistencia.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "grupomatricula", schema = "reconocer")
public class GrupoMatriculaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "grma_id")
    private long grma_id;

    @JoinColumn(name = "grup_id", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private GrupoModel grupo;

    @JoinColumn(name = "estu_id", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private EstudianteModel estudiante;

    @Column(name = "grma_fecharegistro", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date grma_fecharegistro;

    public GrupoMatriculaModel() {
    }

    public GrupoMatriculaModel(long grma_id, GrupoModel grupo, EstudianteModel estudiante, Date grma_fecharegistro) {
        this.grma_id = grma_id;
        this.grupo = grupo;
        this.estudiante = estudiante;
        this.grma_fecharegistro = grma_fecharegistro;
    }

    public long getGrma_id() {
        return grma_id;
    }

    public void setGrma_id(long grma_id) {
        this.grma_id = grma_id;
    }

    public GrupoModel getGrupo() {
        return grupo;
    }

    public void setGrupo(GrupoModel grupo) {
        this.grupo = grupo;
    }

    public EstudianteModel getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(EstudianteModel estudiante) {
        this.estudiante = estudiante;
    }

    public Date getGrma_fecharegistro() {
        return grma_fecharegistro;
    }

    public void setGrma_fecharegistro(Date grma_fecharegistro) {
        this.grma_fecharegistro = grma_fecharegistro;
    }
}
