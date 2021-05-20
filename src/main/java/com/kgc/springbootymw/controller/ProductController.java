package com.kgc.springbootymw.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.springbootymw.pojo.Product;
import com.kgc.springbootymw.service.ProductService;
import com.kgc.springbootymw.utils.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping(value = "/pc")
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "list")
    @ResponseBody
    public RespBean List(@RequestParam(value = "name")String  name,
                         @RequestParam(value = "pageNum",defaultValue = "1")int pageNum,
                         Map map) {
        PageHelper.startPage(pageNum,4);
        List<Product> list = productService.getProductList(name);
        PageInfo<Product> pageInfo=new PageInfo<>(list);
        map.put("list",pageInfo);
        return  RespBean.ok("搜素成功",pageInfo);
    }
    @RequestMapping(value = "findAll")
    @ResponseBody
    public RespBean shouye(@RequestParam(value = "pageNum",defaultValue = "1")int pageNum,
                         Map map) {
       // PageHelper.startPage(pageNum,6);
        List<Product> list = productService.findAll();
        //PageInfo<Product> pageInfo=new PageInfo<>(list);
        map.put("list",list);
        return  RespBean.ok("查成功",list);
    }

}
