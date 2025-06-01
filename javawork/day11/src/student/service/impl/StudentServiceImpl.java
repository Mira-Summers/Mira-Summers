package student.service.impl;

import student.dao.StudentDao;
import student.dao.impl.StudentDaoImpl;
import student.pojo.Student;
import student.service.StudentService;

public class StudentServiceImpl implements StudentService {
    StudentDaoImpl studentDaoImpl=new StudentDaoImpl();
    @Override
    public void add(Student student) {
        studentDaoImpl.add(student);
    }

    @Override
    public void delete(int id) {
        studentDaoImpl.delete(id);
    }

    @Override
    public void update(Student student) {
        studentDaoImpl.update(student);
    }

    @Override
    public Student find(int id) {
        return studentDaoImpl.find((id));
    }
}
