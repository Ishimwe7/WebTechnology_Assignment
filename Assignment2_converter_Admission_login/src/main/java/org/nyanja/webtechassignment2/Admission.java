package org.nyanja.webtechassignment2;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/admission")
public class Admission extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response){
        try {
            String fname =request.getParameter("f_name");
            String sname =request.getParameter("s_name");
            String phoneNumber =request.getParameter("phone_number");
            String email =request.getParameter("email");
            String dep = request.getParameter("department");
            String gender =request.getParameter("gender");
            String dob =request.getParameter("bd");
            String country =request.getParameter("country");
            String city =request.getParameter("city");
            String adress =request.getParameter("address");
            request.setAttribute("fname","First name: "+fname);
            request.setAttribute("sname","Second name: "+sname);
            request.setAttribute("phoneNumber","Phone number: "+phoneNumber);
            request.setAttribute("email","Email address: "+email);
            request.setAttribute("gender","Gender: "+gender);
            request.setAttribute("dob","Date of Birth: "+dob);
            request.setAttribute("country","Country of Origin: "+country);
            request.setAttribute("city","ResidenceCity: "+city);
            request.setAttribute("address","Street Address: "+adress);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/preview.jsp");
            dispatcher.forward(request,response);
        }catch (Exception ex){
            ex.printStackTrace();
            request.setAttribute("error","An expected error occurred!!");
            RequestDispatcher dispatcher = request.getRequestDispatcher("/admission.jsp");
            try {
                dispatcher.forward(request,response);
            } catch (ServletException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
