package dataAccess.concretes.category;

import dataAccess.abstracts.ICategoryDao;
import entities.Category;

public class JdbcCategoryDao implements ICategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Kategori JDBC ile eklendi");
    }
}
