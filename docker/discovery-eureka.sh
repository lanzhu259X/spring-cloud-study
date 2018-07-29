docker run --rm --name discovery-eureka \
-v /workspace/webapp/spring-cloud-study/discovery-eureka.jar:/app.jar \
-p 8761:8761 --network test-net \
--hostname distcovery-eureka \
--privileged=true \
-d java:8 \
java -jar /app.jar
