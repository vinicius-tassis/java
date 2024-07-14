# Usa uma imagem base do OpenJDK para execução
FROM openjdk:17

# Define o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copia o JAR construído na etapa anterior
COPY target/app-rest-1.0.jar app.jar

# Exibe logs para stdout
# RUN mkdir -p logs
# COPY ./logs /app/logs

# Expõe a porta que a aplicação irá usar
EXPOSE 8080

# Comando para rodar a aplicação
CMD ["java", "-jar", "app.jar"]
