package com.agendvet.veterinary.infrastructure.adapters.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "persona")
public class EntityPerson {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int codigo;
    @Column(length = 20, nullable = false )
    private String nombres;
    @Column(length = 20, nullable = false )
    private String apellidos;
    @Column(length = 20, nullable = false )
    private int numeroIdentificacion;
    @Column(length = 20, nullable = false )
    private EntityIdType tipoIdentificacion;
    @Column(length = 20, nullable = false )
    private String telefono;


    public EntityPerson(String nombres, String apellidos, int numeroIdentificacion, EntityIdType tipoIdentificacion, String telefono) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numeroIdentificacion = numeroIdentificacion;
        this.tipoIdentificacion = tipoIdentificacion;
        this.telefono = telefono;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(int numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public EntityIdType getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(EntityIdType tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
