package org.ylc.frame.boot.mq.kafka.producer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * 代码全万行，注释第一行
 * 注释不规范，同事泪两行
 * <p>
 * 生产者——发送消息
 *
 * @author YuLc
 * @since 1.0
 */
@Slf4j
@Component
public class KafkaPublisher {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaPublisher(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }


    /**
     * 发送消息
     *
     * @param topic   主题
     * @param message 消息
     */
    public void sendMessage(String topic, String message) {
        kafkaTemplate.send(topic, message);
        log.info("topic:{}, message:{}", topic, message);
    }

}
