# Alquiler de Coches Maven

Proyecto Java de consola que gestiona el alquiler de coches. Construido con Maven y organizado en el paquete `org.palomafp`.

## 🚀 Visión general

- Gestión de clientes, coches, garajes y reservas
- Capa de modelo en `org.palomafp.modelo`
- Persistencia en memoria con `AlquilerCochesDAO`
- Pruebas unitarias con JUnit

## 📁 Estructura del proyecto

- `pom.xml`: configuración de Maven
- `src/main/java`: código fuente principal
  - `org.palomafp.App.java`: clase principal
  - `org.palomafp.modelo`: clases del dominio
    - `AlquilerCochesDAO.java`
    - `Cliente.java`
    - `Coche.java`
    - `Garaje.java`
    - `Reserva.java`
- `src/test/java`: pruebas unitarias
  - `org.palomafp.AppTest.java`
  - `org.palomafp.modelo.AlquilerCochesDAOTest.java`

## 🧩 Diagrama de clases (Mermaid)

```mermaid
classDiagram
    class Cliente {
        - String codigoCliente
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

## 🛠️ Requisitos

- Java 11 o superior
- Maven 3.6+

## ▶️ Uso

1. Compilar:
   ```bash
   mvn clean compile
   ```
2. Ejecutar:
   ```bash
   mvn exec:java -Dexec.mainClass="org.palomafp.App"
   ```
3. Ejecutar pruebas:
   ```bash
   mvn test
   ```

## 🤝 Contribuir

Forkear el repositorio, crear una rama y enviar un pull request.

## 📄 Licencia

MIT License (ajustar según proyecto).
