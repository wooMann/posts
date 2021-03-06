package com.blog.router;

import com.blog.controller.*;
import com.blog.controller.user.MainController;
import com.blog.controller.user.UserDeleteController;
import com.blog.controller.user.UserEditController;

import java.util.HashMap;

public class MainRouter {
    public MainRouter(HashMap<String, Controller> map){
        map.put("/login.do",new LoginController());
        map.put("/loginProc.do",new LoginProcController());
        map.put("/join.do",new JoinController());
        map.put("/joinProc.do",new JoinProcController());
        map.put("/logout.do",new LogoutController());
        map.put("/userEdit.do",new UserEditController());
        map.put("/userDelete.do",new UserDeleteController());
        map.put("/main.do",new MainController());
    }
}
