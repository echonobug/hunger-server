package fun.jwei.hungerserver.dto;

import fun.jwei.hungerserver.model.Goods;
import lombok.Data;

import java.text.DecimalFormat;

@Data
public class GoodsDTO {
    Goods goods;
    String goodRate;

    public GoodsDTO(Goods goods) {
        this.goods = goods;
        DecimalFormat df = new DecimalFormat("0.00%");
        this.goodRate = df.format((double) goods.getLikeCount() / goods.getSalesCount());
    }
}
