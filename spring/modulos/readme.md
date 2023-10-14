# Módulos
Projeto que demonstra a utilização de módulos com o maven.<br>

## Módulo 01
O módulo 01 possui uma API com um método GET na porta 8081<br>
Pode ser acessado via browser em <a>http://localhost:8081/ola</a><br>

## Módulo 02
O módulo 02 possui uma API com um método GET na porta 8082<br>
Pode ser acessado via browser em <a>http://localhost:8082/ola</a><br>

O comando abaixo por ser executado na pasta raiz
```
mvn clean install
```

Já para executar o projeto, deve entrar na pasta de cada módulo
```
mvn spring-boot:run
```