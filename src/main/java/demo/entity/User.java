package demo.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
 * 用户实体
 *
 * @author zhenggc
 * @date 2019/5/30
 */
@EqualsAndHashCode(callSuper = true)
@TableName("USER")
@Data
public class User extends Model<User> {
    /**
     * 用户ID
     */
    @TableId(value = "ID",type = IdType.AUTO)
    private Integer id;
    /**
     * 用户名
     */
    @TableField("NAME")
    private String name;
    /**
     * 年龄
     */
    @TableField("AGE")
    private Integer age;
    /**
     * email地址
     */
    @TableField("EMAIL")
    private String email;
    /**
     * 是否删除
     */
    @TableLogic
    @TableField(value = "IS_DELETED", fill = FieldFill.INSERT)
    private String deletedFlag;
    /**
     * 创建人
     */
    @TableField(value = "CREATE_ID", fill = FieldFill.INSERT)
    private Integer createId;
    /**
     * 创建时间
     */
    @TableField(value = "CREATE_TIME", fill = FieldFill.INSERT)
    private LocalDateTime createTime;
    /**
     * 修改人
     */
    @TableField(value = "UPDATE_ID", fill = FieldFill.INSERT_UPDATE)
    private Integer updateId;
    /**
     * 修改时间
     */
    @TableField(value = "UPDATE_TIME", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;
}
