package org.chy.chybook.service;

import com.github.jeffreyning.mybatisplus.service.IMppService;
import org.chy.chybook.entity.Comments;

import java.util.List;

/**
 * @author CHY
 * @since 2024-11-11
 */
public interface CommentService extends IMppService<Comments> {
    /**
     * 对一本书做评论
     * @param comments
     */
    void createComments(Comments comments);
    List<Comments> findComment(Comments comments);
    List<Comments> findComment(String keyword);
}
