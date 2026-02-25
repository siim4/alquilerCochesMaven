package org.palomafp.modelo;

import java.util.Date;

public class Reserva {
    private String codigoReserva;
    private Date fechaInicio;
    private Date fechaFin;
    private double precio;
    private Cliente cliente;
    private Coche coche;

   

    public Reserva(String codigoReserva, Date fechaInicio, Date fechaFin, double precio, Cliente cliente, Coche coche) {
        this.codigoReserva = codigoReserva;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precio = precio;
        this.cliente = cliente;
        this.coche = coche;
    }

    public Reserva() {

    }

    public String getCodigoReserva() {
        return codigoReserva;
    }

    



    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "codigoReserva='" + codigoReserva + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", precio=" + precio +
                ", cliente=" + (cliente != null ? cliente.getNombre() : "null") +
                ", coche=" + (coche != null ? coche.getMatricula() : "null") +
                '}';
    }
}
