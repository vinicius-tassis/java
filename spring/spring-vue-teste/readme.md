# Projeto de Container Docker com Spring e Vue.js

Este projeto demonstra a integração entre Spring Boot no backend e Vue.js no frontend, empacotados em containers Docker. O script `build-and-run.sh` automatiza a criação da imagem Docker e a execução do container.

## Estrutura do Projeto

- `backend/`: Código-fonte do Spring Boot.
- `frontend/`: Código-fonte do Vue.js.
- `Dockerfile`: Arquivo de configuração para criar a imagem Docker.
- `docker-compose.yml`: Arquivo para orquestração dos containers.
- `build-and-run.sh`: Script para construir a imagem e iniciar os containers.

## Pré-requisitos

- Docker instalado na máquina.
- Docker Compose instalado.
- Conta no Docker Hub (para subir as imagens).

## Build
Neste projeto o build `npm run build` do frontend Vue.js é copiado para dentro da pasta `static` do Spring Boot, então o mapeamento do controller no Spring fica responsável por direcionar as solicitações para os endpoints corretos, facilitando o Roteamento no Vue.js.

Por exemplo, se você tiver uma rota ou chamada `/api-ola`, ela deve corresponder a um endpoint no controller Spring.

## Instruções de Uso

### 1. Executar o Script de Build e Run

O script `build-and-run.sh` realiza todos os passos necessários para criar uma imagem Docker e subir o container a partir da imagem gerada:

```sh
./build-and-run.sh
```

### 2. Subir a Imagem no Docker Hub

Após a criação da imagem com o comando `docker build -t vinissaum/spring-vue-teste:1.0 .` no `script build-and-run.sh`, é possível subir a imagem para o Docker Hub.

#### a. Fazer Login no Docker Hub
Execute o comando abaixo e informe suas credenciais (usuário e senha):

```sh
docker login
```

#### b. Subir a Imagem
Utilize o Docker Compose para empurrar a imagem para o Docker Hub informando o nome do serviço, neste caso spring-vue-teste:

```sh
docker-compose push spring-vue-teste
```

#### c. Fazer Logout

Para sair da sua conta Docker Hub, execute:
```sh
docker logout
```

#### d. Endereço público da imagem para implantação em nuvem
`docker.io/vinissaum/spring-vue-teste:1.0`

## Comandos Úteis

### Build da Imagem Manualmente

Caso queira construir a imagem manualmente, use:
```sh
docker build -t vinissaum/spring-vue-teste:1.0 .
```

### Executar o Container Manualmente

Para executar o container manualmente, utilize:
```sh
docker run -p 8080:8080 vinissaum/spring-vue-teste:1.0
```

### Parar e Remover Containers

Para parar e remover todos os containers, utilize:
```sh
docker-compose down
```

### Verificar Imagens e Containers

Listar imagens Docker:
```sh
docker images
```

Listar containers em execução:
```sh
docker ps
```
## Teste de implantação em Nuvem

### Azure Containers Instances (ACI) 

O projeto foi implantado na ACI informando o `Image source: docker.io/vinissaum/spring-vue-teste:1.0` hospedado no Docker Hub e configurado a porta 8081 para o TCP de acordo com a imagem.

Após a implantação da Azure, a aplicação foi acessada via browser pelo IP dinâmico gerado pela Azure na porta 8081. Ex: 4.12.48.27:8081