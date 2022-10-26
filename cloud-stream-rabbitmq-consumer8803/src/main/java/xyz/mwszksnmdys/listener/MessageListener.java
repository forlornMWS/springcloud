package xyz.mwszksnmdys.listener;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


@Component
@EnableBinding(Sink.class)
public class MessageListener {
    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT)
    public void getMessage(Message<String> message) throws InterruptedException{
//        Thread.sleep(2000L);
        System.err.println("接收到的消息：" + message.getPayload() + " serverPort: " + serverPort);
    }
}
