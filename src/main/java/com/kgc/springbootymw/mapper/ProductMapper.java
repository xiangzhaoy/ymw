package com.kgc.springbootymw.mapper;

import com.kgc.springbootymw.pojo.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
public interface ProductMapper {

    public List<Product> getProductList(@RequestParam(value = "name") String name);

}
