package com.example.baseservice.services;

import com.example.baseservice.mapper.TfAuthUsersMapper;
import com.example.baseservice.model.entity.TfAuthUsers;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.baseservice.model.enums.UserType;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Bowen
 * @since 2025-04-07
 */
public interface TfAuthUsersService extends IService<TfAuthUsers> {
    UserType getUserTypeById(Long userId);

}
