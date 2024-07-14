https://medium.com/@castrojulio/create-a-spring-boot-initializer-that-intercepts-the-logs-and-sends-them-to-fluentd-815363cae72e

https://www.youtube.com/watch?v=Gp8kvzSikgo

https://docs.fluentd.org/v/0.12/articles/java
https://github.com/patoi/springboot-fluentd-logging-example/blob/master/fluent.conf
https://github.com/patoi/springboot-fluentd-logging-example/blob/master/src/main/java/com/example/logging/GreetingHandler.java

docker-compose exec fluentd sh
cd fluentd/log

docker-compose exec fluentd bash   # Acesse o container do Fluentd
tail -f /fluentd/log/request_logs  # Verifique o arquivo de logs do Fluentd onde estão sendo armazenados os logs da sua aplicação



https://docs.docker.com/config/containers/logging/fluentd/

docker run -it -p 24224:24224 --name meu_fluent -v /fluentd/fluent.conf:/fluentd/etc/conf.conf -e FLUENTD_CONF=fluent.conf fluent/fluentd:v1.16-1
docker build -t app-rest app-rest/
docker run -p 8080:8080 --log-driver=fluentd app-rest

docker exec -it meu_fluent sh