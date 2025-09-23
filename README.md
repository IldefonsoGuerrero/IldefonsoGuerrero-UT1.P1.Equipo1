# Calculadora Java — UT1.P1.Equipo1

## Descripción del proyecto

Este repositorio contiene el desarrollo de una calculadora básica en Java como parte del trabajo práctico de la Unidad de Trabajo 1 en la asignatura de Programación. La aplicación permite realizar operaciones fundamentales como suma, resta, multiplicación y división. Cada operación ha sido implementada en una rama independiente para facilitar el trabajo colaborativo y el control de versiones.

## Integrantes del equipo

- **Ildefonso Guerrero**  
  - Creación del repositorio y configuración inicial del proyecto  
  - Desarrollo de la rama `sumaDivision`

- **Daniel Carrasco**  
  - Instalación y documentación de Git  
  - Desarrollo de la rama `resta`

- **Abraham Ahumada**  
  - Desarrollo de la rama `multiplicar`
  - Resolución de errores
## Estructura del repositorio

- `main`: rama principal del proyecto
- `sumaDivision`: operaciones de suma y división
- `resta`: operación de resta
- `multiplicar`: operación de multiplicación

## Objetivos

- Aplicar conceptos fundamentales de programación orientada a objetos en Java
- Utilizar Git y GitHub como herramientas de control de versiones
- Fomentar el trabajo en equipo mediante el uso de ramas colaborativas
- Consolidar buenas prácticas en el desarrollo de software

## Requisitos técnicos

- Java Development Kit (JDK) 17 o superior
- Git instalado y configurado
- IDE recomendado: IntelliJ IDEA, Eclipse o Visual Studio Code

## Resolución de conflictos

- Daniel:Conflicto al realizar el `merge` debido a lineas disruptivas en el codigo
- Solución: editar con `nano`
- Abraham e Ildefonso: Al realizar el `git pull` salta el fallo de que no se ha especificado como reconciliar las ramas
- Solución: Usando el comando `git config pull.rebase false` para especificar el merge
