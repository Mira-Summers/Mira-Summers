package account.service;

import account.dao.StudentDao;

public class StudentService {

    public StudentService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    private StudentDao studentDao;

    public void saveAccount(){
        studentDao.saveAccount();
    }





}
