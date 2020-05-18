package fun.jwei.hungerserver.dto;

import fun.jwei.hungerserver.model.Goods;
import fun.jwei.hungerserver.model.ShopCar;
import lombok.Data;

@Data
public class ShopCarAndGoods {
    private ShopCar shopCar;
    private Goods goods;

    public ShopCarAndGoods(ShopCar shopCar, Goods goods) {
        this.shopCar = shopCar;
        this.goods = goods;
    }
}
