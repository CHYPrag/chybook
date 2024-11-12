package org.chy.chybook.service;

import org.chy.chybook.entity.Section;

import java.util.List;

/**
 * @author CHY
 * @since 2024-11-11
 */
public interface SectionService {
    void addSection(List<Section> sections);
    void removeSection(Section section);
    void modifySection(Section section);
    List<Section> findSection(Section section);
}
