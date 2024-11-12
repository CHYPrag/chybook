package org.chy.chybook.service;

import jakarta.servlet.http.HttpSession;
import org.chy.chybook.entity.Admin;

/**
 * @author CHY
 * @since 2024-11-01
 */
public interface AdminService {
    /**
     *
     * @param id
     * @param password
     * @param verifyCode
     * @return -- {@link org.chy.chybook.common.Contants}中的字段
     */
    public int login(String id,String password,String verifyCode);
    public void resetPassword(String uid,String oldPassword,String newPassword);
}
