package fun.jwei.hungerserver.dto;

import fun.jwei.hungerserver.model.Order;
import lombok.Data;

@Data
public class OrderDTO {
    private Order order;
    private float price;
    private int count;
    private String time;
}
