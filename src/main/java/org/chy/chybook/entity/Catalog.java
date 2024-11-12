package org.chy.chybook.entity;

import lombok.Data;

import java.util.HashSet;

/**
 * 图书目录
 * @author CHY
 * @since 2024-11-11
 */
@Data
public class Catalog {
    private int chapterSum;
    /**
     * 章列表
     */
    private Chapter[] chapters;
    /**
     * 节列表
     */
    private HashSet<Section> sections;
    /**
     * 子节列表
     */
    private HashSet<Subsection> subsections;
}
