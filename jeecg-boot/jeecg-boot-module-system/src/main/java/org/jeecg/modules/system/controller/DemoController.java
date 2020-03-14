package org.jeecg.modules.system.controller;

import lombok.extern.slf4j.Slf4j;
import org.jeecg.common.api.vo.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fangzf
 * @date 2020-03-13 22:19
 */
@RestController
@RequestMapping("/test/jeecgDemo")
@Slf4j
public class DemoController {

    /**
     * hello world
     *
     * @param
     * @return
     */
    @GetMapping(value = "/hello")
    public Result<String> hello() {
        Result<String> result = new Result<String>();
        result.setResult("Hello World!");
        result.setSuccess(true);
        return result;
    }
}