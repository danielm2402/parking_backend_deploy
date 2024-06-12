# Usa una imagen base de OpenJDK
FROM openjdk:17-jdk-slim

# Añade un volumen apuntando a /tmp
VOLUME /tmp

# Copia el archivo JAR al contenedor
COPY target/parking_backend.jar app.jar

# Expone el puerto que usará la aplicación
EXPOSE 8080

# Ejecuta la aplicación
ENTRYPOINT ["java","-jar","/app.jar"]
