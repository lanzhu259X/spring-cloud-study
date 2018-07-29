docker run --rm --name service-user-a \
-v /workspace/webapp/spring-cloud-study/service-user-a.jar:/app.jar \
--hostname service-user-a \
-p 8721:8721 --network test-net \
--privileged=true \
-d java:8 \
java -jar /app.jar
