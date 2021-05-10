package cn.bdqn.controller;

import cn.bdqn.service.SaleServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Package: cn.bdqn.controller
 * @Description:
 * @Author kk
 * @Create 2021年05月06日 15时53分32秒
 */
@RestController
public class SaleController {

    @Autowired
    private SaleServiceImpl saleService;

    @RequestMapping("queryAll")
    public PageInfo queryAll(@RequestParam(value = "pageNo",defaultValue = "1") Integer pageNo,
                             @RequestParam(value = "sort",required = false) Integer sort){
        PageHelper.startPage(pageNo,2);
        List<Map<String, Object>> map = saleService.queryAll(sort);
        PageInfo<Map<String, Object>> pageInfo = new PageInfo<>(map);
        return pageInfo;
    }

    @RequestMapping("queryProduct")
    public List<Map<String, Object>> queryProduct(){
        return saleService.queryProduct();
    }

    @RequestMapping("addSale")
    public Integer addSale(Integer productid,Integer price,Integer quantity,Integer userid){
        Map<Object,Object> map = new HashMap<>();
        map.put("price",price);
        map.put("quantity",quantity);
        map.put("totalPrice",price*quantity);
        map.put("saleDate",new Date());
        map.put("userId",userid);
        map.put("productId",productid);
        return saleService.addSale(map);
    }

    @RequestMapping("queryQuantity")
    public Integer queryQuantity(Integer productid){
        return saleService.queryQuantity(productid);
    }
}
