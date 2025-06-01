package student.dao;

import student.pojo.Student;

public interface StudentDao {
    //增删改查
  void add(Student student);
  void delete(int id);
  void update(Student student);
  Student find(int id);
  void getStudentList()

}
