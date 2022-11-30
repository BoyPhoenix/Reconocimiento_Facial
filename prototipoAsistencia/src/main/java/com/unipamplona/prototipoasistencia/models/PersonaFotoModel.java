package com.unipamplona.prototipoasistencia.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "personafoto", schema = "reconocer")
public class PersonaFotoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pefo_id")
    private long pefo_id;

    @JoinColumn(name = "pers_id", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private PersonaModel persona;

    @Column(name = "pefo_imagen", nullable = false, columnDefinition = "text")
    private String pefo_imagen;

    @Column(name = "pefo_fechacreacion", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date pefo_fechacreacion;

    public PersonaFotoModel() {
    }

    public PersonaFotoModel(long pefo_id, PersonaModel persona, String pefo_imagen, Date pefo_fechacreacion) {
        this.pefo_id = pefo_id;
        this.persona = persona;
        this.pefo_imagen = pefo_imagen;
        this.pefo_fechacreacion = pefo_fechacreacion;
    }

    public long getPefo_id() {
        return pefo_id;
    }

    public void setPefo_id(long pefo_id) {
        this.pefo_id = pefo_id;
    }

    public PersonaModel getPersona() {
        return persona;
    }

    public void setPersona(PersonaModel persona) {
        this.persona = persona;
    }

    public String getPefo_imagen() {
        return pefo_imagen;
    }

    public void setPefo_imagen(String pefo_imagen) {
        this.pefo_imagen = pefo_imagen;
    }

    public Date getPefo_fechacreacion() {
        return pefo_fechacreacion;
    }

    public void setPefo_fechacreacion(Date pefo_fechacreacion) {
        this.pefo_fechacreacion = pefo_fechacreacion;
    }
}
