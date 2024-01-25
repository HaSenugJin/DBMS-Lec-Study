package com.example.userapp.config;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

//FrontController
@WebServlet("*.do")
public class DispatcherServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1. 공통로직
        System.out.println("common logic");
        resp.setHeader("Content-Type", "text/html; charset=utf-8");

        // 2. 분기
        String uri = req.getRequestURI();
        System.out.println(uri);

        // 라우터
        if(uri.equals("/join-form.do")){
            //resp.sendRedirect("/WEB-INF/user/join-form.jsp");

            // 재요청
            req.getRequestDispatcher("/WEB-INF/user/join-form.jsp").forward(req, resp);
        }else if(uri.equals("/join.do")){
            //resp.sendRedirect("/WEB-INF/user/join.jsp");
            req.getRequestDispatcher("/WEB-INF/user/join.jsp").forward(req, resp);
        }else if(uri.equals("/main.do")){
            //resp.sendRedirect("/WEB-INF/board/main.jsp");
            req.getRequestDispatcher("/WEB-INF/board/main.jsp").forward(req, resp);
        }else{
            resp.setStatus(404);
            resp.getWriter().println("잘못된 페이지를 요청하셨어요");
        }
    }
}