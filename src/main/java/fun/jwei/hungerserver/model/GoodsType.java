package fun.jwei.hungerserver.model;

public class GoodsType {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_type.id
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_type.goods_id
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    private Long goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_type.type_id
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    private Long typeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_type.parent_id
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    private Long parentId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_type.id
     *
     * @return the value of goods_type.id
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_type.id
     *
     * @param id the value for goods_type.id
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_type.goods_id
     *
     * @return the value of goods_type.goods_id
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_type.goods_id
     *
     * @param goodsId the value for goods_type.goods_id
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_type.type_id
     *
     * @return the value of goods_type.type_id
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    public Long getTypeId() {
        return typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_type.type_id
     *
     * @param typeId the value for goods_type.type_id
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_type.parent_id
     *
     * @return the value of goods_type.parent_id
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_type.parent_id
     *
     * @param parentId the value for goods_type.parent_id
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }
}