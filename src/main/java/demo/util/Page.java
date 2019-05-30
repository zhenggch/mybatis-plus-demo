package demo.util;

import lombok.Data;

/**
 * 分页
 *
 * @author zhenggc
 * @date 2019/5/30
 */
@Data
public class Page {
    /**
     * 每页数据量
     */
    private Integer size;
    /**
     * 当前页数
     */
    private Integer current;
}
