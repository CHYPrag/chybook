package org.chy.chybook.controller;

/**
 * CHYBook系统全局错误
 * @author CHY
 * @since 2024-11-01
 */
public class CHYBookException  extends RuntimeException{
    private String msg;
    public CHYBookException(String msg){
        this.msg=msg;
    }
    @Override
    public String getLocalizedMessage() {
        return "CHYBook: "+msg;
    }
}
