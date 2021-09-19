package in2021winter.study.dao;

import in2021winter.study.domain.User;

import java.util.List;

/**
 * @author HuangHai
 * @date 2021/2/24 21:12
 */
public interface IService {



    List<User> findAll();



    void saveUser(User user);
}

