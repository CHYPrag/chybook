package org.chy.chybook.service;

import org.chy.chybook.entity.Chapter;

import java.util.List;

/**
 * @author CHY
 * @since 2024-11-11
 */
public interface ChapterService {
    void addChapter(List<Chapter> chapter);
    void removeChapter(Chapter chapter);
    void modifyChapter(Chapter chapter);
    List<Chapter> findChapter(Chapter chapter);
}
