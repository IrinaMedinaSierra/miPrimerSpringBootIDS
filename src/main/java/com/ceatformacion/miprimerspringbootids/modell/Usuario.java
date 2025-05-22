package com.ceatformacion.miprimerspringbootids.modell;

public class Usuario {
    private String nombre;
    private String apellido;
    private String username;
    private String ciudad;
    private String provincia;
    private String cp;


    public Usuario(String nombre, String apellido, String username, String ciudad, String provincia, String cp) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.username = username;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.cp = cp;
    }

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", username='" + username + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", provincia='" + provincia + '\'' +
                ", cp='" + cp + '\'' +
                '}';
    }
}
