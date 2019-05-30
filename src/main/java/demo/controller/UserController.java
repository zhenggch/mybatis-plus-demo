package demo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import demo.entity.User;
import demo.service.IUserService;
import demo.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
     * 查询所有用户信息
     *
     * @return 所有用户信息
     * @author zhenggc
     * @date 2019/5/30
     */
    @PostMapping
    public Page<UserVO> getUserList(@RequestBody User user) {

        return userService.getUserList(user);
    }

    /**
     * 查询所有年龄大于18岁的用户
     *
     * @return 所有用户信息
     * @author zhenggc
     * @date 2019/5/30
     */
    @GetMapping("/over/{age}")
    public List<UserVO> getUserOverAge(@PathVariable Integer age)
    {
        return userService.getUserOverAge(age);
    }

    /**
     * 查询指定用户信息
     *
     * @return 指定用户信息
     * @author zhenggc
     * @date 2019/5/30
     */
    @PostMapping("/list")
    public List<UserVO> getUserByIdList(@RequestBody List<Integer> userIdList) {
        return userService.getUserByIdList(userIdList);
    }
}