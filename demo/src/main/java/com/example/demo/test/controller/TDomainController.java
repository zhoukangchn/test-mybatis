package com.example.demo.test.controller;

import com.example.demo.test.service.ITDomainService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author abc
 * @since 2024-02-23
 */
@Controller
@RequestMapping("/test/tDomain")
public class TDomainController {

    ITDomainService domainService;

    @RequestMapping("/id")
    void getDomain(String id){
        domainService.count();
    }

}
