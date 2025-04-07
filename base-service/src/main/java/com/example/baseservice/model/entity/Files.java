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
@TableName("files")
public class Files implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("filename")
    private String filename;

    @TableField("directory")
    private String directory;

    @TableField("contenttype")
    private String contenttype;

    @TableField("size")
    private Long size;

    @TableField("accesslevel")
    private String accesslevel;

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
