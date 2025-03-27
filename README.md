# Hola Spring

Este es un proyecto básico de Spring Boot que expone un endpoint REST simple que devuelve un saludo.

## Descripción

El propósito de este proyecto es demostrar cómo configurar un proyecto básico de Spring Boot con un endpoint REST. El endpoint `/hola` devuelve el mensaje "¡Hola Spring!".

## Estructura del Proyecto

El proyecto sigue la estructura estándar de un proyecto de Spring Boot:

```
hola-spring
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── holaspring
│   │   │               ├── HolaSpringApplication.java
│   │   │               └── controllers
│   │   │                   └── HolaSpringController.java
│   │   └── resources
│   │       └── application.properties
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── holaspring
│                       └── HolaSpringApplicationTests.java
└── pom.xml
```

## Instrucciones de Ejecución

Sigue estos pasos para ejecutar el proyecto:

1. **Clona el repositorio**:
    ```bash
    git clone https://github.com/hectormrales/Tarea1IS.git
    cd hola-spring
    ```

2. **Compila el proyecto con Maven**:
    ```bash
    mvn clean install
    ```

3. **Ejecuta la aplicación**:
    ```bash
    mvn spring-boot:run
    ```

4. **Accede al endpoint**:
    Abre un navegador web y navega a `http://localhost:8080/hola`. Deberías ver el mensaje "¡Hola Spring!".

## Pruebas

Para ejecutar las pruebas, utiliza el siguiente comando:
```bash
mvn test
```

## Prueba del Endpoint con Postman

1. Abre Postman.
2. Crea una nueva solicitud HTTP.
3. Selecciona el método `GET`.
4. Introduce la URL `http://localhost:8080/hola`.
5. Haz clic en "Send" (Enviar).
6. Deberías ver la respuesta "¡Hola Spring!".
