package org.application.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.application.entity.Order;
import org.application.exception.OrderException;
import org.application.repo.OrderRepo;
import org.infyniCode.model.OrderResponse;
import org.infyniCode.model.PaymentResponse;
import org.infyniCode.model.SuccessResponse;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static org.application.utility.CommonCode.getSuccessResponse;

@Slf4j
@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepo orderRepo;

    private final ModelMapper modelMapper;

    public List<OrderResponse> getAllOrders() {
        List<Order> orders = orderRepo.findAll();
        return orders.stream().map(obj ->
                        modelMapper.map(obj, OrderResponse.class)).
                collect(Collectors.toList());
    }

    public SuccessResponse createOrder(OrderResponse orderResponse) {
        Order order = modelMapper.map(orderResponse, Order.class);
        Order orderCreated = orderRepo.save(order);
        return getSuccessResponse("Order has been Placed",
                HttpStatus.CREATED.value(), "OrderId", orderCreated.getOrderId());
    }

    public OrderResponse getOrder(String orderId) {
        Order order = orderRepo.findByOrderId(orderId).orElseThrow(() -> new OrderException("No Order Found.."));
    /*    PaymentResponse paymentResponse = null;
        //calling payment-service based on orderId
        ResponseEntity<PaymentResponse> responseEntity = restTemplate.getForEntity(paymentServiceEndpoint + orderId, PaymentResponse.class);
        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            paymentResponse = responseEntity.getBody();
        }
        OrderResponse orderResponse = modelMapper.map(order, OrderResponse.class);
        orderResponse.setPaymentInfo(paymentResponse);
        return orderResponse;*/

       return modelMapper.map(order, OrderResponse.class);
    }
}
