# Usar una imagen base de Ubuntu
FROM ubuntu:latest

# Instalar dependencias necesarias
RUN apt-get update && \
    apt-get install -y wget tar

# Descargar OpenJDK 23.0.2
RUN wget https://download.java.net/java/GA/jdk23.0.2/6da2a6609d6e406f85c491fcb119101b/7/GPL/openjdk-23.0.2_linux-x64_bin.tar.gz

# Extraer el archivo descargado
RUN tar -xzf openjdk-23.0.2_linux-x64_bin.tar.gz -C /opt && \
    rm openjdk-23.0.2_linux-x64_bin.tar.gz

# Establecer las variables de entorno para Java
ENV JAVA_HOME /opt/jdk-23.0.2
ENV PATH $JAVA_HOME/bin:$PATH

# Establecer el directorio de trabajo
WORKDIR /app

# Copiar el archivo JAR generado
COPY target/MyApiApplication-0.0.1-SNAPSHOT.jar MyApiApplication.jar

# Exponer el puerto 8080
EXPOSE 8080

# Comando para ejecutar la aplicación
CMD ["java", "-jar", "MyApiApplication.jar"]