# Criar a imagem
```sh
docker build -t meu-nginx .
```

# Rodar a imagem

```sh
docker run -d -p 80:80 --name meu-nginx meu-nginx
```

ou

```sh
docker-compose up -d
```
