package com.lp.tmall.service;

import com.lp.tmall.pojo.Category;
import com.lp.tmall.util.Page;

import java.util.List;

public interface CategoryService {
    List<Category> list();

    void add(Category category);

    void delete(int id);

    Category get(int id);

    void update(Category category);
}
