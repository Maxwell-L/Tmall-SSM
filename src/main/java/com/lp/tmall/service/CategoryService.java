package com.lp.tmall.service;

import com.lp.tmall.pojo.Category;
import com.lp.tmall.util.Page;

import java.util.List;

public interface CategoryService {
    List<Category> list(Page page);

    int total();

    void add(Category category);

    void delete(int id);
}
