package student.dao.impl;

import student.dao.StudentDao;
import student.pojo.Student;

public class StudentDaoImpl implements StudentDao {
    Student student1=new Student();
    @Override
    public void add(Student student) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Student student) {

    }

    @Override
    public Student find(int id) {
        return student1;
    }
}
