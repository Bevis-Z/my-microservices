package com.example.baseservice.model.impl;

import com.example.baseservice.model.entity.Chatmessages;
import com.example.baseservice.model.mapper.ChatmessagesMapper;
import com.example.baseservice.services.ChatmessagesService;
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
public class ChatmessagesServiceImpl extends ServiceImpl<ChatmessagesMapper, Chatmessages> implements ChatmessagesService {

}
