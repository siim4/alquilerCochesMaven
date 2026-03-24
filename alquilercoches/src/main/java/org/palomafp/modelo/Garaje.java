package org.palomafp.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un garaje en el sistema de alquiler de coches
 *
 * @author Eduardo Vargas y Sima
 */
public class Garaje {

    // Código único del garaje
    private String codigoGaraje;

    // Dirección postal del garaje
    private String direccion;

    // Lista de coches asociados al garaje
    private List<Coche> coches;

    /**
     * Constructor sin parámetros. Inicializa la lista de coches vacía
     */
    public Garaje() {
        this.coches = new ArrayList<>();
    }

    /**
     * Constructor con parámetros para inicializar un garaje
     *
     * @param codigoGaraje Código  del garaje
     * @param direccion Dirección del garaje
     */
    public Garaje(String codigoGaraje, String direccion) {
        this.codigoGaraje = codigoGaraje;
        this.direccion = direccion;
        this.coches = new ArrayList<>();
    }

    /**
     * Obtiene el código del garaje
     *
     * @return el código único del garaje
     */
    public String getCodigoGaraje() {
        return codigoGaraje;
    }

    /**
     * Establece el código del garaje
     *
     * @param codigoGaraje Código único del garaje
     */
    public void setCodigoGaraje(String codigoGaraje) {
        this.codigoGaraje = codigoGaraje;
    }

    /**
     * Obtiene la dirección del garaje
     *
     * @return Dirección del garaje
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección del garaje
     *
     * @param direccion Dirección del garaje
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtiene la lista de coches del garaje
     *
     * @return la lista de coches en el garaje
     */
    public List<Coche> getCoches() {
        return coches;
    }

    /**
     * Establece la lista de coches del garaje
     *
     * @param coches Lista de coches a asociar al garaje
     */
    public void setCoches(List<Coche> coches) {
        this.coches = coches;
    }

    /**
     * Agrega un coche a la lista del garaje
     *
     * @param coche Coche que se va a añadir
     */
    public void addCoche(Coche coche) {
        this.coches.add(coche);
    }

    /**
     * Elimina un coche de la lista del garaje
     *
     * @param coche Coche a eliminar
     */
    public void removeCoche(Coche coche) {
        this.coches.remove(coche);
    }

    /**

     * Metodo toString que muestra la informacion del garaje formateada
     * @return La informacion del garaje
     */
    @Override
    public String toString() {
        return "Garaje{" +
                "codigoGaraje='" + codigoGaraje + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
