package cn.bdqn.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Package: cn.bdqn.mapper
 * @Description:
 * @Author kk
 * @Create 2021年05月06日 15时54分34秒
 */
@Mapper
@Repository
public interface SaleMapper {

    List<Map<String,Object>> queryAll(Integer sort);

    List<Map<String,Object>> queryProduct();

    Integer addSale(Map<Object,Object> map);

    Integer updateProduct(@Param("quantity") Integer quantity,
                          @Param("id") Integer id);

    Integer quantity(Integer quantityId);
}
