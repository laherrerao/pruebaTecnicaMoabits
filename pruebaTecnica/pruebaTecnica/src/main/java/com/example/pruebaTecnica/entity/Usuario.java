package com.example.pruebaTecnica.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;


@Entity
@Table (name="usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_usuario")
    private long idUsuario;

    @javax.validation.constraints.NotEmpty
    @Column(name="identificacion")
    private String identificacion;

    @javax.validation.constraints.NotEmpty
    @Column(name="nombre")
    private String nombre;

    @Column(name="edad")
    private int edad;

    @javax.validation.constraints.NotEmpty
    @Column(name="telefono")
    private String telefono;

    @javax.validation.constraints.NotEmpty
    @Column(name="direccion")
    private String direccion;
    @javax.validation.constraints.NotEmpty
    @Column(name="email")
    private String email;
    @javax.validation.constraints.NotEmpty
    @Column(name="login")
    private String login;
    @javax.validation.constraints.NotEmpty
    @Column(name="password")
    private String password;
    @NotNull
    @Column(name="rol")
    private Rol rol;


    public Usuario() {
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", identificacion='" + identificacion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", email='" + email + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", rol=" + rol +
                '}';
    }
}
