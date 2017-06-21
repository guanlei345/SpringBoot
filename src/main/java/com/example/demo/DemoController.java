package com.example.demo;

import com.example.demo.module.Customer;
import com.sun.research.ws.wadl.HTTPMethods;
import io.swagger.annotations.ApiOperation;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AutoConfigurationPackage
@RequestMapping("/customers")
public class DemoController {

    @RequestMapping(value = "", method= RequestMethod.GET)
    @ApiOperation(value="获取用户列表", notes="")
    public Customer getCustomers(){
        Customer customer = new Customer();
        customer.setIdNo("12345");
        customer.setName("customer");
        customer.setMobile("123456");
        return customer;
    }
}
