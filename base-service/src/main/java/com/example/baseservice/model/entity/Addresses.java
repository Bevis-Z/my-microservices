package com.example.baseservice.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author Bowen
 * @since 2025-04-07
 */
@Getter
@Setter
@TableName("addresses")
public class Addresses implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("line1")
    private String line1;

    @TableField("line2")
    private String line2;

    @TableField("line3")
    private String line3;

    @TableField("city")
    private String city;

    @TableField("state")
    private String state;

    @TableField("postcode")
    private String postcode;

    @TableField("countrycode")
    private String countrycode;

    @TableField("lat")
    private BigDecimal lat;

    @TableField("lng")
    private BigDecimal lng;

    @TableField("createddate")
    private LocalDateTime createddate;

    @TableField("modifieddate")
    private LocalDateTime modifieddate;

    @TableField("createdbyid")
    private Long createdbyid;

    @TableField("modifiedbyid")
    private Long modifiedbyid;

    @TableField("deleteddate")
    private LocalDateTime deleteddate;

    @TableField("isactiverecord")
    private Boolean isactiverecord;
}
