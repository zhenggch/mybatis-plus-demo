package demo.service.impl;

import demo.entity.User;
import demo.mapper.UserMapper;
import demo.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户服务接口实现
 *
 * @author zhenggc
 * @date 2019/5/30
 */
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;

    /**
     * 查询所有用户
     *
     * @return 所有用户信息
     * @author zhenggc
     * @date 2019/5/30
     */
    @Override
    public List<User> getUserList() {
        return userMapper.selectList(null);
    }

    /**
     * 查询所有年龄大于18岁的用户
     *
     * @return 所有用户信息
     * @author zhenggc
     * @date 2019/5/30
     */
    @Override
    public List<User> getUserOver18() {
        System.out.println("success");
        return userMapper.getUserOver18();
    }

    /**
     * 查询所有用户
     *
     * @return 所有用户信息
     * @author zhenggc
     * @date 2019/5/30
     */
    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }
}
