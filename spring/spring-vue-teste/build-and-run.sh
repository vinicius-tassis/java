#!/bin/bash

# Navega até o diretório frontend/spring-vue-teste e gera o build do frontend
cd frontend/spring-vue-teste || { echo "Diretório frontend não encontrado"; exit 1; }

# Load NVM
export NVM_DIR="$HOME/.nvm"
# This loads nvm
[ -s "$NVM_DIR/nvm.sh" ] && \. "$NVM_DIR/nvm.sh"
# This loads nvm bash_completion
[ -s "$NVM_DIR/bash_completion" ] && \. "$NVM_DIR/bash_completion"
nvm use v18.20.2 

rm -rf dist
mkdir dist
npm install || { echo "Falha ao executar npm install em spring-vue-teste"; exit 1; }
npm run build || { echo "Falha ao executar npm run build em spring-vue-teste"; exit 1; }
cd ..
cd ..

# Navega até o diretório backend e executa o comando Maven
cd backend || { echo "Diretório backend não encontrado"; exit 1; }
mvn clean || { echo "Falha ao executar mvn clean em backend"; exit 1; }
sleep 3s
mvn install || { echo "Falha ao executar mvn install em backend"; exit 1; }
cd ..

# Copia os arquivos do diretório dist para target/classes/static
rm -rf backend/target/classes/static
mkdir backend/target/classes/static
cp -R frontend/spring-vue-teste/dist/* backend/target/classes/static

# Navega até o diretório backend e executa o comando Maven
cd backend || { echo "Diretório backend não encontrado"; exit 1; }
mvn package spring-boot:repackage || { echo "Falha ao executar mvn package em backend"; exit 1; }
cd ..

# Gerar as imagens a partir do Dockerfile
# docker rmi spring-vue-teste || { echo "erro em docker rmi spring-vue-teste"; exit 1; }
# docker build -t spring-vue-teste
cd backend || { echo "Diretório backend não encontrado"; exit 1; }
docker build -t vinissaum/spring-vue-teste:1.0 . || { echo "Falha ao construir a imagem Docker"; exit 1; }
cd..

# docker images | grep vinissaum/spring-vue-teste

# Navega até o diretório config e executa o docker-compose up
# cd config || { echo "Diretório config não encontrado"; exit 1; }
docker-compose up --build || { echo "Falha ao executar docker-compose up"; exit 1; }
# docker-compose up || { echo "Falha ao executar docker-compose up"; exit 1; }