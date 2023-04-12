package dataAccess.concretes.course;

import dataAccess.abstracts.ICourseDao;
import entities.Course;

public class JdbcCourseDao implements ICourseDao {
    @Override
    public void add(Course course) {
        System.out.println("kurs JDBC ile  ekelndi");
    }
}
