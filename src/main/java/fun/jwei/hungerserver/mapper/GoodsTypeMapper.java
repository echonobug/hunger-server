package fun.jwei.hungerserver.mapper;

import fun.jwei.hungerserver.model.GoodsType;
import fun.jwei.hungerserver.model.GoodsTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_type
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    long countByExample(GoodsTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_type
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    int deleteByExample(GoodsTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_type
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_type
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    int insert(GoodsType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_type
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    int insertSelective(GoodsType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_type
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    List<GoodsType> selectByExample(GoodsTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_type
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    GoodsType selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_type
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    int updateByExampleSelective(@Param("record") GoodsType record, @Param("example") GoodsTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_type
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    int updateByExample(@Param("record") GoodsType record, @Param("example") GoodsTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_type
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    int updateByPrimaryKeySelective(GoodsType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_type
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    int updateByPrimaryKey(GoodsType record);
}