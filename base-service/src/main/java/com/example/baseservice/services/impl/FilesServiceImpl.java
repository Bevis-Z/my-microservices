package com.example.baseservice.services.impl;

import com.example.baseservice.model.entity.Files;
import com.example.baseservice.mapper.FilesMapper;
import com.example.baseservice.services.FilesService;
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
public class FilesServiceImpl extends ServiceImpl<FilesMapper, Files> implements FilesService {

}
