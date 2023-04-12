package business.concretes;

import business.abstracts.ICategoryManager;
import core.logging.ILogger;
import dataAccess.abstracts.ICategoryDao;
import entities.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager implements ICategoryManager {
    @Override
    public void add(Category category) throws Exception {

    }
    private static  List<String>categotyList = new ArrayList<>();
    private ICategoryDao categoryDao;
    private ILogger []loggers;

    public CategoryManager(ICategoryDao categoryDao, ILogger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }
    public void addCategory(Category category)throws Exception{
        for (String element :categotyList){
            if (category.getName()==element){
                throw new Exception("Kurs ismi Tekrar edemez!");
            }
        }
        categotyList.add(category.getName());
        categoryDao.add(category);
        for (ILogger logger:loggers){
            logger.log(category.getName());
        }
    }
}
