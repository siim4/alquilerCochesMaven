# 🛻 AlquilerCoches

Aplicación de gestión de reservas de coches desarrollada en **Java** con arquitectura en capas y patrón **DAO** (Data Access Object).

---

## 📋 Descripción

**AlquilerCoches** permite gestionar clientes, coches, garajes y reservas. La aplicación organiza clientes y coches en un sistema con reservas con fechas y precio.

El usuario interactúa con el sistema a través de un **menú de consola** que permite:

- Obtener una reserva de forma aleatoria.
- Buscar una reserva por su código identificador.
- Consultar todas las reservas registradas.

---

## 🏗️ Estructura del proyecto

```
src/
├── main/
│   └── java/
│       └── org/palomafp/
│           ├── App.java              # Punto de entrada + menú de consola
│           └── modelo/
│               ├── AlquilerCochesDAO.java  # Capa de acceso a datos (DAO)
│               ├─│               ├─│               ├─│               ├─│               ├─ #│            │     │               ├─│               ├─│               ├─│               ├─│               ├─ #│          ─ test│               �a/
│               ├─│               ├─│               ├─│               ├─│               ├─ #│            │     │               └── AlquilerCochesDAOTest.java # Tests unitarios del DAO
```

---

## 📐 Diagrama de## 📐 Diagrama de## 📐 Diagrama de##ente "1" o-- "*" Reserva : "tiene"
    Coche "1" o--     Coche "1" o--     Coche "1" o--     C"1" o-- "*" Coche : "contiene"
    Reserva --> Cl   te : cliente
    Reserva --> Coche : coche

    class Cliente {
        -         -         -         -         -         -         -         -         -  g direccion
        - String telefo        - String telefo        - String telefo        - String telefo        - Stri        - String telefo        - String telefo        - String telefo        - String telefo        - Stri        - String telefo        - String telefo        - String telefo        - String telefo        - Stri        - String telefo        - String telefo        - String telefo        - String telefo      - Date fechaInicio
        - Date fechaFin
        - double precio
        - Cliente cliente
        - Coche coche
    }
```

---

## 🧩 Descripción de las clases

### `Cliente`
Guarda el código de cliente, DNI, nombre, dirección, teléfono y lista de reservas.

### `Coche`
Guarda matrícula, modelo, color, marca, garaje y lista de reservas.

### `Garaje`
Guarda código de garaje, dirección y lista de coches.


uarda código de garaje, do de reserva, fecha de inicio, fecha fin, precio, cliente y coche.

### `AlquilerCochesDAO`
Capa de acceso a datos. Inicializa datos en memoria e implementa las Capa de acceso a datos. Inicializa datos en memoria e implementa las Capa de acceso a datos. Inicializa datos en memoria e implementa las Capa de acceso a datos. Inicializa datos en memoria e implementa las Capa de acceso a datos. Inicializa datos en memoria e implementa las Capa de acceso a datos. Inicializa datos en memoria e implementa las Capa de acceso a datos. Inicializa datos en memoria e implementa las Capa de acceso a da JCapa de acceso or
- Mave- Mave- Mave- Mave- Maejecutar

```bash
mvn clean compile
mvn exec:java -Dexec.mainmvassmvn exec:java -Dexec.mainmva Ejecutar los tests

````````````````````````````````````````````````````````````````````````````````Alquiler``````````es````````````````````````````````````````````````````````````````llRese```````````fica que se devuelven todas (4) reservas |
| `testGetReserva| `testGetReserva| `testGetReserva| `testGetReserva| `testGetReserva| `testGetReserva| `tomprueba que la reserva aleatoria no es nula |

---

## 📦 Tecnologías utilizadas

| Tecnología | Uso |
|---|---|
| Java | Lenguaje principal |
| Maven | Gestión de dependencias y build |
| JUnit 5 | Framework de testing |

---

## 👤 Autor

Eduardo y Sima.

Proyecto desarrollado para la asignatura de Entornos de Desarrollo.
