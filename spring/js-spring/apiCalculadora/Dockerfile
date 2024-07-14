# Usando a imagem base do JDK 11
FROM openjdk:17

# Adicionando um argumento para o JAR do aplicativo
ARG JAR_FILE=target/*.jar

# Copiando o JAR do aplicativo para o contêiner
COPY ${JAR_FILE} app.jar

# Expondo a porta padrão do Spring Boot
EXPOSE 8080

# Comando para executar o aplicativo
ENTRYPOINT ["java", "-jar", "/app.jar"]
