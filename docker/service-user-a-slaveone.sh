docker run --rm --name service-user-a-slave \
-v /workspace/webapp/spring-cloud-study/service-user-a.jar:/app.jar \
--hostname service-user-a-slave \
-p 8722:8721 --network test-net \
--privileged=true \
-d java:8 \
java -jar /app.jar
