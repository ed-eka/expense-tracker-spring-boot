package com.thatidiotchinese.expensetrackerserver.services.implementation;

import com.thatidiotchinese.expensetrackerserver.entity.Category;
import com.thatidiotchinese.expensetrackerserver.model.request.CategoryRequest;
import com.thatidiotchinese.expensetrackerserver.model.response.CategoryResponse;
import com.thatidiotchinese.expensetrackerserver.repository.CategoryRepository;
import com.thatidiotchinese.expensetrackerserver.services.CategoryService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Slf4j
public class CategoryServiceImplementation implements CategoryService {

    private CategoryRepository categoryRepository;

    @Override
    public List<CategoryResponse> getAll() {
        return categoryRepository.findAll()
                .stream()
                .map(category -> {
                    return mappingCategoryToCategoryResponse(category);
                })
                .collect(Collectors.toList());
    }

    @Override
    public CategoryResponse getById(long id) {
        Category category = categoryRepository.findById(id)
                .orElseThrow(() -> new CustomException(
                        "Category with given ID " + id + " is not found", "CATEGORY_NOT_FOUND", 404
                ));
        return mappingCategoryToCategoryResponse(category);
    }

    @Override
    public CategoryResponse create(CategoryRequest categoryRequest) {
        Category category = new Category();
        category.setName(categoryRequest.getName());
        Category newCategory = categoryRepository.save(category);
        return mappingCategoryToCategoryResponse(newCategory);
    }

    @Override
    public CategoryResponse update(long id, CategoryRequest categoryRequest) {
        CategoryResponse oldCategory = getById(id);

//        Category category = new Category();
//        category.setId(oldCategory.getId());
//        category.setName(oldCategory.getName());
        Category category = mappingCategoryResponseToCategory(oldCategory);
        category.setName(categoryRequest.getName());

        Category newCategory = categoryRepository.save(category);
        return mappingCategoryToCategoryResponse(newCategory);
    }

    @Override
    public CategoryResponse delete(long id) {
        CategoryResponse categoryResponse = getById(id);
        categoryRepository.deleteById(id);
        return categoryResponse;
    }

    public CategoryResponse mappingCategoryToCategoryResponse(Category category){
        CategoryResponse categoryResponse = new CategoryResponse();
        BeanUtils.copyProperties(category, categoryResponse);
        /*
        categoryResponse.setId(category);
         */
        return categoryResponse;
    }

    public Category mappingCategoryResponseToCategory(CategoryResponse categoryResponse){
        Category category = new Category();
        BeanUtils.copyProperties(categoryResponse, category);
        return category;
    }

    public Category mappingCategoryRequestToCategory(CategoryRequest categoryRequest){
        Category category = new Category();
        BeanUtils.copyProperties(categoryRequest, category);
        return category;
    }
}
