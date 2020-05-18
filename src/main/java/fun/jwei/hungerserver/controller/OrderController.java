package fun.jwei.hungerserver.controller;

import fun.jwei.hungerserver.dto.OrderDTO;
import fun.jwei.hungerserver.dto.ShopCarDTO;
import fun.jwei.hungerserver.result.Result;
import fun.jwei.hungerserver.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("order")
public class OrderController {
    private OrderService orderService;

    @GetMapping("add")
    public Result<String> add(Long userId) {
        orderService.add(userId);
        return new Result<>("添加订单成功！");
    }

    @GetMapping("get")
    public Result<List<OrderDTO>> get(Long userId) {
        return new Result<>(orderService.get(userId));
    }

    @Autowired
    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }
}
