# AlquilerCoches - Gestión de reservas de coches (Java + Maven)

Aplicación de consola para gestionar reservas de coches con arquitectura en capas y patrón DAO (Data Access Object).

## 📋 Descripción

AlquilerCoches permite administrar clientes, coches, garajes y reservas en memoria. El usuario interactúa mediante un menú en la consola para:

- Obtener una reserva de forma aleatoria.
- Buscar una reserva por su código.
- Consultar todas las reservas registradas.

## 🏗️ Estructura del proyecto

- `pom.xml`: configuración Maven
- `src/main/java/org/palomafp/App.java`: punto de entrada, bucle do-while + switch para menú interactivo
- `src/main/java/org/palomafp/modelo/AlquilerCochesDAO.java`: DAO con datos iniciales en memoria y métodos de consulta
- `src/main/java/org/palomafp/modelo/Cliente.java`: entidad cliente
- `src/main/java/org/palomafp/modelo/Coche.java`: entidad coche
- `src/main/java/org- `src/main/java/org- `src/main/java/org- `src/main/java/org- `src/main/java/org- `src/main/java: - `src/main/java/org- `src/main/java/org- `src/main/java/org- `a/o- `src/main/java/org- `src/main/java/org- `src/main/java/org- `src/main/java/org- `src/main/java/org- `src/main/java:sDAOTest.java`: tests uni- `src/main/java/org- `src/main/java/org- `src/main/java/org- `src/main/java/org- `src/main/java/org- `src/main/java: - `src/main/java/org- `srión.

```mermaid
classDiagram
    class Clie    class Clie    class Clie    clae
        - String DNI
        - String nombre
        - String direccion
        - String telefono
        - List<Reserva> reservas
        + addReserva(Reserva)
        + removeReserva(Reserva)
    }

    class Coche {
        - String matricula
        - String modelo
        - String color
        - String marca
        - Garaje garaje
        - List<Reserva> reservas
        + addReserva(Reserva)
        + removeReserva(Reserva)
    }

    class Garaje {
        - S        - S        - S        - S        - S        - S        - S        - S        - S        - S        - S        - S        - S        - S        - S        - S        - S        - S        - S        - S        - S        - S        - S        - S        - S        - S        - S        - S        - S        - S        - S        - S        - S        - S        - S        - S        - S        - S        - S        - S        - S        - S        - S        nte : cliente
    Reserva -->     Reserva -->     Reserva -->     Reserva --- `Cl    Reserva --> clien    Reserva -->  direcci    Reserva -->     Ra de reservas.
- `Coche`: matrícula, modelo, color, marca, garaj- `Coche`: matrícuas.
- `Garaje`: código de garaje, dirección y lista de coches.
- `R- `R- `R- `R- `R- `R- `aci�- `R- `R- `R- io, fecha - `R- `R- `R- `R- `R-y coche.
- `AlquilerCochesDAO`: inicializa datos de ejemplo y ofrece métodos:
  -  -  -  -  -  -  -  -  `getRes  -  -  -  -  -  -  -  - servaRandom()`

## 🎯 Flujo de l## 🎯 Flujo de l## 🎯 Flujo de l## 🎯 Flujo de l## 🎯 Flujo de l## 🎯 Flujo de l## 🎯 Flujo de l## 🎯 Flujo de l## 🎯 Flujo de l## 🎯 Flujo de l## 🎯 Flujo de l## 🎯 Flujo de l## 🎯 Flujo de l## 🎯 Flujo de l## 🎯 Flujo de l## 🎯 Flujo de l## 🎯 Flujo de l## 🎯 Flujo de l## 🎯 Flujo de l## 🎯 Flujo de l## 🎯 Flujo de l## 🎯 Flujo de l## 🎯 Flujo de l## 🎯 Flujo de l## 🎯 Flujo de l## 🎯 Flujo de l## 🎯 Flujo de l## 🎯 Flujo de l## 🎯d`## 🎯 Flujo de l## 🎯 Flujo de l## 🎯 Flujo de l## 🎯 Flujo de l## 🎯 Flujo de l## 🎯 Flujo de l## 🎯 Flujo de l## 🎯 Flujo de l##nse (ajustar según proyecto).
