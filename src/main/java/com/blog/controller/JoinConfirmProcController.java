package com.blog.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JoinConfirmProcController implements Controller{
    @Override
    public String httpMethod() {
        return "POST";
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        return "/posts/joinConfirm.jsp";
    }
}
