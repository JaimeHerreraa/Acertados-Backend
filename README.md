
# Reto Técnico Sofka - Backend

API basada en la arquitectura REST construida usando el framework de Spring Boot.

## Instalación

Para bajar el código de nuestra API, el cual se encuentra en GitHub es necesario hacer una copia local del repositorio, para eso ejecutamos el siguiente comando en la consola:

```shell
git-clone https://github.com/JaimeHerreraa/Acertados-Backend.git
```

Luego de esto ya podemos abrir el proyecto y ejecutar el código en nuestro editor de preferencia.

## Precauciones

* Es necesario que la base de datos se encuentre creada y en funcionamiento para que nuestra API pueda conectarse con  ella, de lo contrario habrá un error en tiempo de ejecución.

* Los datos del archivo "aplication.yml" deben estar acordes a los datos de usuario de nuestro servidor de bases de datos para que la conexión con esta sea exitosa.
___

## Ejemplo contenido del archivo "aplication.yml"

En mi caso utilicé los datos que vienen por defecto, pero si no es el suyo debe de indicar correctamente usuario y contraseña.

```yml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/reto
    password: "1379"
    username: "root"
  jpa:
    hibernate:
      ddl-auto: update
    properties:
      hibernate:
        dialect: org.hibernate.dialect.MySQL5InnoDBDialect
