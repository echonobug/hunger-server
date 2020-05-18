package fun.jwei.hungerserver.model;

public class Address {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.id
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.user_id
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.contact
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    private String contact;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.sex
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.phone
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.latitude
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    private String latitude;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.longitude
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    private String longitude;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.addr
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    private String addr;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.id
     *
     * @return the value of address.id
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address.id
     *
     * @param id the value for address.id
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.user_id
     *
     * @return the value of address.user_id
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address.user_id
     *
     * @param userId the value for address.user_id
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.contact
     *
     * @return the value of address.contact
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    public String getContact() {
        return contact;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address.contact
     *
     * @param contact the value for address.contact
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.sex
     *
     * @return the value of address.sex
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address.sex
     *
     * @param sex the value for address.sex
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.phone
     *
     * @return the value of address.phone
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address.phone
     *
     * @param phone the value for address.phone
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.latitude
     *
     * @return the value of address.latitude
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address.latitude
     *
     * @param latitude the value for address.latitude
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.longitude
     *
     * @return the value of address.longitude
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address.longitude
     *
     * @param longitude the value for address.longitude
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.addr
     *
     * @return the value of address.addr
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    public String getAddr() {
        return addr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address.addr
     *
     * @param addr the value for address.addr
     *
     * @mbg.generated Mon May 18 00:33:44 CST 2020
     */
    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }
}