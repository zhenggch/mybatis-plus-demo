package demo.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import demo.util.Page;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Id;

/**
 * 用户实体
 *
 * @author zhenggc
 * @date 2019/5/30
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserDTO extends Page {
    /**
     * 用户ID
     */
    private Integer id;
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
