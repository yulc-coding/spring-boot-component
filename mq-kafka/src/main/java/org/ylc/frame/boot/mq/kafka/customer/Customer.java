package org.ylc.frame.boot.mq.kafka.customer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.ylc.frame.boot.mq.kafka.constants.TopicConstant;

/**
 * 代码全万行，注释第一行
 * 注释不规范，同事泪两行
 * <p>
 * 消费者
 *
 * @author YuLc
 * @since 1.0
 */
@Slf4j
@Component
public class Customer {

    @KafkaListener(topics = TopicConstant.DEFAULT_TOPIC)
    public void defaultTopic(String message) {
        log.info("get message: {} from default topic", message);
    }
}
