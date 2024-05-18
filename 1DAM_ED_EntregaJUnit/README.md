# Importar el Proyecto en Eclipse a un Repositorio de GitHub
## Pasos
### 1. Abrir el Proyecto en Eclipse
### 2. Inicializar un Repositorio Git Local
1. Hacer clic derecho en el proyecto y selecciona `Team` > `Share Project...`.
2. Crea un nuevo repositorio si es necesario (p puede que ya hayas creado una carpeta vacía antes, entonces búscala y selecciónala) y haz clic en `Finish`.
   
### 3. Realizar el Primer Commit
1. Hacer clic derecho en el proyecto y selecciona `Team` > `Commit...`.
2. Añade un mensaje de commit y selecciona los archivos para incluir. Luego, haz clic en `Commit`.
   
### 4. Configurar el Repositorio Remoto en GitHub
1. Crea un nuevo repositorio en GitHub (sin README ni .gitignore ya que podrían dar conflictos).
2. Copia la URL del nuevo repositorio.

### 5. Añadir el Repositorio Remoto en Eclipse
1. Desde la misma pestaña en la que hiciste el commit, selecciona `Push...`.
3. Dejamos el `Remote name` en `Origin` y añadimos la URL del repositorio de GitHub.
4. Nos autentificamos con nuestro nombre de usuario y token de acceso personal de GitHub (es recomendable usar un token en lugar de tu contraseña por razones de seguridad).
5. Nos aseguramenos de que master o main (según la configuración de tu repositorio de GitHub) esté seleccionado tanto en el origen como en el destino.
Haz clic en Next y luego en Finish.

### 6. Verificamos el Push
1. Vamos a nuestro repositorio de GitHub y verificamos que se haya realizado correctamente.

¡Y eso es todo! Tu proyecto ahora debería estar en GitHub.
