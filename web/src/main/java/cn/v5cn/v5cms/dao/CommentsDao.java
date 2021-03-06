package cn.v5cn.v5cms.dao;

import cn.v5cn.v5cms.entity.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * Created by ZXF-PC1 on 2015/7/28.
 */
@Repository
public interface CommentsDao extends JpaRepository<Comments,Long>,JpaSpecificationExecutor<Comments> {
}
