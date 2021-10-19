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
@TableName("bus_salesback")
@ApiModel(value = "Salesback对象", description = "")
public class Salesback implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer customerid;

    private String paytype;

    private LocalDateTime salesbacktime;

    private Double salebackprice;

    private String operateperson;

    private Integer number;

    private String remark;

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
    public LocalDateTime getSalesbacktime() {
        return salesbacktime;
    }

    public void setSalesbacktime(LocalDateTime salesbacktime) {
        this.salesbacktime = salesbacktime;
    }
    public Double getSalebackprice() {
        return salebackprice;
    }

    public void setSalebackprice(Double salebackprice) {
        this.salebackprice = salebackprice;
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
    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    @Override
    public String toString() {
        return "Salesback{" +
            "id=" + id +
            ", customerid=" + customerid +
            ", paytype=" + paytype +
            ", salesbacktime=" + salesbacktime +
            ", salebackprice=" + salebackprice +
            ", operateperson=" + operateperson +
            ", number=" + number +
            ", remark=" + remark +
            ", goodsid=" + goodsid +
        "}";
    }
}
