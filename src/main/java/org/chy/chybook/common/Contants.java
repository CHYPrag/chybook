package org.chy.chybook.common;

import javax.swing.plaf.PanelUI;

/**
 * @author CHY
 * @since 2024-10-31
 */
public class Contants {

    //登录结果：成功、账号不存在、密码不正确、验证码有误
    public static final int LOGIN_SUCCESSFULLY=0;
    public static final int ACCOUNT_NOT_EXISTS=1;
    public static final int WRONG_PASSWORD=2;
    public static final int WRONG_VERIFYCODE=3;

    //注册结果：注册成功、账号已存在、验证码有误（如上）
    public static final int REGISTER_SUCCESSFULLY=0;
    public static final int ACCOUNT_AREADY_EXISTS=1;

    //图书阅读费用情况：免费、限免、付费/VIP
    public final static int FREE_READ_BOOK_STATE=1;
    public final static int LIMIT_READ_BOOK_STATE=2;
    public final static int VIP_READ_BOOK_STATE=3;

    //图书评论标签：好、一般、不行
    public final static int GOOD_BOOK_LABEL=1;
    public final static int COMMON_BOOK_LABEL=2;
    public final static int BAD_BOOK_LABEL=2;

    //兴趣领域
//    public final static byte

}
