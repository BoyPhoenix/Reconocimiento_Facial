package com.unipamplona.prototipoasistencia.models;
import com.unipamplona.prototipoasistencia.utils.Estado;
import javax.persistence.*;


@Entity
@Table(name = "estudiante", schema = "reconocer")
public class EstudianteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "estu_id")
    private long estu_id;

    @JoinColumn(name = "pers_id", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private PersonaModel persona;

    @JoinColumn(name = "prog_id", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private ProgramaModel programa;

    @Column(name = "estu_estado", nullable = false,
            columnDefinition = "Varchar(30) not null constraint ck_estu_estado check (UPPER(estu_estado) in ('ACTIVO','INACTIVO') )")
    @Enumerated(value = EnumType.STRING)
    private Estado estu_estado;

    @Transient
    private boolean presente;

    public EstudianteModel() {
    }

    public EstudianteModel(long estu_id, PersonaModel persona, ProgramaModel programa, Estado estu_estado) {
        this.estu_id = estu_id;
        this.persona = persona;
        this.programa = programa;
        this.estu_estado = estu_estado;
    }

    public long getEstu_id() {
        return estu_id;
    }

    public void setEstu_id(long estu_id) {
        this.estu_id = estu_id;
    }

    public PersonaModel getPersona() {
        return persona;
    }

    public void setPersona(PersonaModel persona) {
        this.persona = persona;
    }

    public ProgramaModel getPrograma() {
        return programa;
    }

    public void setPrograma(ProgramaModel programa) {
        this.programa = programa;
    }

    public Estado getEstu_estado() {
        return estu_estado;
    }

    public void setEstu_estado(Estado estu_estado) {
        this.estu_estado = estu_estado;
    }

    public boolean isPresente() {
        return presente;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }

    @Override
    public String toString() {
        return "EstudianteModel{" +
                "estu_id=" + estu_id +
                ", persona=" + persona +
                ", programa=" + programa +
                ", estu_estado=" + estu_estado +
                '}';
    }
}
