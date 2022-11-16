package id.mareno.belajarspringdasar.service;

import id.mareno.belajarspringdasar.repository.CategoryRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Samuel Mareno
 * @Date 23/04/22
 */
@Component
public class CategoryService {

    @Getter
    public CategoryRepository categoryRepository;

    @Autowired
    public void setCategoryRepository(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
}
