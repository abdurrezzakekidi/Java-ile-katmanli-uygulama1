package business.concretes;

import business.abstracts.IInstructorManager;
import core.logging.ILogger;
import dataAccess.abstracts.ICourseDao;
import dataAccess.abstracts.IInstructorDao;
import entities.Instructor;

public class InstructorManager implements IInstructorManager {
    private IInstructorDao instructorDao;
    private ILogger[] loggers;

    public InstructorManager(IInstructorDao instructorDao, ILogger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    @Override
    public void add(Instructor instructor) throws Exception {
        instructorDao.add((ICourseDao) instructor);
        for (ILogger logger :loggers){
            logger.log(instructor.getName());
        }

    }
}
