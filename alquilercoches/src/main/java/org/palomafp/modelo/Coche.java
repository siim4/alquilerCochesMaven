package org.palomafp.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un coche en la app de alquiler de coches *
 * @author Eduardo Vargas y Sima
 */
public class Coche {

    // Matrícula del coche. 
    private String matricula;

    // Modelo del coche
    private String modelo;

    // Color del coche
    private String color;

    // Marca del coche
    private String marca;

    // Garaje donde esta el coche
    private Garaje garaje;

    // Lista de reservas asociadas al coche.
    private List<Reserva> reservas;

    /**
     * Constructor sin parámetros que inicializa la lista de reservas vacía
     */
    public Coche() {
        this.reservas = new ArrayList<>();
    }

    /**
     * Constructor con parámetros para inicializar un coche con sus atributos y una lista de reservas vacía
     * @param matricula matrícula del coche
     * @param modelo modelo del coche
     * @param color color del coche
     * @param marca marca del coche
     * @param garaje garaje donde se encuentra el coche
     */
    public Coche(String matricula, String modelo, String color, String marca, Garaje garaje) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
        this.marca = marca;
        this.garaje = garaje;
        this.reservas = new ArrayList<>();
    }

    /**
     * Obtiene la matrícula del coche
     *
     * @return la matrícula del coche
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Establece la matrícula del coche.
     *
     * @param matricula es la matrícula del coche
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Obtiene el modelo del coche
     *
     * @return el modelo del coche
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * establece el modelo del coche
     *
     * @param modelo es el modelo del coche
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Obtiene el color del coche.
     *
     * @return Color del coche
     */
    public String getColor() {
        return color;
    }

    /**
     * Establece el color del coche
     *
     * @param color el color del coche
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Obtiene la marca del coche.
     *
     * @return la marca del coche
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establece la marca del coche
     *
     * @param marca es la marca del coche
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Obtiene el garaje asociado al coche
     *
     * @return Garaje donde esta  el coche
     */
    public Garaje getGaraje() {
        return garaje;
    }

    /**
     * Establece el garaje asociado al coche.
     *
     * @param garaje es el garaje donde se encuentra el coche
     */
    public void setGaraje(Garaje garaje) {
        this.garaje = garaje;
    }

    /**
     * Obtiene la lista de reservas asociadas al coche.
     *
     * @return la lista de reservas del coche
     */
    public List<Reserva> getReservas() {
        return reservas;
    }

    /**
     * Establece la lista de reservas asociadas al coche.
     *
     * @param reservas Lista de reservas del coche.
     */
    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    /**
     * Agrega una reserva a la lista de reservas del coche.
     *
     * @param reserva Reserva que se va a añadir
     */
    public void addReserva(Reserva reserva) {
        this.reservas.add(reserva);
    }

    /**
     * elimina una reserva de la lista de reservas del coche
     *
     * @param reserva reserva que se va a eliminar
     */
    public void removeReserva(Reserva reserva) {
        this.reservas.remove(reserva);
    }

    /**
     * Metodo toString que muestra la informacion del coche formateada
     *
     * @return La informacion del coche 
     */
    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", garaje=" + (garaje != null ? garaje.getCodigoGaraje() : "null") +
                '}';
    }
}
