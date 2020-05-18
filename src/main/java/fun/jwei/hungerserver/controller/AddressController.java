package fun.jwei.hungerserver.controller;

import fun.jwei.hungerserver.mapper.AddressMapper;
import fun.jwei.hungerserver.model.Address;
import fun.jwei.hungerserver.model.AddressExample;
import fun.jwei.hungerserver.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("addr")
public class AddressController {
    private AddressMapper addressMapper;

    @GetMapping("get")
    public Result<Address> get(Long userId) {
        AddressExample example = new AddressExample();
        example.createCriteria().andUserIdEqualTo(userId);
        List<Address> addresses = addressMapper.selectByExample(example);
        if (addresses.size() == 0) {
            return new Result<>(new Address());
        }
        return new Result<>(addresses.get(0));
    }

    @PostMapping("save")
    public Result<String> save(@RequestBody Address address) {
        AddressExample example = new AddressExample();
        example.createCriteria().andUserIdEqualTo(address.getUserId());
        addressMapper.deleteByExample(example);
        addressMapper.insertSelective(address);
        return new Result<>("保存成功！");
    }

    @Autowired
    public void setAddressMapper(AddressMapper addressMapper) {
        this.addressMapper = addressMapper;
    }
}
