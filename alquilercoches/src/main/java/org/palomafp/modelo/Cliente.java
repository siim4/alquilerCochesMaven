package org.palomafp.modelo;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String codigoCliente;
    private String DNI;
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Reserva> reservas;

    public Cliente() {
        this.reservas = new ArrayList<>();
    }

    public Cliente(String codigoCliente, String DNI, String nombre, String direccion, String telefono) {
        this.codigoCliente = codigoCliente;
        this.DNI = DNI;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.reservas = new ArrayList<>();
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public void addReserva(Reserva reserva) {
        this.reservas.add(reserva);
    }

    public void removeReserva(Reserva reserva) {
        this.reservas.remove(reserva);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codigoCliente='" + codigoCliente + '\'' +
                ", DNI='" + DNI + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
