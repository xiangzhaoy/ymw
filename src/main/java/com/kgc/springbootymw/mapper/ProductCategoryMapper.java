package com.kgc.springbootymw.mapper;
import com.kgc.springbootymw.pojo.ProductCategory;

import java.util.List;

public interface ProductCategoryMapper {



    List<ProductCategory> erji(Integer parentId);
    List<ProductCategory> ersanji(int parentId);

    List<ProductCategory> yiji(int type);
}
