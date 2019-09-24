package demo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import demo.dto.UserDTO;
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
    @PostMapping("/all/page")
    public Page<UserVO> getUserListPage(@RequestBody UserDTO userDTO) {

        return userService.getUserListPage(userDTO);
    }

    /**
     * 查询所有用户信息
     *
     * @return 所有用户信息
     * @author zhenggc
     * @date 2019/5/30
     */
    @PostMapping("/all")
    public List<UserVO> getUserList(@RequestBody UserDTO userDTO) {

        return userService.getUserList(userDTO);
    }

    /**
     * 查询正常的用户信息
     *
     * @return 正常用户信息
     * @author zhenggc
     * @date 2019/5/30
     */
    @GetMapping("/normal")
    public List<User> getNormalUserList() {

        return userService.getNormalUserList();
    }

    /**
     * 查询所有年龄大于18岁的用户
     *
     * @return 所有用户信息
     * @author zhenggc
     * @date 2019/5/30
     */
    @GetMapping("/over/{age}")
    public List<UserVO> getUserOverAge(@PathVariable Integer age) {
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

    /**
     * 新增用户信息
     *
     * @return 用户信息
     * @author zhenggc
     * @date 2019/5/30
     */
    @PostMapping
    public User addUser(@RequestBody UserDTO userDTO) {
        return userService.addUser(userDTO);
    }

    /**
     * 删除用户信息
     *
     * @author zhenggc
     * @date 2019/5/30
     */
    @DeleteMapping
    public void deleteUser(@RequestBody List<Integer> idList) {
        userService.deleteUser(idList);
    }

    /**
     * 新增或修改用户信息
     *
     * @author zhenggc
     * @date 2019/8/26
     */
    @PostMapping("/save")
    public void saveUser(@RequestBody UserDTO userDTO) {
        userService.saveUser(userDTO);
    }
}