package oopWithNLayeredApp;

import business.abstracts.ICourseManager;
import business.abstracts.IInstructorManager;
import business.concretes.CategoryManager;
import business.concretes.CourseManager;
import business.concretes.InstructorManager;
import core.logging.DatabaseLogger;
import core.logging.ILogger;
import core.logging.MailLogger;
import dataAccess.concretes.category.JdbcCategoryDao;
import dataAccess.concretes.course.JdbcCourseDao;
import dataAccess.concretes.instractor.HibernateInstructorDao;
import dataAccess.concretes.instractor.JdbcInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {
    public static void main(String[] args) throws Exception {

        ILogger[] loggers = {new DatabaseLogger(), new MailLogger()};
        Instructor instructor1 = new Instructor(12, "Engin Demirog", 28);

        Category category1 = new Category("Yazılım Kursları");
        Category category2 = new Category("Math kursları");

        Course course1 = new Course("Java kursu", 500);
        Course course2 = new Course("HTML Kursu", 0);
        //Kurs fiyatı 20 den küçük olamaz!

        IInstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
       //instructorManager.add(instructor1);

        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(),loggers);
        categoryManager.add(category1);
       // categoryManager.add(category2);

        CourseManager courseManager = new CourseManager(new JdbcCourseDao(),loggers) ;
        courseManager.add(course1);
        courseManager.add(course2);  //Kurs fiyatı 20 den küçük olamaz!


    }
}