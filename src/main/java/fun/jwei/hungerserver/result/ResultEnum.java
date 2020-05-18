package fun.jwei.hungerserver.result;

public enum ResultEnum {
    SUCCESS(0,"请求成功！"),
    LOGIN_SUCCESS(10000,"登录成功"),
    LOGIN_FAIL(20000,"登录失败，账号或密码错误！"),
    ADD_SUCCESS(10001,"添加成功！"),
    ADD_FAIL(20001,"添加失败");

    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
