package org.chy.chybook.service;

import jakarta.servlet.http.HttpSession;
import org.chy.chybook.entity.User;
import org.springframework.web.multipart.MultipartFile;

import java.net.http.HttpRequest;
import java.util.List;

/**
 * @author CHY
 * @since 2024-11-01
 */
public interface UserService {
    void login(String id, String password,String verifyCode,HttpSession session);
    void register(String id, String password, HttpSession session);
    int resetPassword(String id,String oldPassword,String newPassword);
    void setUserPhoto(MultipartFile multipartFile, HttpRequest request);
    long deleteUser(User user);
    long modifyUser(User user);
    List<User> findUser(User user);
    void setUserVIP(User user,HttpSession session);
    void lockUser(User user);
    void unlockUser(User user);
}
