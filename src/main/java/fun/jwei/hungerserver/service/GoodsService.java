package fun.jwei.hungerserver.service;

import fun.jwei.hungerserver.dto.GoodsDTO;
import fun.jwei.hungerserver.mapper.GoodsMapper;
import fun.jwei.hungerserver.mapper.GoodsTypeMapper;
import fun.jwei.hungerserver.model.Goods;
import fun.jwei.hungerserver.model.GoodsExample;
import fun.jwei.hungerserver.model.GoodsType;
import fun.jwei.hungerserver.model.GoodsTypeExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GoodsService {
    private GoodsMapper goodsMapper;
    private GoodsTypeMapper goodsTypeMapper;


    public List<GoodsDTO> getAll(Long shopId) {
        GoodsExample example = new GoodsExample();
        example.createCriteria().andParentIdEqualTo(shopId);
        example.setOrderByClause("sales_count desc");
        List<Goods> goodsList = goodsMapper.selectByExample(example);
        List<GoodsDTO> goodsDTOList = new ArrayList<>();
        for (Goods goods : goodsList) {
            goodsDTOList.add(new GoodsDTO(goods));
        }
        return goodsDTOList;
    }

    public List<GoodsDTO> getByType(Long shopId, Long typeId) {
        GoodsTypeExample goodsTypeExample = new GoodsTypeExample();
        goodsTypeExample.createCriteria().andParentIdEqualTo(shopId).andTypeIdEqualTo(typeId);
        List<GoodsType> goodsTypes = goodsTypeMapper.selectByExample(goodsTypeExample);
        List<Long> idList = new ArrayList<>();
        for (GoodsType goodsType : goodsTypes) {
            idList.add(goodsType.getGoodsId());
        }
        GoodsExample goodsExample = new GoodsExample();
        goodsExample.createCriteria().andIdIn(idList);
        List<Goods> goodsList = goodsMapper.selectByExample(goodsExample);
        List<GoodsDTO> goodsDTOList = new ArrayList<>();
        for (Goods goods : goodsList) {
            goodsDTOList.add(new GoodsDTO(goods));
        }
        return goodsDTOList;
    }


    @Autowired
    public void setGoodsTypeMapper(GoodsTypeMapper goodsTypeMapper) {
        this.goodsTypeMapper = goodsTypeMapper;
    }

    @Autowired
    public void setGoodsMapper(GoodsMapper goodsMapper) {
        this.goodsMapper = goodsMapper;
    }
}
