package com.edamicroservices.stockservice.stock_service.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.edamicroservices.basedomains.basedomains.dto.OrderEvent;

@Service
public class OrderConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderConsumer.class);

    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(final OrderEvent event) {
        LOGGER.info(String.format("Order event received n stock service : %s", event.toString()));

        //ToDo : Save Event to Database
    }
}
