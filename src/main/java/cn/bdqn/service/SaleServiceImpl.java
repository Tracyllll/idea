package cn.bdqn.service;

import cn.bdqn.mapper.SaleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Package: cn.bdqn.service
 * @Description:
 * @Author kk
 * @Create 2021年05月06日 15时54分23秒
 */
@Service
public class SaleServiceImpl {

    @Autowired
    private SaleMapper saleMapper;

    public List<Map<String,Object>> queryAll(Integer sort){
        return saleMapper.queryAll(sort);
    }

    public List<Map<String,Object>> queryProduct(){
        return saleMapper.queryProduct();
    }

    public Integer addSale(Map<Object,Object> map){
        Integer productId = (int)map.get("productId");
        Integer quantity = saleMapper.quantity(productId);
        saleMapper.updateProduct(quantity-(int)map.get("quantity"),productId);
        return saleMapper.addSale(map);
    }

    public Integer queryQuantity(Integer productid){
        return saleMapper.quantity(productid);
    }
}
