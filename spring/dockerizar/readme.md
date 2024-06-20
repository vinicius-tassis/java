# Dockerizando uma aplicação Spring boot

- 1. Gerar a imagem a partir do arquivo Dockerfile
```
docker build --tag=docekrizar:latest .
```

- 2. Rodar o container criado a partir da imagem
```
docker run -p 8887:8081 docekrizar:latest
```

- 3. Inspecionar, parar e/ou remover o container
```
docker inspect docekrizar:latest
docker stop docekrizar:latest
docker rm docekrizar:latest
```