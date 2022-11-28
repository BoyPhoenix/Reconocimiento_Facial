package com.unipamplona.prototipoasistencia.models;

import com.unipamplona.prototipoasistencia.utils.Estado;

import javax.persistence.*;

@Entity
@Table(name = "docente", schema = "reconocer")
public class DocenteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doce_id")
    private long doce_id;

    @JoinColumn(name = "pers_id", nullable = false, unique = true)
    @ManyToOne(fetch = FetchType.EAGER)
    private PersonaModel persona;

    @Column(name = "doce_estado", nullable = false,
            columnDefinition = "Varchar(30) not null constraint ck_doce_estado check (UPPER(doce_estado) in ('ACTIVO','INACTIVO') )")
    @Enumerated(value = EnumType.STRING)
    private Estado doce_estado;

    public DocenteModel() {
    }

    public DocenteModel(long doce_id, PersonaModel persona, Estado doce_estado) {
        this.doce_id = doce_id;
        this.persona = persona;
        this.doce_estado = doce_estado;
    }

    public long getDoce_id() {
        return doce_id;
    }

    public void setDoce_id(long doce_id) {
        this.doce_id = doce_id;
    }

    public PersonaModel getPersona() {
        return persona;
    }

    public void setPersona(PersonaModel persona) {
        this.persona = persona;
    }

    public Estado getDoce_estado() {
        return doce_estado;
    }

    public void setDoce_estado(Estado doce_estado) {
        this.doce_estado = doce_estado;
    }
}
