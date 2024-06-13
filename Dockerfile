# Usa una imagen base de OpenJDK para Java 11
FROM openjdk:11-jre-slim

# Establece el directorio de trabajo en /app
WORKDIR /app

# Copia el JAR construido de tu aplicación Spring Boot en el contenedor
COPY --from=build /home/app/target/war_name.war app.war


# Expone el puerto 8080
EXPOSE 8080

# Comando para ejecutar la aplicación cuando el contenedor se inicia
CMD ["java", "-jar", "app.jar"]
