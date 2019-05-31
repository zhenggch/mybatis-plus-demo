package demo.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import demo.dto.UserDTO;
import demo.entity.User;
import demo.vo.UserVO;

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
     * @param userDTO 查询条件
     * @return 所有用户信息
     * @author zhenggc
     * @date 2019/5/30
     */
    Page<UserVO> getUserList(UserDTO userDTO);

    /**
     * 查询正常用户
     *
     * @return 正常用户信息
     * @author zhenggc
     * @date 2019/5/30
     */
    List<User> getNormalUserList();

    /**
     * 查询所有年龄大于18岁的用户
     *
     * @param age 年龄
     * @return 所有用户信息
     * @author zhenggc
     * @date 2019/5/30
     */
    List<UserVO> getUserOverAge(Integer age);

    /**
     * 查询指定用户信息
     *
     * @param userIdList 用户ID集合
     * @return 指定用户信息
     * @author zhenggc
     * @date 2019/5/30
     */
    List<UserVO> getUserByIdList(List<Integer> userIdList);

    /**
     * 新增用户信息
     *
     * @param userDTO 用户信息
     * @return 用户信息
     * @author zhenggc
     * @date 2019/5/30
     */
    User saveUser(UserDTO userDTO);
}
