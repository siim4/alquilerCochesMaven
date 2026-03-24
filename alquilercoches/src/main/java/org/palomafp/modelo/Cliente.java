package org.palomafp.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa a un cliente en la app de alquiler de coches. 
 * @author Eduardo Vargas y Sima
 */
public class Cliente {

    // Código que identifica al cliente. 
    private String codigoCliente;

    //documento nacional de identidad 
    private String DNI;

    // Nombre  del cliente.
    private String nombre;

    // Dirección  del cliente.
    private String direccion;

    // Número de teléfono del cliente.
    private String telefono;

    // Lista de reservas relacionadas al cliente. 
    private List<Reserva> reservas;

    /**
     * Constructor por defecto que inicializa la lista de reservas como una lista vacía.
     */
    public Cliente() {
        this.reservas = new ArrayList<>();
    }

    /**
     * Constructor con parámetros para inicializar un cliente 
     *
     * @param codigoCliente Código único del cliente
     * @param DNI Documento Nacional de Identidad 
     * @param nombre Nombre  del cliente
     * @param direccion Dirección  del cliente
     * @param telefono numero de teléfono del cliente
     */
    public Cliente(String codigoCliente, String DNI, String nombre, String direccion, String telefono) {
        this.codigoCliente = codigoCliente;
        this.DNI = DNI;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.reservas = new ArrayList<>();
    }

    /**
     * Obtiene el código del cliente.
     *
     * @return El código único del cliente.
     */
    public String getCodigoCliente() {
        return codigoCliente;
    }

    /**
     * Establece el código del cliente.
     *
     * @param codigoCliente El código único del cliente.
     */
    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    /**
     * Obtiene el DNI del cliente.
     *
     * @return el DNI del cliente.
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * Establece el DNI del cliente.
     *
     * @param DNI El DNI del cliente.
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /**
     * Obtiene el nombre del cliente.
     *
     * @return el nombre  del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cliente.
     *
     * @param nombre El nombre  del cliente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la dirección del cliente.
     *
     * @return La dirección  del cliente.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección del cliente
     *
     * @param direccion La dirección  del cliente
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtiene el teléfono del cliente
     * @return El número de teléfono del cliente
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el teléfono del cliente
     *
     * @param telefono El número de teléfono del cliente
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene la lista de reservas del cliente
     *
     * @return La lista de reservas asociadas al cliente
     */
    public List<Reserva> getReservas() {
        return reservas;
    }

    /**
     * Establece la lista de reservas del cliente
     *
     * @param reservas La lista de reservas a asignar al cliente
     */
    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    /**
     * Agrega una reserva a la lista de reservas del cliente.
     *
     * @param reserva La reserva que se va a añadir a la lista de reservas del cliente
     */
    public void addReserva(Reserva reserva) {
        this.reservas.add(reserva);
    }

    /**
     * borra una reserva de la lista de reservas del cliente.
     *
     * @param reserva La reserva a eliminar.
     */
    public void removeReserva(Reserva reserva) {
        this.reservas.remove(reserva);
    }

    /**
     *Metodo toString que muestra la informacion del cliente formateada
     * @return la información del cliente 
     */
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
