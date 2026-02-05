package org.palomafp.modelo;

import java.util.ArrayList;
import java.util.List;

public class Garaje {
    private String codigoGaraje;
    private String direccion;
    private List<Coche> coches;

    public Garaje() {
        this.coches = new ArrayList<>();
    }

    public Garaje(String codigoGaraje, String direccion) {
        this.codigoGaraje = codigoGaraje;
        this.direccion = direccion;
        this.coches = new ArrayList<>();
    }

    public String getCodigoGaraje() {
        return codigoGaraje;
    }

    public void setCodigoGaraje(String codigoGaraje) {
        this.codigoGaraje = codigoGaraje;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Coche> getCoches() {
        return coches;
    }

    public void setCoches(List<Coche> coches) {
        this.coches = coches;
    }

    public void addCoche(Coche coche) {
        this.coches.add(coche);
    }

    public void removeCoche(Coche coche) {
        this.coches.remove(coche);
    }

    @Override
    public String toString() {
        return "Garaje{" +
                "codigoGaraje='" + codigoGaraje + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
