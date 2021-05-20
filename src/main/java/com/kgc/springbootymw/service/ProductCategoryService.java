package com.kgc.springbootymw.service;

import com.kgc.springbootymw.pojo.ProductCategory;

import java.util.List;


public interface ProductCategoryService {

    List<ProductCategory> yiji(int type);
    List<ProductCategory> erji(Integer parentId);
    List<ProductCategory> ersanji(Integer parentId);


}
