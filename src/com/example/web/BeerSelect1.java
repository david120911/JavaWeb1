package com.example.web;

import com.example.model.BearExpert;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

/**
 * Created by richard on 2017/2/25.
 */
public class BeerSelect1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //1
//         resp.setContentType("text/html");
//         PrintWriter writer = resp.getWriter();
//         writer.println("Beer Selection Advise <br>");
//         String  c = req.getParameter("color");
//         writer.println("<br> Got beer color:"+c);


        //2
//         String  c = req.getParameter("color");
//         BearExpert bearExpert = new BearExpert();
//         List result = bearExpert.getBrands(c);
//         resp.setContentType("text/html");
//         PrintWriter writer = resp.getWriter();
//         writer.println("Beer Selection Advise <br>");
//         Iterator iterator = result.iterator();
//         while (iterator.hasNext()){
//         writer.println("<br> try:"+iterator.next());


        //3


        BearExpert bearExpert = new BearExpert();
        List list = bearExpert.getBrands( req.getParameter("color"));

        req.setAttribute("styles",list);
        RequestDispatcher dispatcher = req.getRequestDispatcher("result.jsp");
        dispatcher.forward(req,resp);




//        BearExpert bearExpert = new BearExpert();
//        List list = bearExpert.getBrands( req.getParameter("color"));
//
//        req.setAttribute("styles",list);
//        RequestDispatcher dispatcher = req.getRequestDispatcher("result.jsp");
//        dispatcher.forward(req,resp);
        }
    }
