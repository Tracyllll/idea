package cn.bdqn.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * @Package: cn.bdqn.dao
 * @Description:
 * @Author kk
 * @Create 2021年05月06日 14时56分46秒
 */
@Mapper
@Repository
public interface UserMapper {

    Map<String,Object> dologin(String username,String password);
}
