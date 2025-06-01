package account.servlet;

import account.service.StudentService;

public class studentServlet {
    public studentServlet(StudentService studentService) {
        this.studentService = studentService;
    }

    private StudentService studentService;

    public void saveAccount(){
        studentService.saveAccount();
    }

}
