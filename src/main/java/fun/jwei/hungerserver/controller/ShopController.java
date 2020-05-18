package fun.jwei.hungerserver.controller;

import fun.jwei.hungerserver.mapper.ShopMapper;
import fun.jwei.hungerserver.model.Shop;
import fun.jwei.hungerserver.model.ShopExample;
import fun.jwei.hungerserver.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("shop")
public class ShopController {
    private ShopMapper shopMapper;


    @GetMapping("get")
    public Result<List<Shop>> get() {
        ShopExample example = new ShopExample();
        List<Shop> list = shopMapper.selectByExample(example);
        return new Result<>(list);
    }

    @GetMapping("getById")
    public Result<Shop> getById(Long id) {
        Shop shop = shopMapper.selectByPrimaryKey(id);
        return new Result<>(shop);
    }

    @GetMapping("search")
    public Result<List<Shop>> search(String keyword) {
        ShopExample example = new ShopExample();
        example.createCriteria().andNameLike("%"+keyword+"%");
        List<Shop> list = shopMapper.selectByExample(example);
        return new Result<>(list);
    }



    @Autowired
    public void setShopMapper(ShopMapper shopMapper) {
        this.shopMapper = shopMapper;
    }
}
