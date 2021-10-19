package com.mp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
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
@TableName("bus_sales")
@ApiModel(value = "Sales对象", description = "")
public class Sales implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer customerid;

    private String paytype;

    private LocalDateTime salestime;

    private String operateperson;

    private Integer number;

    private String remark;

    private BigDecimal saleprice;

    private Integer goodsid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }
    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype;
    }
    public LocalDateTime getSalestime() {
        return salestime;
    }

    public void setSalestime(LocalDateTime salestime) {
        this.salestime = salestime;
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
    public BigDecimal getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(BigDecimal saleprice) {
        this.saleprice = saleprice;
    }
    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    @Override
    public String toString() {
        return "Sales{" +
            "id=" + id +
            ", customerid=" + customerid +
            ", paytype=" + paytype +
            ", salestime=" + salestime +
            ", operateperson=" + operateperson +
            ", number=" + number +
            ", remark=" + remark +
            ", saleprice=" + saleprice +
            ", goodsid=" + goodsid +
        "}";
    }
}
