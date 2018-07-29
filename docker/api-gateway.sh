docker run --rm --name api-gateway \
-v /workspace/webapp/spring-cloud-study/api-gateway.jar:/app.jar \
--hostname api-gateway \
-p 8741:8741 --network test-net \
--privileged=true \
-d java:8 \
java -jar /app.jar
