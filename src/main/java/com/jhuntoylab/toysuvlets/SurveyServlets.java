package com.jhuntoylab.toysuvlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
// import java.util.HashMap;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/surveyServlets")
public class SurveyServlets extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest require, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        DatasInfor datasInfor = new DatasInfor();

        // datasInfor.getSearchSurvey();
        // HashMap<String, Object> surveyBundle = datasInfor.getSurveyBundle();
        ArrayList<String> surveyArrayList = datasInfor.getSurveyArrayList();
        


        // 디스플레이
        PrintWriter printWriter = response.getWriter();


        printWriter.println("<html lang='en'>");
        printWriter.println("<head>");
        printWriter.println("    <meta charset='UTF-8'>");
        printWriter.println("    <title>Tables Bean List Servlets</title>");
        printWriter.println("    <link href='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css' rel='stylesheet'");
        printWriter.println("        integrity='sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65' crossorigin='anonymous'>");
        printWriter.println("    <link rel='stylesheet' href='./css/commons.css'>");
        printWriter.println("</head>");
        
        printWriter.println("<body>");
        printWriter.println("<div class='container'>");      

        
        for(int i=0; i<surveyArrayList.size(); i++){
            String handle = surveyArrayList.get(i);
            printWriter.println("<div>" + (i+1) + ". " + handle + "</div>" );
        }

        printWriter.println(" </div> ");
        printWriter.println(" <script ");
        printWriter.println(" src='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js' ");
        printWriter.println(" integrity='sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4' ");
        printWriter.println(" crossorigin='anonymous'></script> ");
        printWriter.println(" </body> ");

        printWriter.close();
    }
    


}

// ---------------------

// package com.jhuntoylab.toysuvlets;

// import java.io.IOException;
// import java.io.PrintWriter;
// import java.util.ArrayList;
// // import java.util.HashMap;

// import jakarta.servlet.ServletException;
// import jakarta.servlet.annotation.WebServlet;
// import jakarta.servlet.http.HttpServlet;
// import jakarta.servlet.http.HttpServletRequest;
// import jakarta.servlet.http.HttpServletResponse;
// @WebServlet(urlPatterns = "/surveyServlets")
// public class SurveyServlets extends HttpServlet{
//     @Override
//     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//         response.setContentType("text/html;charset=UTF-8");

        
        
//          DatasInfor datasInfor = new DatasInfor();

//                 // display areas
//         ArrayList<String> surveyArrayList =   datasInfor.getSurveyArrayList();
//         PrintWriter printWriter = response.getWriter();

  
//         printWriter.println("  <html lang='en'> ");
//         printWriter.println(" <head> ");
//         printWriter.println(" <meta charset='UTF-8'> ");

//         printWriter.println(" <title> asdffff </title> ");
//         printWriter.println(" <link ");
//         printWriter.println(" href='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css' ");
//         printWriter.println(" rel='stylesheet' ");
//         printWriter.println(" integrity='sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65' ");
//         printWriter.println(" crossorigin='anonymous' ");
//         printWriter.println(" /> ");
//         printWriter.println(" <link rel='stylesheet' href=''./css/commons.css' /> ");
//         printWriter.println(" </head> ");
//         printWriter.println(" <body> ");
//         printWriter.println(" <div class='container'> ");
//         printWriter.println(" <div>여기에서출력</div>");    
//         printWriter.println(" <hr class='hr'> ");


//         printWriter.println(" <hr class='hr'> ");


//         printWriter.println(" <script ");
//         printWriter.println(" src='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js' ");
//         printWriter.println(" integrity='sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4' ");
//         printWriter.println(" crossorigin='anonymous'></script> ");
//         printWriter.println(" </body> ");
        
//         printWriter.close();
//     }
// }
