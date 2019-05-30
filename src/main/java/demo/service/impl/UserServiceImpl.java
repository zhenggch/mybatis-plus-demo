package demo.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import demo.dto.UserDTO;
import demo.entity.User;
import demo.mapper.UserMapper;
import demo.service.IUserService;
import demo.vo.UserVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public Page<UserVO> getUserList (UserDTO userDTO) {
        Page<UserVO> page = new Page<>();
        page.setSize(userDTO.getSize());
        page.setCurrent(userDTO.getCurrent());
        Map<String, Object> sqlMap = new HashMap<>(2);
        sqlMap.put("page", page);
        sqlMap.put("name", userDTO.getName());
        sqlMap.put("age", userDTO.getAge());
        sqlMap.put("email", userDTO.getEmail());
        return page.setRecords(userMapper.getUserList(sqlMap));
    }

    /**
     * 查询正常用户
     * 逻辑删除
     *
     * @return 正常用户信息
     * @author zhenggc
     * @date 2019/5/30
     */
    @Override
    public List<User> getNormalUserList () {

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
    public List<UserVO> getUserOverAge (Integer age) {
        Map<String, Object> sqlMap = new HashMap<>(2);
        sqlMap.put("age", age);
        return userMapper.getUserOverAge(sqlMap);
    }

    /**
     * 查询指定用户
     *
     * @return 指定用户信息
     * @author zhenggc
     * @date 2019/5/30
     */
    @Override
    public List<UserVO> getUserByIdList(List<Integer> userIdList) {
        Map<String, Object> sqlMap = new HashMap<>(2);
        sqlMap.put("list", userIdList);
        return userMapper.getUserByIdList(sqlMap);
    }
}
