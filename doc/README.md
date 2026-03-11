# Alquiler de Coches Maven

Proyecto Java de consola que gestiona el alquiler de coches. Construido con Maven y organizado en un paquete `org.palomafp`.

## Estructura del proyecto

- `pom.xml`: configuración de Maven
- `src/main/java`: código fuente principal
  - `org.palomafp.App.java`: clase principal
  - `org.palomafp.modelo`: clases de modelo y acceso a datos
    - `AlquilerCochesDAO.java`
    - `Cliente.java`
    - `Coche.java`
    - `Garaje.java`
    - `Reserva.java`
- `src/test/java`: pruebas unitarias con JUnit
  - `AppTest.java`
  - `modelo/AlquilerCochesDAOTest.java`

## Requisitos

- Java 11 o superior
- Maven (3.6+ recomendado)

## Uso

1. Compilar el proyecto:
   ```bash
   mvn clean compile
   ```
2. Ejecutar la aplicación:
   ```bash
   mvn exec:java -Dexec.mainClass="org.palomafp.App"
   ```
3. Ejecutar pruebas:
   ```bash
   mvn test
   ```

## Descripción

La aplicación permite registrar clientes, coches, garajes y reservas. Un objeto `AlquilerCochesDAO` lleva la lógica de almacenamiento en memoria para estas entidades. Las pruebas verifican la correcta gestión de los alquileres.

## Contribuir

Forkear el repositorio, crear una rama con la funcionalidad y enviar un pull request.

## Licencia

MIT License (ajustar según sea necesario).