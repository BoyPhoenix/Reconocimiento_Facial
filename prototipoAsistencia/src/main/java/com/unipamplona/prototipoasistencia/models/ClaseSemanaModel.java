package com.unipamplona.prototipoasistencia.models;

import com.unipamplona.prototipoasistencia.utils.Estado;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "clasesemana", schema = "reconocer")
public class ClaseSemanaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clse_id")
    private long clse_id;

    @JoinColumn(name = "docl_id", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private DocenteClaseModel docenteClase;

    @Column(name = "clse_fecha", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date clse_fecha;

    @Column(name = "clse_estado", nullable = false,
            columnDefinition = "Varchar(30) not null constraint ck_clse_estado check (UPPER(clse_estado) in ('ACTIVO','INACTIVO') )")
    @Enumerated(value = EnumType.STRING)
    private Estado clse_estado;

    public ClaseSemanaModel() {
    }

    public ClaseSemanaModel(long clse_id, DocenteClaseModel docenteClase, Date clse_fecha, Estado clse_estado) {
        this.clse_id = clse_id;
        this.docenteClase = docenteClase;
        this.clse_fecha = clse_fecha;
        this.clse_estado = clse_estado;
    }

    public long getClse_id() {
        return clse_id;
    }

    public void setClse_id(long clse_id) {
        this.clse_id = clse_id;
    }

    public DocenteClaseModel getDocenteClase() {
        return docenteClase;
    }

    public void setDocenteClase(DocenteClaseModel docenteClase) {
        this.docenteClase = docenteClase;
    }

    public Date getClse_fecha() {
        return clse_fecha;
    }

    public void setClse_fecha(Date clse_fecha) {
        this.clse_fecha = clse_fecha;
    }

    public Estado getClse_estado() {
        return clse_estado;
    }

    public void setClse_estado(Estado clse_estado) {
        this.clse_estado = clse_estado;
    }
}
