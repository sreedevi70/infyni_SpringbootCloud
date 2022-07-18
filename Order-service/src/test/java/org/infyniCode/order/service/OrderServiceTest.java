package org.infyniCode.order.service;
import org.application.entity.Order;
import org.application.repo.OrderRepo;
import org.application.service.impl.OrderService;
import org.infyniCode.model.OrderResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

@ExtendWith(MockitoExtension.class)
public class OrderServiceTest {
    @Mock
    private  OrderRepo orderRepo;
    @Mock
    private ModelMapper modelMapper;

    @InjectMocks
    private OrderService orderService;

    @Test
    public void CreateOrderTest(){
    /*    OrderResponse orderResponse = getOrderResponse("ipad",15,"xxx");
        OrderResponse convertedMO = getOrderResponse();
        convertedMO.setId(1);
        Order order = getOrder();
        Order orderCreated = getOrder();
        orderCreated.setId(1);
        Mockito.when(modelMapper.map(orderResponse, Order.class)).thenReturn(order);
        Mockito.when(orderRepo.save(order)).thenReturn(orderCreated);
        OrderResponse response = OrderService.createOrder(OrderResponse);
        Assertions.assertNotNull(response);
        Assertions.assertEquals(1,response.getId());
        Mockito.verify(modelMapper.Mockito.times(1).map(orderResponse, Order.class));
        Mockito.verify(orderRepo.Mockito.times(1).save(order)).thenReturn(orderCreated);
*/
    }

 /*   private Order getOrder(){
        return Order.builder()
                .productName("iphone")
                .qty(10)
                .orderId("aaaa")
                .build();
    }

   private OrderResponse getOrderResponse(){
        return OrderResponse.
                .productName("ipad")
                .qty(15)
                .orderId("xxxx")
                .build();
    }*/


}
