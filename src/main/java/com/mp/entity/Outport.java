package com.mp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
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
@TableName("bus_outport")
@ApiModel(value = "Outport对象", description = "")
public class Outport implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer providerid;

    private String paytype;

    private LocalDateTime outputtime;

    private String operateperson;

    private Double outportprice;

    private Integer number;

    private String remark;

    private Integer goodsid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getProviderid() {
        return providerid;
    }

    public void setProviderid(Integer providerid) {
        this.providerid = providerid;
    }
    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype;
    }
    public LocalDateTime getOutputtime() {
        return outputtime;
    }

    public void setOutputtime(LocalDateTime outputtime) {
        this.outputtime = outputtime;
    }
    public String getOperateperson() {
        return operateperson;
    }

    public void setOperateperson(String operateperson) {
        this.operateperson = operateperson;
    }
    public Double getOutportprice() {
        return outportprice;
    }

    public void setOutportprice(Double outportprice) {
        this.outportprice = outportprice;
    }
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    @Override
    public String toString() {
        return "Outport{" +
            "id=" + id +
            ", providerid=" + providerid +
            ", paytype=" + paytype +
            ", outputtime=" + outputtime +
            ", operateperson=" + operateperson +
            ", outportprice=" + outportprice +
            ", number=" + number +
            ", remark=" + remark +
            ", goodsid=" + goodsid +
        "}";
    }
}
