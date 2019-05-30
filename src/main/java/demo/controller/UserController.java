package demo.controller;

import demo.entity.User;
import demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户管理DEMO
 *
 * @author zhenggc
 * @date 2019/5/30
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private final IUserService userService;

    @Autowired
    public UserController(IUserService userService) {
        this.userService = userService;
    }

    /**
     * 查询所有用户
     *
     * @return 所有用户信息
     * @author zhenggc
     * @date 2019/5/30
     */
    @GetMapping
    public List<User> getUserList() {

        return userService.getUserList();
    }

    /**
     * 查询所有年龄大于18岁的用户
     *
     * @return 所有用户信息
     * @author zhenggc
     * @date 2019/5/30
     */
    @GetMapping("/over/18")
    public List<User> getUserOver18() {
        return userService.getUserOver18();
    }

    /**
     * 查询所有用户
     *
     * @return 所有用户信息
     * @author zhenggc
     * @date 2019/5/30
     */
    @GetMapping("/all")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }
}