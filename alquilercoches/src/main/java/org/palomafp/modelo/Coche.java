package org.palomafp.modelo;

import java.util.ArrayList;
import java.util.List;

public class Coche {
    private String matricula;
    private String modelo;
    private String color;
    private String marca;
    private Garaje garaje;
    private List<Reserva> reservas;

    public Coche() {
        this.reservas = new ArrayList<>();
    }

    public Coche(String matricula, String modelo, String color, String marca, Garaje garaje) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
        this.marca = marca;
        this.garaje = garaje;
        this.reservas = new ArrayList<>();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Garaje getGaraje() {
        return garaje;
    }

    public void setGaraje(Garaje garaje) {
        this.garaje = garaje;
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
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", garaje=" + (garaje != null ? garaje.getCodigoGaraje() : "null") +
                '}';
    }
}
