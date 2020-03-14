package org.jeecg.modules.test.demo.service.impl;


import org.jeecg.modules.test.demo.entity.TestDemo;
import org.jeecg.modules.test.demo.mapper.TestDemoMapper;
import org.jeecg.modules.test.demo.service.ITestDemoService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @Description: 测试用户表
 * @Author: jeecg-boot
 * @Date:   2020-03-14
 * @Version: V1.0
 */
@Service
public class TestDemoServiceImpl extends ServiceImpl<TestDemoMapper, TestDemo> implements ITestDemoService {

}
