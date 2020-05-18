package fun.jwei.hungerserver.dto;

import lombok.Data;

import java.util.List;

@Data
public class ShopCarDTO {
    private List<ShopCarAndGoods> shopCarAndGoods;
    private float sumPrice;
    private int count;

    public ShopCarDTO(List<ShopCarAndGoods> shopCarAndGoods) {
        this.shopCarAndGoods = shopCarAndGoods;
        this.sumPrice = 0;
        this.count = 0;
        for (ShopCarAndGoods shopCarAndGood : shopCarAndGoods) {
            sumPrice += shopCarAndGood.getGoods().getPrice()
                    * shopCarAndGood.getShopCar().getSum();
            count += shopCarAndGood.getShopCar().getSum();
        }
    }
}
