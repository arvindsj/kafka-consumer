package org.sjarvind.webordersconsumer.service.impl;

import org.sjarvind.webordersconsumer.entity.WebOrder;
import org.sjarvind.webordersconsumer.entity.WebOrderEntity;
import org.sjarvind.webordersconsumer.service.IWebOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumeService {

    private static final Logger log = LoggerFactory.getLogger(ConsumeService.class);

    @Autowired
    IWebOrderService webOrderService;

    @KafkaListener(topics = "${order.topic}", group = "${group.id}", containerFactory = "kafkaListenerContainerFactory")
    public void pollTopic(final WebOrder webOrder) {
        log.info("Incoming WebOrder :: " + webOrder);
        WebOrderEntity entity = new WebOrderEntity(webOrder.getName(), webOrder.getDescription(), webOrder.getUnits(), webOrder.getPrice());
        webOrderService.saveWebOrder(entity);
        webOrderService.getAllWebOrders().forEach(web -> log.info("Web Orders:: " + web.toString()));
    }


}
