package com.example.baseservice.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
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
@TableName("patientprofiles")
public class Patientprofiles implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("firstname")
    private String firstname;

    @TableField("lastname")
    private String lastname;

    @TableField("mobilenumber")
    private String mobilenumber;

    @TableField("dateofbirth")
    private LocalDate dateofbirth;

    @TableField("gender")
    private String gender;

    @TableField("email")
    private String email;

    @TableField("medicarenumber")
    private String medicarenumber;

    @TableField("medicareirn")
    private String medicareirn;

    @TableField("allergies")
    private String allergies;

    @TableField("userid")
    private Long userid;

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

    @TableField("currentmeds")
    private String currentmeds;

    @TableField("acute")
    private String acute;

    @TableField("chronic")
    private String chronic;

    @TableField("addressid")
    private Long addressid;

    @TableField("parentprofileid")
    private Long parentprofileid;
}
