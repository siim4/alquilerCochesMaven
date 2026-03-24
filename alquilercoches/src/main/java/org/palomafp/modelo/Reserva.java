package org.palomafp.modelo;

import java.util.Date;

/**
 * Clase que representa una reserva en la app de alquiler de coches
 * clase que contiene  información sobre fechas, precio entre otras cosas
 *
 * @author Eduardo Vargas y Sima
 */
public class Reserva {

    // Código único de la reserva
    private String codigoReserva;

    // Fecha de inicio de la reserva
    private Date fechaInicio;

    // Fecha de fin de la reserva
    private Date fechaFin;

    // Precio total de la reserva
    private double precio;

    // Cliente asociado a la reserva
    private Cliente cliente;

    // Coche asociado a la reserva
    private Coche coche;

    /**
     * Constructor con parámetros para inicializar una reserva
     *
     * @param codigoReserva código único de la reserva
     * @param fechaInicio fecha de inicio
     * @param fechaFin fecha de fin
     * @param precio precio de la reserva
     * @param cliente cliente que realiza la reserva
     * @param coche coche reservado
     */
    public Reserva(String codigoReserva, Date fechaInicio, Date fechaFin, double precio, Cliente cliente, Coche coche) {
        this.codigoReserva = codigoReserva;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precio = precio;
        this.cliente = cliente;
        this.coche = coche;
    }

    /**
     * Constructor sin parámetros
     */
    public Reserva() {

    }

    /**
     * Obtiene el código de la reserva
     *
     * @return Código único de la reserva
     */
    public String getCodigoReserva() {
        return codigoReserva;
    }

    /**
     * Establece el código de la reserva
     *
     * @param codigoReserva Código único de la reserva
     */
    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    /**
     * Obtiene la fecha de inicio de la reserva
     *
     * @return la fecha de inicio de la reserva
     */
    public Date getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Establece la fecha de inicio de la reserva
     *
     * @param fechaInicio Fecha de inicio
     */
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * Obtiene la fecha de fin de la reserva
     *
     * @return la fecha de fin
     */
    public Date getFechaFin() {
        return fechaFin;
    }

    /**
     * Establece la fecha de fin de la reserva
     *
     * @param fechaFin Fecha de fin
     */
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    /**
     * Obtiene el precio de la reserva
     *
     * @return el precio de la reserva
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio de la reserva
     *
     * @param precio Precio de la reserva
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el cliente asociado a la reserva
     *
     * @return Cliente de la reserva
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Establece el cliente asociado a la reserva
     *
     * @param cliente Cliente de la reserva
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Obtiene el coche asociado a la reserva
     *
     * @return el coche de la reserva
     */
    public Coche getCoche() {
        return coche;
    }

    /**
     * Establece el coche asociado a la reserva
     *
     * @param coche Coche de la reserva
     */
    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    /**
     *Metodo toString que muestra la informacion de la reserva 
     * @return la informacion de la reserva
     */
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
