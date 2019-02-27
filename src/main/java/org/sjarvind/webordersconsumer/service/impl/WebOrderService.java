package org.sjarvind.webordersconsumer.service.impl;

import org.sjarvind.webordersconsumer.entity.WebOrderEntity;
import org.sjarvind.webordersconsumer.repository.WebOrderRepository;
import org.sjarvind.webordersconsumer.service.IWebOrderService;
import org.springframework.stereotype.Service;

@Service
public class WebOrderService implements IWebOrderService {

    private WebOrderRepository webOrderRepository;

    public WebOrderService(WebOrderRepository webOrderRepository) {
        this.webOrderRepository = webOrderRepository;
    }

    @Override
    public void saveWebOrder(WebOrderEntity webOrderEntity) {
        webOrderRepository.save(webOrderEntity);
    }

    @Override
    public Iterable<WebOrderEntity> getAllWebOrders() {
        return webOrderRepository.findAll();
    }

}
