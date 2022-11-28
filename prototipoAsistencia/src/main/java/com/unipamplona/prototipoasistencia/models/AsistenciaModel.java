package com.unipamplona.prototipoasistencia.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "asistencia", schema = "reconocer")
public class AsistenciaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "asis_id")
    private long asis_id;

    @JsonIgnore
    @JoinColumn(name = "clse_id", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private ClaseSemanaModel claseSemana;

    @JoinColumn(name = "estu_id", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    @Fetch(FetchMode.JOIN)
    private EstudianteModel estudiante;

    @Column(name = "asis_fecharegistro", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date asis_fecharegistro;


    public AsistenciaModel() {
    }

    public AsistenciaModel(long asis_id, ClaseSemanaModel claseSemana, EstudianteModel estudiante, Date asis_fecharegistro) {
        this.asis_id = asis_id;
        this.claseSemana = claseSemana;
        this.estudiante = estudiante;
        this.asis_fecharegistro = asis_fecharegistro;
    }

    public AsistenciaModel(long asis_id, EstudianteModel estudiante, Date asis_fecharegistro) {
        this.asis_id = asis_id;
        this.estudiante = estudiante;
        this.asis_fecharegistro = asis_fecharegistro;
    }

    public long getAsis_id() {
        return asis_id;
    }

    public void setAsis_id(long asis_id) {
        this.asis_id = asis_id;
    }

    public ClaseSemanaModel getClaseSemana() {
        return claseSemana;
    }

    public void setClaseSemana(ClaseSemanaModel claseSemana) {
        this.claseSemana = claseSemana;
    }

    public EstudianteModel getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(EstudianteModel estudiante) {
        this.estudiante = estudiante;
    }

    public Date getAsis_fecharegistro() {
        return asis_fecharegistro;
    }

    public void setAsis_fecharegistro(Date asis_fecharegistro) {
        this.asis_fecharegistro = asis_fecharegistro;
    }
}
