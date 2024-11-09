package org.chy.chybook.common;

/**
 * 图书一级分类标签，仅供参考。
 * @author CHY
 * @since 2024-11-01
 */
public enum FirstCategory {
    NOVEL(0,"小说"),
    HISTORY(1,"历史"),
    LITERATURE(2,"文学"),
    SOCIAL(3,"人文社科"),
    ECONOMY(4,"经济管理"),
    ENCOURAGEMENT(5,"成功励志"),
    SCIENCE(6,"科技科普"),
    LIVING(7,"生活"),
    ART(8,"艺术设计"),
    EDUCATION(9,"教育考试"),
    COMPUTER(10,"计算机与互联网"),
    CARICATURE(11,"漫画绘本"),
    CHILDREN(12,"少儿"),
    MAGAZINE(13,"杂志"),
    OTHER(14,"其他");

    private int type;
    private String name;

    private FirstCategory(int t,String n){
        this.type=t;
        this.name=n;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
