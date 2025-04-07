package com.example.baseservice.model.impl;

import com.example.baseservice.model.entity.Addresses;
import com.example.baseservice.model.mapper.AddressesMapper;
import com.example.baseservice.services.AddressesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class AddressesServiceImpl extends ServiceImpl<AddressesMapper, Addresses> implements AddressesService {

}
