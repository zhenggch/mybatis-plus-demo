package demo.vo;

import lombok.Data;

/**
 * 用户VO
 *
 * @author zhenggc
 * @date 2019/5/30
 */
@Data
public class UserVO {
    /**
     * 用户ID
     */
    private Long id;
    /**
     * 用户名
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * email地址
     */
    private String email;
}
