package fun.jwei.hungerserver.service;

import fun.jwei.hungerserver.dto.OrderDTO;
import fun.jwei.hungerserver.dto.ShopCarAndGoods;
import fun.jwei.hungerserver.dto.ShopCarDTO;
import fun.jwei.hungerserver.mapper.GoodsMapper;
import fun.jwei.hungerserver.mapper.OrderGoodsMapper;
import fun.jwei.hungerserver.mapper.OrderMapper;
import fun.jwei.hungerserver.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class OrderService {
    private OrderMapper orderMapper;
    private OrderGoodsMapper orderGoodsMapper;
    private GoodsMapper goodsMapper;
    private ShopCarService shopCarService;

    public Boolean add(Long userId) {
        ShopCarDTO shopCarDTO = shopCarService.get(userId);
        if (shopCarDTO.getCount() == 0) {
            return false;
        }
        shopCarService.del(userId);
        Order order = new Order();
        order.setUserId(userId);
        order.setCreateTime(System.currentTimeMillis());
        orderMapper.insertSelective(order);
        for (ShopCarAndGoods shopCarAndGood : shopCarDTO.getShopCarAndGoods()) {
            OrderGoods orderGoods = new OrderGoods();
            orderGoods.setGoodsId(shopCarAndGood.getGoods().getId());
            orderGoods.setOrderId(order.getId());
            orderGoods.setNum(shopCarAndGood.getShopCar().getSum());
            orderGoodsMapper.insertSelective(orderGoods);
        }
        return true;
    }

    public List<OrderDTO> get(Long userId) {
        ArrayList<OrderDTO> orderDTOS = new ArrayList<>();
        OrderExample orderExample = new OrderExample();
        orderExample.createCriteria().andUserIdEqualTo(userId);
        List<Order> orders = orderMapper.selectByExample(orderExample);
        for (Order order : orders) {
            OrderDTO orderDTO = new OrderDTO();
            orderDTO.setOrder(order);
            OrderGoodsExample orderGoodsExample = new OrderGoodsExample();
            orderGoodsExample.createCriteria().andOrderIdEqualTo(order.getId());
            List<OrderGoods> orderGoods = orderGoodsMapper.selectByExample(orderGoodsExample);
            float price = 0;
            int count = 0;
            for (OrderGoods orderGood : orderGoods) {
                count += orderGood.getNum();
                Goods goods = goodsMapper.selectByPrimaryKey(orderGood.getGoodsId());
                price += goods.getPrice() * orderGood.getNum();
            }
            orderDTO.setCount(count);
            orderDTO.setPrice(price);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            orderDTO.setTime(sdf.format(new Date(order.getCreateTime())));
            orderDTOS.add(orderDTO);
        }
        return orderDTOS;
    }

    @Autowired
    public void setOrderMapper(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }

    @Autowired
    public void setOrderGoodsMapper(OrderGoodsMapper orderGoodsMapper) {
        this.orderGoodsMapper = orderGoodsMapper;
    }

    @Autowired
    public void setGoodsMapper(GoodsMapper goodsMapper) {
        this.goodsMapper = goodsMapper;
    }

    @Autowired
    public void setShopCarService(ShopCarService shopCarService) {
        this.shopCarService = shopCarService;
    }

}
