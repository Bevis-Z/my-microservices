package com.example.baseservice.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
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
 * @author you
 * @since 2025-04-07
 */
@Getter
@Setter
@TableName("versioninfo")
public class Versioninfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("version")
    private Long version;

    @TableField("appliedon")
    private LocalDateTime appliedon;

    @TableField("description")
    private String description;
}
