# AlquilerCoches - Gestión de reservas de coches (Java + Maven)

Aplicación de consola para gestionar reservas de coches con arquitectura en capas y patrón DAO (Data Access Object).

## 📋 Descripción

AlquilerCoches permite administrar clientes, coches, garajes y reservas en memoria. El usuario interactúa mediante un menú en la consola para:

- Obtener una reserva de forma aleatoria
- Buscar una reserva por su código
- Consultar todas las reservas registradas

## 🏗️ Estructura del proyecto

- `pom.xml`: configuración Maven
- `src/main/java/org/palomafp/App.java`: punto de entrada, bucle do-while + switch para menú interactivo
- `src/main/java/org/palomafp/modelo/AlquilerCochesDAO.java`: DAO con datos iniciales en memoria y métodos de consulta
- `src/main/java/org/palomafp/modelo/Cliente.java`: entidad cliente
- `src/main/java/org/palomafp/modelo/Coche.java`: entidad coche
- `src/main/java/org/palomafp/modelo/Garaje.java`: entidad garaje
- `src/main/java/org/palomafp/modelo/Reserva.java`: entidad reserva con relación a cliente y coche
- `src/test/java/org/palomafp/AppTest.java`: tests unitarios básicos de aplicación
- `src/test/java/org/palomafp/modelo/AlquilerCochesDAOTest.java`: tests unitarios del DAO

## 📐 Diagrama de clases

Consulta el diagrama de clases en `doc/diagrama_clases.md` y el bloque Mermaid incluido en este README.


onsulta el diagrama de clases en Cliente {
        - String codigoCliente
                                       ombre
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
        - String codigoGaraje
        - String direccion
        - List<Coche> coches
        + addCoche(Coche)
        + removeCoche(Coche)
    }

    class Reserva {
        - String codigoReserva
        - Date fechaInicio
        - Date fechaFin
        - double precio
        - Cliente cliente
        - Coche coche
    }

    Cliente "1" o-- "*" Reserva : "tiene"
    Coche "1" o-- "*" Reserva : "es reservable"
    Garaje "1" o-- "*" Coche : "contiene"
    Reserva --> Cliente : cliente
    Reserva --> Coche : coche
```

## 🧩 Detalle de clases

- `Cliente`: guarda el código, DNI, nombre, dirección, teléfono y mantiene sus reservas.
- `Coche`: guarda matrícula, modelo, color, marca, relación a garaje y reservas.
- `Garaje`: guarda código de garaje, dirección y lista de coches.
- `Reserva`: guarda código de reserva, fechas, precio, cliente y coche.
- `AlquilerCochesDAO`: crea datos de ejemplo (4 reservas con cliente/coche/garaje), devuelve todos los registros, busca por c- `Ago - `AlquilerCochesia.

## 🎯 Flujo de la aplicac## 🎯 Flujo de la aplicMo## 🎯 Flujo de la aptoria (`getReservaRandom`)
2. Bus2. Bus2. Bus2. Bus2. go (`getReservabyId`)
3. Mostrar todas las reservas (`getAllReserva`)
0. Salir

## 🛠️ Requisitos

- Java 11 o superior
- Maven 3.x

## ▶️ Compilar y ejecutar
## ▶️ Compiean com## 
�mvn exec:java -Dexec.mainClass="org.palomafp.App"
```

## 🧪 Tests

```bash
mvn test
```

Test principales:

- `testGetAllReserva` (confirma la cantidad de reservas)
- `testGetReservabyId` (para código válido e inválido)
- `t- `t- `t- `t- `t- `t- `t- `t- `t- `t- `t- `t- `t- `t- `t- `t- `t- `t- `t- `t- `t- `t- `T (ajustar según sea necesario)
