package com.kgc.springbootymw.mapper;

import com.kgc.springbootymw.pojo.Product;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface EasyProductMapper {

    List<Product> findByName(String name);
    List<Product> findAll();

}
