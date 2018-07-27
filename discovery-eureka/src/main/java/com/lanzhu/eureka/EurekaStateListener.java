package com.lanzhu.eureka;

import com.netflix.appinfo.InstanceInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.eureka.server.event.*;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EurekaStateListener {

    private static final Logger log = LoggerFactory.getLogger(EurekaStateListener.class);

    @EventListener
    public void listen(EurekaInstanceCanceledEvent event) {
        log.info("serverId:{} --> appName:{} 服务下线.", event.getServerId(), event.getAppName());
    }

    @EventListener
    public void listen(EurekaInstanceRegisteredEvent event) {
        InstanceInfo instanceInfo = event.getInstanceInfo();
        log.info("appName:{} 进行注册.", instanceInfo.getAppName());
    }

    @EventListener
    public void listen(EurekaInstanceRenewedEvent event) {
        log.info("serverId:{} --> appName:{} 服务进行续约.", event.getServerId(), event.getAppName());
    }

    @EventListener
    public void listen(EurekaRegistryAvailableEvent event) {
        log.info("注册中心 启动.");
    }

    @EventListener
    public void listen(EurekaServerStartedEvent event) {
        log.info("Eureka Server 启动.");
    }
}
