package dataAccess.concretes.instractor;

import dataAccess.abstracts.ICourseDao;
import dataAccess.abstracts.IInstructorDao;

public class HibernateInstructorDao implements IInstructorDao {
    @Override
    public void add(ICourseDao iCourseDao) {
        System.out.println("Eğitmen Hibernate ile  eklendi");
    }
}
