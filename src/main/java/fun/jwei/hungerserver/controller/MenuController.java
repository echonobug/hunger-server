package fun.jwei.hungerserver.controller;

import com.github.pagehelper.PageHelper;
import fun.jwei.hungerserver.mapper.MenuMapper;
import fun.jwei.hungerserver.model.Menu;
import fun.jwei.hungerserver.model.MenuExample;
import fun.jwei.hungerserver.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("menu")
public class MenuController {
    private MenuMapper menuMapper;

    @GetMapping("get")
    public Result<List<Menu>> getAll(){
        MenuExample example = new MenuExample();
        example.setOrderByClause("seq");
        PageHelper.startPage(1, 10);
        List<Menu> list = menuMapper.selectByExample(example);
        return new Result<>(list);
    }

    @Autowired
    public void setMenuMapper(MenuMapper menuMapper) {
        this.menuMapper = menuMapper;
    }
}
