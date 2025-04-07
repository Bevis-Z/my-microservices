package com.example.baseservice.model.impl;

import com.example.baseservice.model.entity.Chats;
import com.example.baseservice.model.mapper.ChatsMapper;
import com.example.baseservice.services.ChatsService;
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
public class ChatsServiceImpl extends ServiceImpl<ChatsMapper, Chats> implements ChatsService {

}
