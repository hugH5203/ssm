package in2021winter.study.dao;

import in2021winter.study.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author HuangHai
 * @date 2021/2/24 21:06
 */

@Repository("userDao")
public interface IUserDao {

    @Select("select * from role")
    List<User> findAll();


    @Insert("insert into role(id,role_name,role_desc) values(#{id},#{role_name},#{role_desc})")
    void saveUser(User user);
}
