# Segundo Hackaton - agenda Telefónica

Proyecto para el Hackathon #2.  
Crea un sistema que permita gestionar una agenda telefonica.
---

## Funcionalidades
- Añadir contacto
- Evitar contactos duplicados (por nombre)
- Buscar contacto por nombre
- Eliminar contacto
- Listar todos los contactos
- Verificar si la agenda está llena
- Mostrar espacios disponibles
---

## Estructura del proyecto

/src
├── Contacto.java
└── Main.java
---

## Tecnologías usadas
- IntelliJ IDEA
- Git & GitHub
---
# Flujo de trabajo
## 1. Clonar el repositorio
### Opción 1: Desde IntelliJ

1. Abrir IntelliJ IDEA
2. En la pantalla inicial seleccionar: **Get from VCS**
3. Pegar la URL del repositorio:

   https://github.com/VeronicaOrtCastillo/Agenda-Telefonica

4. Elegir la carpeta donde se guardará
5. Click en **Clone**
6. Esperar a que cargue el proyecto
7. IntelliJ detectará automáticamente el proyecto
---
### Opción 2: Desde terminal

1. Abrir terminal
2. Ejecutar:

   `git clone https://github.com/VeronicaOrtCastillo/Agenda-Telefonica`

3. Entrar a la carpeta:

   cd agenda-Telefonica

4. Ejecuta para descargar los nuevos cambios que existan en main

   `git pull origin main`

---
## 2. Creacion de ramas
- Se utiliza la siguiente estructura

  `git checkout -b nombre-rama`

---
## 3. Actualizacion de rama develop a nuestra rama

 `git pull origin develop`

## 4. Cambios
- Una vez realizados los cambios dentro de nuestra respectiva rama

    `git add .`

    `git git commit -m "Descripcion"`

    `git push origin Nombre-rama`

- Se acepta el pull request en github dentro de rama develop no en rama main

### Se actualiza nuestra rama al contenido de rama develop

  `git pull origin develop`

### Para traer las actualizaciones desde main

  `git checkout main`
  `git pull origin main`
  `git checkout Nombre-feature`
  `git merge main`

