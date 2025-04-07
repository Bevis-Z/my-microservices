package com.example.baseservice.mapper;

import com.example.baseservice.model.entity.TfAuthUsers;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.baseservice.model.enums.UserType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Bowen
 * @since 2025-04-07
 */
@Mapper
public interface TfAuthUsersMapper extends BaseMapper<TfAuthUsers> {

    @Select("SELECT type FROM tf_auth_users WHERE id = #{id}")
    UserType getUserType(@Param("id") Long userId);
}
