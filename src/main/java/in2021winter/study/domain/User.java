package in2021winter.study.domain;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author HuangHai
 * @date 2021/2/24 21:07
 */

@Component("user")
public class User implements Serializable {
    private int id;
    private String role_name;
    private String role_desc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getRole_desc() {
        return role_desc;
    }

    public void setRole_desc(String role_desc) {
        this.role_desc = role_desc;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", role_name='" + role_name + '\'' +
                ", role_desc='" + role_desc + '\'' +
                '}';
    }
}
