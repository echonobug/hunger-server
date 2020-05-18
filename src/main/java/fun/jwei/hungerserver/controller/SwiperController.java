package fun.jwei.hungerserver.controller;

import fun.jwei.hungerserver.mapper.SwiperImgMapper;
import fun.jwei.hungerserver.model.SwiperImg;
import fun.jwei.hungerserver.model.SwiperImgExample;
import fun.jwei.hungerserver.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("swiper")
public class SwiperController {
    private SwiperImgMapper swiperImgMapper;

    @GetMapping("get")
    public Result<List<SwiperImg>> getAll() {
        SwiperImgExample example = new SwiperImgExample();
        example.setOrderByClause("seq");
        List<SwiperImg> list = swiperImgMapper.selectByExample(example);
        return new Result<>(list);
    }

    @Autowired
    public void setSwiperImgMapper(SwiperImgMapper swiperImgMapper) {
        this.swiperImgMapper = swiperImgMapper;
    }
}
