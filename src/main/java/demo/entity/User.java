package demo.entity;

import demo.util.Page;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户实体
 *
 * @author zhenggc
 * @date 2019/5/30
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class User extends Page {
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
