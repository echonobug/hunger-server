package fun.jwei.hungerserver.controller;

import fun.jwei.hungerserver.mapper.GoodsTypeMapper;
import fun.jwei.hungerserver.mapper.TypeMapper;
import fun.jwei.hungerserver.model.Type;
import fun.jwei.hungerserver.result.Result;
import fun.jwei.hungerserver.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("type")
public class TypeController {
    private GoodsTypeMapper goodsTypeMapper;
    private TypeMapper typeMapper;
    private TypeService typeService;


    @GetMapping("getAll")
    public Result<List<Type>> getAll(Long shopId){
        return new Result<>(typeService.getAll(shopId));
    }

    @Autowired
    public void setTypeService(TypeService typeService) {
        this.typeService = typeService;
    }

    @Autowired
    public void setGoodsTypeMapper(GoodsTypeMapper goodsTypeMapper) {
        this.goodsTypeMapper = goodsTypeMapper;
    }

    @Autowired
    public void setTypeMapper(TypeMapper typeMapper) {
        this.typeMapper = typeMapper;
    }
}
