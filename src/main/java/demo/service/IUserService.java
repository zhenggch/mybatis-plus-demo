package demo.service;

import demo.entity.User;

import java.util.List;

/**
 * 用户服务接口
 *
 * @author zhenggc
 * @date 2019/5/30
 */
public interface IUserService {

    /**
     * 查询所有用户
     *
     * @return 所有用户信息
     * @author zhenggc
     * @date 2019/5/30
     */
    List<User> getUserList();

    /**
     * 查询所有年龄大于18岁的用户
     *
     * @return 所有用户信息
     * @author zhenggc
     * @date 2019/5/30
     */
    List<User> getUserOver18();

    /**
     * 查询所有用户
     *
     * @return 所有用户信息
     * @author zhenggc
     * @date 2019/5/30
     */
    List<User> getAllUser();
}
