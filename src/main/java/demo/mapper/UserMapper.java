package demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import demo.entity.User;
import demo.vo.UserVO;

import java.util.List;
import java.util.Map;

/**
 * 用户Mapper
 *
 * @author zhenggc
 * @date 2019/5/30
 */
public interface UserMapper extends BaseMapper<User> {

    /**
     * 查询所有用户
     *
     * @param sqlMap 查询条件
     * @return 用户列表
     * @author zhenggc
     * @date 2019/5/30
     */
    List<UserVO> getUserList(Map<String, Object> sqlMap);

    /**
     * 查询所有年龄大于18岁的用户
     *
     * @param sqlMap 查询条件
     * @return 用户列表
     * @author zhenggc
     * @date 2019/5/30
     */
    List<UserVO> getUserOverAge(Map<String, Object> sqlMap);

    /**
     * 查询所有用户
     *
     * @param sqlMap 查询条件
     * @return 用户列表
     * @author zhenggc
     * @date 2019/5/30
     */
    List<UserVO> getUserByIdList(Map<String, Object> sqlMap);
}
