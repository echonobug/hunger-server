package fun.jwei.hungerserver.controller;

import fun.jwei.hungerserver.dto.GoodsDTO;
import fun.jwei.hungerserver.mapper.GoodsMapper;
import fun.jwei.hungerserver.model.Goods;
import fun.jwei.hungerserver.result.Result;
import fun.jwei.hungerserver.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("goods")
@CrossOrigin
public class GoodsController {
    private GoodsMapper goodsMapper;
    private GoodsService goodsService;

    @GetMapping("get")
    public Result<List<Goods>> getAll(Long shopId) {
        List<GoodsDTO> list = goodsService.getAll(shopId);
        return new Result(list);
    }

    @GetMapping("getById")
    public Result<GoodsDTO> getById(Long id) {
        Goods goods = goodsMapper.selectByPrimaryKey(id);
        return new Result(new GoodsDTO(goods));
    }

    @GetMapping("getByType")
    public Result<List<Goods>> getByType(Long shopId,Long typeId) {
        List<GoodsDTO> list = goodsService.getByType(shopId,typeId);
        return new Result(list);
    }


    @Autowired
    public void setGoodsMapper(GoodsMapper goodsMapper) {
        this.goodsMapper = goodsMapper;
    }

    @Autowired
    public void setGoodsService(GoodsService goodsService) {
        this.goodsService = goodsService;
    }
}
