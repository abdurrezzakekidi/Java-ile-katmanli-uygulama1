package dataAccess.concretes.category;

import dataAccess.abstracts.ICategoryDao;
import entities.Category;

public class HibernateCategoryDao implements ICategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Kategory Hibernate ile  eklendi");
    }
}
