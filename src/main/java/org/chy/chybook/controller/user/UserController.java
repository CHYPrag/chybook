package org.chy.chybook.controller.user;

import jakarta.servlet.http.HttpSession;
import org.apache.ibatis.annotations.Param;
import org.chy.chybook.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.net.http.HttpRequest;

/**
 * @author CHY
 * @since 2024-11-12
 */
@Controller
public class UserController {

    @GetMapping("/login")
    public String login(){
        return "user/login";
    }

    @PostMapping("/login")
    public String login(@Param("uid") String uid,
                        @Param("password")String password,
                        @Param("verifycode") String verifyCode,
                        HttpSession session){
        return null;
    }

    @DeleteMapping("/user/logout")
    public String logout(HttpSession session){
        //...
        return "user/index";
    }

    @GetMapping("/register")
    public String register(){
        return "user/register";
    }

    @PostMapping("/register")
    @ResponseBody
    public String register(User user){
        return null;
    }

    @PostMapping("/user/modify")
    @ResponseBody
    public String mordify(User user){
        return null;
    }

    @PostMapping("/user/resetPassword")
    @ResponseBody
    public String resetPassword(@Param("uid") String uid,
                                @Param("oldPassword") String oldPassword,
                                @Param("newPassword") String newPassword,
                                @Param("verifyCode")String verifyCode){
        return null;
    }

    @PostMapping("/user/uploadPhoto")
    @ResponseBody
    public String uploadPhoto(MultipartFile multipartFile, HttpRequest request){
        return null;
    }

    @GetMapping("/user/info/{uid}")
    @ResponseBody
    public String getUserInfo(@PathVariable("uid") String uid){
        return null;
    }
}
