package com.wq.website.service.impl;

import com.wq.website.dao.LogMapper;
import com.wq.website.modal.Vo.LogVo;
import com.wq.website.service.ILogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by BlueT on 2017/3/4.
 */
@Service
public class LogServiceImpl implements ILogService {

    @Resource
    private LogMapper logDao;

    @Override
    public void insertLog(LogVo logVo) {
        logDao.insertLog(logVo);
    }
}