package org.chy.chybook.service;

import com.github.jeffreyning.mybatisplus.service.IMppService;
import org.chy.chybook.entity.Notes;
import org.springframework.http.HttpRequest;

import java.util.List;

/**
 * @author CHY
 * @since 2024-11-11
 */
public interface NoteService extends IMppService<Notes> {
    /**
     * 在阅读的过程中做笔记
     * @param notes
     */
    void createNotes(Notes notes);
    List<Notes> findNotes(Notes notes);
    List<Notes> findNotes(String keyword);

    /**
     * 在阅读的过程中摘抄或引用笔记内容
     * @param request
     */
    void refer(HttpRequest request);

}
