package in2021winter.study.service;

import in2021winter.study.dao.IUserDao;
import in2021winter.study.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author HuangHai
 * @date 2021/2/24 21:12
 */

@Service("userService")
public class UserService implements IUserDao {

    @Autowired
    private IUserDao userDao;


    @Override
    public List<User> findAll() {
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }
        System.out.println("----------------------------------------------");
        System.out.println("数据层查询所有执行");
        System.out.println("业务层查询所有运行");
        return users;
    }

    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
        System.out.println("数据层保存用户执行");
        System.out.println("业务层保存用户运行");
    }
}
