package com.consumerproducer.consumer;

import com.consumerproducer.constants.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = Constants.TOPIC_NAME,
        groupId = Constants.GROUP_ID
    )
    public void consume(String msg){
        logger.info(msg);
    }

}
