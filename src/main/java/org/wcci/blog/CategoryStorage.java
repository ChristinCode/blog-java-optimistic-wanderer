package org.wcci.blog;

import org.springframework.stereotype.Service;

@Service
public class CategoryStorage {
        private CategoryRepository categoryRepo;

        public CategoryStorage(CategoryRepository categoryRepo) {
            this.categoryRepo = categoryRepo;
        }

        public Iterable<Category> getAllCategories() {
            return categoryRepo.findAll();
        }

        public Category findCategoryByName(String difficultyLevel) {
            return categoryRepo.findByDifficultyLevel(difficultyLevel);
        }

        public void addCategory(Category category) {
            categoryRepo.save(category);
        }

    public Category getCategoryByDifficultyLevel(String difficultyLevel) {
        return categoryRepo.findByDifficultyLevel(difficultyLevel);
    }

}
