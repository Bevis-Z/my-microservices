package com.example.baseservice.services.impl;

import com.example.baseservice.model.entity.TfAuthUsers;
import com.example.baseservice.mapper.TfAuthUsersMapper;
import com.example.baseservice.model.enums.UserType;
import com.example.baseservice.services.TfAuthUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author you
 * @since 2025-04-07
 */
@Service
public class TfAuthUsersServiceImpl extends ServiceImpl<TfAuthUsersMapper, TfAuthUsers> implements TfAuthUsersService {

    @Autowired
    private TfAuthUsersMapper tfAuthUsersMapper;

    @Override
    public UserType getUserTypeById(Long userId) {
        return tfAuthUsersMapper.getUserType(userId);
    }
}
