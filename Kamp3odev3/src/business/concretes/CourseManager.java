package business.concretes;

import business.abstracts.ICourseManager;
import core.logging.ILogger;
import dataAccess.abstracts.ICourseDao;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager implements ICourseManager {
    private ICourseDao courseDao;
    private ILogger[] loggers;
    private static List<String> courseList = new ArrayList<>();

    public CourseManager(ICourseDao courseDao, ILogger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    @Override
    public void add(Course course) throws Exception {
        for (String element: courseList){
            if (course.getName()== element){
                throw new Exception("Kurs ismi tekrar edilemez!");
            }
        }
        if (course.getPrice()<20){
            throw new Exception("Kurs fiyatı 20 den küçük olamaz!");
        }
        courseList.add(course.getName());
        courseDao.add(course);
        for (ILogger logger:loggers){
            logger.log(course.getName());
        }

    }
}
