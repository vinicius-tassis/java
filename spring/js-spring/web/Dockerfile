FROM nginx
COPY . /usr/share/nginx/html

# Copie o arquivo de configuração personalizado para o diretório de configuração do NGINX
COPY ./config/default.conf /etc/nginx/conf.d/default.conf

EXPOSE 80