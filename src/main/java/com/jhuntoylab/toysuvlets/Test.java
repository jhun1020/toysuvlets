package com.jhuntoylab.toysuvlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/webTest")
public class Test extends HttpServlet{ 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub

        PrintWriter printWriter = response.getWriter();
        printWriter.println(" <html lang='en'>");
        printWriter.println(" <head>");
        printWriter.println(" <title> 타이틀이다</title>");
        printWriter.println(" </head>");
        printWriter.println(" <body>");
        printWriter.println(" <div>HelloWorldServlets !</div>");
        printWriter.println("</body>");
        printWriter.println(" </html>");
        printWriter.close();
    }

}
