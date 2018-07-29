docker run --rm --name config-server \
-v /workspace/webapp/spring-cloud-study/config-server.jar:/app.jar \
-e spring.cloud.config.server.git.password=您的github的密码 \
-p 8711:8711 --network test-net \
--hostname config-server \
--privileged=true \
-d java:8 \
java -jar /app.jar
