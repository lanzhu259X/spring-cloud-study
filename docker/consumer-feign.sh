docker run --rm --name consumer-feign \
-v /workspace/webapp/spring-cloud-study/consumer-feign.jar:/app.jar \
--hostname consumer-feign \
-p 8732:8732 --network test-net \
--privileged=true \
-d java:8 \
java -jar /app.jar
