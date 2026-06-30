<p>
  <img src="https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png" width="300" alt="Logo Duoc UC"/>
</p>

# 🧠 Llanquihue Tour App

Proyecto desarrollado para la asignatura **Desarrollo Orientado a Objetos I (PRY2202)** de Duoc UC.

---

## 📖 Descripción

Este proyecto corresponde a la evolución del sistema **Llanquihue Tour**, desarrollado durante las actividades de la asignatura Desarrollo Orientado a Objetos I.

En esta sexta semana se implementó una nueva jerarquía de clases para representar distintos servicios turísticos ofrecidos por la agencia, aplicando herencia simple, reutilización de código mediante `super(...)` y sobrescritura del método `toString()`.

Además, se mantienen las funcionalidades implementadas en semanas anteriores, como la gestión de tours, guías y proveedores mediante archivos de texto externos.

Durante el desarrollo se aplican conceptos fundamentales como:

* Clases y Objetos.
* Encapsulamiento.
* Herencia.
* Herencia simple.
* Composición.
* Colecciones (`ArrayList`).
* Lectura de archivos.
* Manejo de datos mediante archivos externos.
* Excepciones personalizadas.
* Uso de `super()`.
* Sobrescritura de métodos.
* Métodos Getter y Setter.
* Método `toString()`.

El caso de estudio corresponde a la agencia de turismo **Llanquihue Tour**.

---

## 📁 Estructura del Proyecto

```text
📁 src/
└── 📁 main/
    ├── 📁 java/
    │   ├── 📁 data/
    │   │   ├── GestorDatos.java
    │   │   └── GestorServicios.java
    │   │
    │   ├── 📁 model/
    │   │   ├── Persona.java
    │   │   ├── Guia.java
    │   │   ├── Proveedor.java
    │   │   ├── Rut.java
    │   │   ├── Tour.java
    │   │   ├── ServicioTuristico.java
    │   │   ├── RutaGastronomica.java
    │   │   ├── PaseoLacustre.java
    │   │   └── ExcursionCultural.java
    │   │
    │   ├── 📁 servicios/
    │   │   └── TourManager.java
    │   │
    │   ├── 📁 ui/
    │   │   └── Main.java
    │   │
    │   └── 📁 util/
    │       ├── FileUtil.java
    │       └── InvalidRutException.java
    │
    └── 📁 resources/
        ├── tours.txt
        └── datos.txt
```

---

## 🚀 Ejecución

1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que los archivos `tours.txt` y `datos.txt` se encuentren dentro de `src/main/resources`.
3. Compilar el proyecto.
4. Ejecutar la clase `Main`.
5. Utilizar el menú interactivo mostrado por consola.

---

## 🧩 Clases Implementadas

### Persona

Clase base utilizada para representar personas asociadas a la agencia.

### Guia

Hereda de `Persona` y representa a los guías turísticos encargados de realizar los tours.

### Proveedor

Hereda de `Persona` y representa a los proveedores de servicios asociados a la agencia.

### Rut

Clase encargada de validar y almacenar el RUT de una persona.

### Tour

Representa un tour turístico e incluye atributos como:

* Nombre.
* Descripción.
* Tipo.
* Precio.
* Duración.
* Cupos disponibles.
* Guía responsable.

### ServicioTuristico

Clase base que representa un servicio turístico de la agencia. Contiene los atributos comunes **nombre** y **duracionHoras**.

### RutaGastronomica

Hereda de `ServicioTuristico` e incorpora el atributo **numeroDeParadas**.

### PaseoLacustre

Hereda de `ServicioTuristico` e incorpora el atributo **tipoEmbarcacion**.

### ExcursionCultural

Hereda de `ServicioTuristico` e incorpora el atributo **lugarHistorico**.

### GestorDatos

Clase encargada de:

* Verificar la existencia de los archivos.
* Cargar datos por defecto cuando sea necesario.
* Leer la información almacenada en archivos externos.
* Crear objetos del dominio a partir de los datos obtenidos.

### GestorServicios

Clase encargada de crear instancias de prueba de los distintos servicios turísticos y mostrarlas por consola.

### TourManager

Clase encargada de gestionar operaciones relacionadas con los tours.

### FileUtil

Clase utilitaria para la verificación y gestión básica de archivos.

### Main

Clase principal que permite:

* Mostrar un menú interactivo.
* Visualizar todos los tours.
* Visualizar tours con cupos disponibles.
* Mostrar los guías registrados.
* Mostrar los proveedores registrados.
* Acceder al submenú de servicios turísticos.
* Visualizar rutas gastronómicas.
* Visualizar paseos lacustres.
* Visualizar excursiones culturales.

---

## 🧬 Conceptos de Programación Orientada a Objetos Aplicados

### Herencia

Las clases `Guia` y `Proveedor` heredan de la clase `Persona`.

Además, durante esta semana se implementó una segunda jerarquía de clases:

```text
ServicioTuristico
├── RutaGastronomica
├── PaseoLacustre
└── ExcursionCultural
```

### Composición

La clase `Tour` contiene un objeto de tipo `Guia`.

La clase `Persona` contiene un objeto de tipo `Rut`.

### Encapsulamiento

Los atributos se encuentran encapsulados mediante modificadores de acceso y métodos getter y setter.

### Sobrescritura de Métodos

Las clases `RutaGastronomica`, `PaseoLacustre` y `ExcursionCultural` sobrescriben el método `toString()` para mostrar la información específica de cada servicio turístico.

### Uso de `super()`

Las subclases de `ServicioTuristico` utilizan `super(...)` para inicializar los atributos heredados de la clase base.

### Excepciones Personalizadas

Se implementó la excepción `InvalidRutException` para validar el formato de los RUT ingresados.

---

## 📄 Archivos de Datos

### tours.txt

Contiene la información de los tours turísticos.

```text
Volcan Osorno;Aventura;35000;8;20;Ascenso guiado
Frutillar Colonial;Cultural;18000;4;15;Tour patrimonial
Ruta Gastronomica;Gastronomico;22000;3;0;Comida tipica
Saltos del Petrohue;Naturaleza;28000;6;12;Senderismo y vistas
Tour Lago Llanquihue;Lacustre;25000;5;25;Recorrido lacustre
```

Formato:

```text
Nombre;Tipo;Precio;DuracionHoras;CuposDisponibles;Descripcion
```

### datos.txt

Contiene la información de guías y proveedores.

```text
GUIA;Pedro;Soto;12345678-9;987654321;Montañismo
GUIA;Juan;Perez;11222333-4;998877665;Turismo Cultural
PROVEEDOR;Carlos;Rojas;99888777-6;955443322;Transporte
PROVEEDOR;Ana;Muñoz;88777666-5;944332211;Alojamiento
```

Formato:

```text
TIPO;Nombre;Apellido;Rut;Telefono;Especialidad/Servicio
```

---

## ☕ Requisitos

* Java JDK 21 o superior.
* IntelliJ IDEA Community Edition.

---

## 👨‍💻 Autor

**Michael Salgado**

Desarrollo Orientado a Objetos I - Duoc UC
