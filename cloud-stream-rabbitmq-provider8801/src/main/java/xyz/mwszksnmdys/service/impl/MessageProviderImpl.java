package xyz.mwszksnmdys.service.impl;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import xyz.mwszksnmdys.service.IMessageProvider;

import javax.annotation.Resource;
import javax.xml.transform.Source;
import java.util.UUID;

@Service
@EnableBinding(Source.class)
public class MessageProviderImpl implements IMessageProvider {

    @Resource
    private MessageChannel output;

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.printf("************serial:%s*******%n", serial);
        return null;
    }
}
