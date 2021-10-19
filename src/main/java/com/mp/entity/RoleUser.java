package com.mp.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author chy
 * @since 2021-10-14
 */
@TableName("sys_role_user")
@ApiModel(value = "RoleUser对象", description = "")
public class RoleUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer rid;

    private Integer uid;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "RoleUser{" +
            "rid=" + rid +
            ", uid=" + uid +
        "}";
    }
}
