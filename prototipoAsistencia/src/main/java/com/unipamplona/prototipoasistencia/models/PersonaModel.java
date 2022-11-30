package com.unipamplona.prototipoasistencia.models;

import javax.persistence.*;

@Entity
@Table(name = "persona", schema = "reconocer")
public class PersonaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pers_id")
    private long pers_id;
    @Column(name = "pers_documento", length = 50, nullable = false, unique = true)
    private String pers_documento;
    @Column(name = "pers_nombres", length = 500, nullable = false)
    private String pers_nombres;
    @Column(name = "pers_apellidos", length = 100, nullable = false)
    private String pers_apellidos;
    @Column(name = "pers_correo", length = 200, nullable = false)
    private String pers_correo;
    @Column(name = "pers_telefono", length = 200, nullable = false)
    private String pers_telefono;

    public PersonaModel() {
    }

    public PersonaModel(long pers_id, String pers_documento, String pers_nombres, String pers_apellidos, String pers_correo, String pers_telefono) {
        this.pers_id = pers_id;
        this.pers_documento = pers_documento;
        this.pers_nombres = pers_nombres;
        this.pers_apellidos = pers_apellidos;
        this.pers_correo = pers_correo;
        this.pers_telefono = pers_telefono;
    }

    public long getPers_id() {
        return pers_id;
    }

    public void setPers_id(long pers_id) {
        this.pers_id = pers_id;
    }

    public String getPers_documento() {
        return pers_documento;
    }

    public void setPers_documento(String pers_documento) {
        this.pers_documento = pers_documento;
    }

    public String getPers_nombres() {
        return pers_nombres;
    }

    public void setPers_nombres(String pers_nombres) {
        this.pers_nombres = pers_nombres;
    }

    public String getPers_apellidos() {
        return pers_apellidos;
    }

    public void setPers_apellidos(String pers_apellidos) {
        this.pers_apellidos = pers_apellidos;
    }

    public String getPers_correo() {
        return pers_correo;
    }

    public void setPers_correo(String pers_correo) {
        this.pers_correo = pers_correo;
    }

    public String getPers_telefono() {
        return pers_telefono;
    }

    public void setPers_telefono(String pers_telefono) {
        this.pers_telefono = pers_telefono;
    }

    @Override
    public String toString() {
        return "PersonaModel{" +
                "pers_id=" + pers_id +
                ", pers_documento='" + pers_documento + '\'' +
                ", pers_nombres='" + pers_nombres + '\'' +
                ", pers_apellidos='" + pers_apellidos + '\'' +
                ", pers_correo='" + pers_correo + '\'' +
                ", pers_telefono='" + pers_telefono + '\'' +
                '}';
    }
}
