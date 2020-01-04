package controller;

import model.Student;
import service.AllStudents;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddNewServlet")

public class addStudent extends HttpServlet {

    private AllStudents AllStudents = new AllStudents();
   

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String batch = request.getParameter("batch");
        String rollNo = request.getParameter("roll");
        String parent = request.getParameter("parent");
        String address = request.getParameter("address");
        int roll = Integer.parseInt(rollNo);
        int batchs = Integer.parseInt(batch);
        Student student = new Student(name, roll, batchs, parent, address);
        new AllStudents().addNewStudent(student);
        request.setAttribute("studentDetail", AllStudents.displayStudents(student));
        request.setAttribute("studentDetails", student);
        request.getRequestDispatcher("/view/adminDashboard.jsp").forward(request, response);
       

        
    }
}