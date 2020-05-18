package fun.jwei.hungerserver.controller;

import fun.jwei.hungerserver.mapper.UserMapper;
import fun.jwei.hungerserver.model.User;
import fun.jwei.hungerserver.result.Result;
import fun.jwei.hungerserver.result.ResultEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("user")
public class UserController {
    private UserMapper userMapper;

    @PostMapping("login")
    public Result<User> login(@RequestBody User loginUser) {
        User user = userMapper.selectByPrimaryKey(loginUser.getId());
        if (user != null) {
            if (loginUser.getPasswd().equals(user.getPasswd())) {
                return new Result<>(ResultEnum.LOGIN_SUCCESS, user);
            }
        }
        return new Result<>(ResultEnum.LOGIN_FAIL);
    }

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}
