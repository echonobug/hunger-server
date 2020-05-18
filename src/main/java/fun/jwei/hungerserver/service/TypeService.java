package fun.jwei.hungerserver.service;

import fun.jwei.hungerserver.mapper.GoodsTypeMapper;
import fun.jwei.hungerserver.mapper.TypeMapper;
import fun.jwei.hungerserver.model.GoodsType;
import fun.jwei.hungerserver.model.GoodsTypeExample;
import fun.jwei.hungerserver.model.Type;
import fun.jwei.hungerserver.model.TypeExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TypeService {
    private TypeMapper typeMapper;
    private GoodsTypeMapper goodsTypeMapper;

    public List<Type> getAll(Long shopId) {
        GoodsTypeExample goodsTypeExample = new GoodsTypeExample();
        goodsTypeExample.createCriteria().andParentIdEqualTo(shopId);
        List<GoodsType> goodsTypes = goodsTypeMapper.selectByExample(goodsTypeExample);
        if (goodsTypes.size() == 0) {
            return null;
        }
        List<Long> idList = new ArrayList<>();
        for (GoodsType goodsType : goodsTypes) {
            idList.add(goodsType.getTypeId());
        }
        TypeExample typeExample = new TypeExample();
        typeExample.setDistinct(true);
        typeExample.createCriteria().andIdIn(idList);
        List<Type> list = typeMapper.selectByExample(typeExample);
        return list;
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
