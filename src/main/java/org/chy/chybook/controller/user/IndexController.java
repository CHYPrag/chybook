package org.chy.chybook.controller.user;

import jakarta.servlet.http.HttpSession;
import org.chy.chybook.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author CHY
 * @since 2024-11-01
 */
@RequestMapping(value = {"/user","/"})
@Controller
public class IndexController {

//    @Autowired
//    private UserService userService;

    @GetMapping(value = {"/","/index","/index.html"})
    public String index() {
        return "user/index";
    }

    @GetMapping(value = {"/personal","/personal.html"})
    public String index(HttpSession session) {
        User user = new User();
        user.setUid("9");
        user.setName("tom");
        user.setSex("女");
//        List<User> users = userService.findUser(user);
        session.setAttribute("user",user);
        return "user/personal";
    }



}
