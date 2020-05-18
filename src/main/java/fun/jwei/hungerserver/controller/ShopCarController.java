package fun.jwei.hungerserver.controller;

import fun.jwei.hungerserver.dto.ShopCarDTO;
import fun.jwei.hungerserver.mapper.ShopCarMapper;
import fun.jwei.hungerserver.model.ShopCar;
import fun.jwei.hungerserver.result.Result;
import fun.jwei.hungerserver.result.ResultEnum;
import fun.jwei.hungerserver.service.ShopCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("car")
public class ShopCarController {
    private ShopCarMapper shopCarMapper;
    private ShopCarService shopCarService;

    @GetMapping("get")
    public Result<ShopCarDTO> get(Long userId) {
        return new Result<>(shopCarService.get(userId));
    }

    @GetMapping("del")
    public Result<Boolean> del(Long userId) {
        return new Result<>(shopCarService.del(userId));
    }

    @PostMapping("add")
    public Result<Object> add(@RequestBody ShopCar shopCar) {
        Boolean isOk = shopCarService.add(shopCar);
        if (isOk) {
            return new Result(ResultEnum.ADD_SUCCESS);
        } else {
            return new Result(ResultEnum.ADD_FAIL);
        }
    }

    @Autowired
    public void setShopCarMapper(ShopCarMapper shopCarMapper) {
        this.shopCarMapper = shopCarMapper;
    }

    @Autowired
    public void setShopCarService(ShopCarService shopCarService) {
        this.shopCarService = shopCarService;
    }
}
