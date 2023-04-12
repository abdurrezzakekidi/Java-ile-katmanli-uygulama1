package dataAccess.concretes.instractor;

import dataAccess.abstracts.ICourseDao;
import dataAccess.abstracts.IInstructorDao;

public class JdbcInstructorDao implements IInstructorDao {
    @Override
    public void add(ICourseDao iCourseDao) {
        System.out.println("Eğitmen JDBC ile  eklendi");
    }
}
