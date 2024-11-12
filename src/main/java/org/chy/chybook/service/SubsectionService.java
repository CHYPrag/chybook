package org.chy.chybook.service;

import org.chy.chybook.entity.Subsection;

import java.util.List;

/**
 * @author CHY
 * @since 2024-11-11
 */
public interface SubsectionService {
    void addSubsection(List<Subsection> subsections);
    void removeSubsection(Subsection subsection);
    void modifySubsection(Subsection subsection);
    List<Subsection> findSubsection(Subsection subsection);
}
