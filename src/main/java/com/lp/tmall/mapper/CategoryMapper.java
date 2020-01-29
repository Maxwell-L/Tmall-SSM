package com.lp.tmall.mapper;

import com.lp.tmall.pojo.Category;
import com.lp.tmall.util.Page;

import java.util.List;

public interface CategoryMapper {
    public List<Category> list(Page page);

    public int total();

    void add(Category category);

    void delete(int id);
}
