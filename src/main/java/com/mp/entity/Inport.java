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
@TableName("bus_inport")
@ApiModel(value = "Inport对象", description = "")
public class Inport implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String paytype;

    private LocalDateTime inporttime;

    private String operateperson;

    private Integer number;

    private String remark;

    private Double inportprice;

    private Integer providerid;

    private Integer goodsid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype;
    }
    public LocalDateTime getInporttime() {
        return inporttime;
    }

    public void setInporttime(LocalDateTime inporttime) {
        this.inporttime = inporttime;
    }
    public String getOperateperson() {
        return operateperson;
    }

    public void setOperateperson(String operateperson) {
        this.operateperson = operateperson;
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
    public Double getInportprice() {
        return inportprice;
    }

    public void setInportprice(Double inportprice) {
        this.inportprice = inportprice;
    }
    public Integer getProviderid() {
        return providerid;
    }

    public void setProviderid(Integer providerid) {
        this.providerid = providerid;
    }
    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    @Override
    public String toString() {
        return "Inport{" +
            "id=" + id +
            ", paytype=" + paytype +
            ", inporttime=" + inporttime +
            ", operateperson=" + operateperson +
            ", number=" + number +
            ", remark=" + remark +
            ", inportprice=" + inportprice +
            ", providerid=" + providerid +
            ", goodsid=" + goodsid +
        "}";
    }
}
