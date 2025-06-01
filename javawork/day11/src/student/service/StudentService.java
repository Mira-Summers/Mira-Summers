package student.service;

import student.pojo.Student;

public interface StudentService {
    void add(Student student);
    void delete(int id);
    void update(Student student);
    Student find(int id);

}
