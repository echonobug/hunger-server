package fun.jwei.hungerserver.model;

public class Order {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.id
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.user_id
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.create_time
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    private Long createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.id
     *
     * @return the value of t_order.id
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.id
     *
     * @param id the value for t_order.id
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.user_id
     *
     * @return the value of t_order.user_id
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.user_id
     *
     * @param userId the value for t_order.user_id
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.create_time
     *
     * @return the value of t_order.create_time
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.create_time
     *
     * @param createTime the value for t_order.create_time
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}