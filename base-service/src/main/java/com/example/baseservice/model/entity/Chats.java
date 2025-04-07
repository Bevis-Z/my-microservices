package com.example.baseservice.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
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
@TableName("chats")
public class Chats implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("selecteddoctorprofileid")
    private Long selecteddoctorprofileid;

    @TableField("selectedpatientprofileid")
    private Long selectedpatientprofileid;

    @TableField("status")
    private String status;

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

    @TableField("summary")
    private String summary;
}
