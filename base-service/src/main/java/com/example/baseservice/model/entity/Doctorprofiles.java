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
@TableName("doctorprofiles")
public class Doctorprofiles implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("firstname")
    private String firstname;

    @TableField("lastname")
    private String lastname;

    @TableField("email")
    private String email;

    @TableField("mobilenumber")
    private String mobilenumber;

    @TableField("providernumber")
    private String providernumber;

    @TableField("prescribernumber")
    private String prescribernumber;

    @TableField("gender")
    private String gender;

    @TableField("type")
    private String type;

    @TableField("avatartype")
    private String avatartype;

    @TableField("userid")
    private Long userid;

    @TableField("signaturefileid")
    private Long signaturefileid;

    @TableField("languages")
    private String languages;

    @TableField("bio")
    private String bio;

    @TableField("dateofbirth")
    private LocalDate dateofbirth;

    @TableField("bankingaccountname")
    private String bankingaccountname;

    @TableField("bankingbsb")
    private String bankingbsb;

    @TableField("bankingaccountnumber")
    private String bankingaccountnumber;

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
