package dataAccess.concretes.course;

import dataAccess.abstracts.ICourseDao;
import entities.Course;

public class HibernateCourseDao implements ICourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Kurs Hibernate ile eklendi");
    }
}
