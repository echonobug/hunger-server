package fun.jwei.hungerserver.service;

import fun.jwei.hungerserver.dto.ShopCarAndGoods;
import fun.jwei.hungerserver.dto.ShopCarDTO;
import fun.jwei.hungerserver.mapper.GoodsMapper;
import fun.jwei.hungerserver.mapper.ShopCarMapper;
import fun.jwei.hungerserver.model.Goods;
import fun.jwei.hungerserver.model.ShopCar;
import fun.jwei.hungerserver.model.ShopCarExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShopCarService {
    private ShopCarMapper shopCarMapper;
    private GoodsMapper goodsMapper;


    public ShopCarDTO get(Long userId) {
        ShopCarExample shopCarExample = new ShopCarExample();
        shopCarExample.createCriteria().andUserIdEqualTo(userId);
        List<ShopCar> shopCars = shopCarMapper.selectByExample(shopCarExample);
        List<ShopCarAndGoods> list = new ArrayList<>();
        for (ShopCar shopCar : shopCars) {
            Goods goods = goodsMapper.selectByPrimaryKey(shopCar.getGoodsId());
            ShopCarAndGoods shopCarAndGoods = new ShopCarAndGoods(shopCar, goods);
            list.add(shopCarAndGoods);
        }
        return new ShopCarDTO(list);
    }

    public Boolean add(ShopCar shopCar) {
        ShopCarExample example = new ShopCarExample();
        example.createCriteria()
                .andUserIdEqualTo(shopCar.getUserId())
                .andGoodsIdEqualTo(shopCar.getGoodsId());
        List<ShopCar> shopCars = shopCarMapper.selectByExample(example);
        if (shopCars.size() == 0) {
            shopCarMapper.insertSelective(shopCar);
        } else {
            ShopCar shopCar1 = shopCars.get(0);
            shopCar1.setSum(shopCar1.getSum() + 1);
            shopCarMapper.updateByPrimaryKey(shopCar1);
        }
        return true;
    }

    public Boolean del(Long userId) {
        ShopCarExample shopCarExample = new ShopCarExample();
        shopCarExample.createCriteria().andUserIdEqualTo(userId);
        shopCarMapper.deleteByExample(shopCarExample);
        return true;
    }

    @Autowired
    public void setShopCarMapper(ShopCarMapper shopCarMapper) {
        this.shopCarMapper = shopCarMapper;
    }

    @Autowired
    public void setGoodsMapper(GoodsMapper goodsMapper) {
        this.goodsMapper = goodsMapper;
    }
}
