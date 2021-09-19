package in2021winter.study.controller;

/**
 * @author HuangHai
 * @date 2021/2/24 21:46
 */

import in2021winter.study.domain.User;
import in2021winter.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 此类为测试springMVC的controller
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("findAll")
    public ModelAndView findAll(ModelMap map ){
        ModelAndView modelAndView=new ModelAndView();
        List<User> all = userService.findAll();
        modelAndView.addObject("users",all);
        modelAndView.setViewName("success");
        System.out.println("表现层查询所有运行");
        return modelAndView;
    }

    @RequestMapping("SfindAll")
    public String SfindAll(Model model){
        List<User> all = userService.findAll();
        model.addAttribute("users",all);
        System.out.println("表现层查询所有运行");
        return "success";
    }

    @RequestMapping("saveUser")
    public String saveUser(User user){
        userService.saveUser(user);
       // int s=2/0;
        System.out.println("表现层保存用户运行");
        return "success";
    }
}
