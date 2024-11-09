package org.chy.chybook.dao;

import com.github.jeffreyning.mybatisplus.base.MppBaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.chy.chybook.entity.Shelf;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author CHY
 * @since 2024-11-08
 */
@Repository
public interface ShelfMapper extends MppBaseMapper<Shelf> {
    public List<Shelf> selectBy(Shelf shelf);
}
