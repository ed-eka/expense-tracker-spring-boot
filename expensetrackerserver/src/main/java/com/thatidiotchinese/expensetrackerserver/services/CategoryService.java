package com.thatidiotchinese.expensetrackerserver.services;

import com.thatidiotchinese.expensetrackerserver.model.request.CategoryRequest;
import com.thatidiotchinese.expensetrackerserver.model.response.CategoryResponse;

import java.util.List;

public interface CategoryService {

    List<CategoryResponse> getAll();

    CategoryResponse getById(long id);

    CategoryResponse create(CategoryRequest categoryRequest);

    CategoryResponse update(long id, CategoryRequest categoryRequest);

    CategoryResponse delete(long id);
}
