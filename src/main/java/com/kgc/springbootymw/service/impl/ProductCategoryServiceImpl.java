package com.kgc.springbootymw.service.impl;

import com.kgc.springbootymw.mapper.ProductCategoryMapper;
import com.kgc.springbootymw.pojo.ProductCategory;
import com.kgc.springbootymw.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    ProductCategoryMapper productCategoryMapper;

    @Override
    public List<ProductCategory> yiji(int type) {
        return productCategoryMapper.yiji(type);
    }

    @Override
    public List <ProductCategory> erji(Integer parentId) {

        return productCategoryMapper.erji(parentId);
    }

    @Override
    public List<ProductCategory> ersanji(Integer parentId) {

        return productCategoryMapper.ersanji(parentId);
    }

}
