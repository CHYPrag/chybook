package org.chy.chybook.service;

import jakarta.servlet.http.HttpSession;
import org.chy.chybook.entity.Admin;

/**
 * @author CHY
 * @since 2024-11-01
 */
public interface AdminService {
    public void login(String id,String password,String verifyCode,HttpSession session);
    public void register(HttpSession session);
    public void logout(HttpSession session);
}
