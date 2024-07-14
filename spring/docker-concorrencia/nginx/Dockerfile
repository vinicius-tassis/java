# Usa a imagem base do Nginx
FROM nginx:alpine

# Copia o arquivo de configuração do Nginx
COPY nginx.conf /etc/nginx/nginx.conf

# Copia os arquivos do seu site para o diretório padrão do Nginx
# COPY caminho/local/dos/arquivos/do/site /usr/share/nginx/html

EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]