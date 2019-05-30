package demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import demo.entity.User;

import java.util.List;

/**
 * 用户Mapper
 *
 * @author zhenggc
 * @date 2019/5/30
 */
public interface UserMapper extends BaseMapper<User> {

    /**
     * 查询所有年龄大于18岁的用户
     *
     * @return 用户列表
     * @author zhenggc
     * @date 2019/5/30
     */
    List<User> getUserOver18();

    /**
     * 查询所有用户
     *
     * @return 用户列表
     * @author zhenggc
     * @date 2019/5/30
     */
    List<User> getAllUser();
}
