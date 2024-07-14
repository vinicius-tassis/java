aws ecr get-login-password --region us-east-1 --profile user-spring-vue | docker login --username AWS --password-stdin 138803511693.dkr.ecr.us-east-1.amazonaws.com
docker build -t spring-vue-teste backend/
docker tag spring-vue-teste:latest 138803511693.dkr.ecr.us-east-1.amazonaws.com/spring-vue-teste:latest
docker push 138803511693.dkr.ecr.us-east-1.amazonaws.com/spring-vue-teste:latest