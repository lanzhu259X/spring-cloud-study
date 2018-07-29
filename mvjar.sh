## 把每个服务的jar包移动到对应的docker启动脚本的位置，方便docker构建容器启动实例。

echo 'copy ./discovery-eureka/target/discovery-eureka-1.0.0.jar to /d/dockerdata/workspace/webapp/spring-cloud-study/'

cp ./discovery-eureka/target/discovery-eureka-1.0.0.jar /d/dockerdata/workspace/webapp/spring-cloud-study/discovery-eureka.jar

echo 'copy ./config-server/target/config-server-1.0.0.jar to /d/dockerdata/workspace/webapp/spring-cloud-study/'

cp ./config-server/target/config-server-1.0.0.jar /d/dockerdata/workspace/webapp/spring-cloud-study/config-server.jar

echo 'copy ./service-user/service-user-a/target/service-user-a-1.0.0.jar to /d/dockerdata/workspace/webapp/spring-cloud-study/'

cp ./service-user/service-user-a/target/service-user-a-1.0.0.jar /d/dockerdata/workspace/webapp/spring-cloud-study/service-user-a.jar

echo 'copy ./service-user/service-user-b/target/service-user-b-1.0.0.jar to /d/dockerdata/workspace/webapp/spring-cloud-study/'

cp ./service-user/service-user-b/target/service-user-b-1.0.0.jar /d/dockerdata/workspace/webapp/spring-cloud-study/service-user-b.jar

echo 'copy ./service-user/service-user-b/target/service-user-b-1.0.0.jar to /d/dockerdata/workspace/webapp/spring-cloud-study/'

cp ./consumer-demo/consumer-ribbon/target/consumer-ribbon-1.0.0.jar /d/dockerdata/workspace/webapp/spring-cloud-study/consumer-ribbon.jar


cp ./consumer-demo/consumer-feign/target/consumer-feign-1.0.0.jar /d/dockerdata/workspace/webapp/spring-cloud-study/consumer-feign.jar

cp ./api-gateway/target/api-gateway-1.0.0.jar /d/dockerdata/workspace/webapp/spring-cloud-study/api-gateway.jar
