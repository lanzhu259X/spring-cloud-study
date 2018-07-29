docker run --rm --name consumer-ribbon \
-v /workspace/webapp/spring-cloud-study/consumer-ribbon.jar:/app.jar \
--hostname consumer-ribbon \
-p 8731:8731 --network test-net \
--privileged=true \
-d java:8 \
java -jar /app.jar
