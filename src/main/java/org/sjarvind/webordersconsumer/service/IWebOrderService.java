package org.sjarvind.webordersconsumer.service;

import org.sjarvind.webordersconsumer.entity.WebOrderEntity;

public interface IWebOrderService {

    void saveWebOrder(WebOrderEntity webOrderEntity);

    Iterable<WebOrderEntity> getAllWebOrders();

}
