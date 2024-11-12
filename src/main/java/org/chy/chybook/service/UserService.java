package org.chy.chybook.service;

import jakarta.servlet.http.HttpSession;
import org.chy.chybook.entity.User;
import org.springframework.web.multipart.MultipartFile;

import java.io.ObjectInputStream;
import java.util.Map;

import java.net.http.HttpRequest;
import java.util.List;

/**
 * @author CHY
 * @since 2024-11-01
 */
public interface UserService {
    int login(String id, String password,String verifyCode);
    int register(User user);
    int resetPassword(String oldPassword,String newPassword);
    boolean setUserPhoto(ObjectInputStream stream,User suer);

    /**
     * 注销或删除用户
     * @param user
     * @return
     */
    long deleteUser(User user);
    long modifyUser(User user);
    List<User> findUser(User user);
    List<User> findUser(String keyword);

    /**
     * 为用户开通会员或取消它
     * @param user
     */
    void setUserVIP(User user);
    void lockUser(User user);
    void unlockUser(User user);

    /**
     * 阅读统计。
     * @return 返回一个map，它包含了有关的统计数据，如阅读时长、阅读书籍数、读完书籍数
     * 兴趣领域、关注数、点赞数。
     */
    Map<String,Object> readStats(String uid);

    /**
     * 用户可以点赞uid的其他用户
     * @param uid
     */
    void doLikeUser(String uid);

    /**
     * 用户可以关注uid的其他用户
     * @param uid
     */
    void careUser(String uid);
}
