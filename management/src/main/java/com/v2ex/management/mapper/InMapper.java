package com.v2ex.management.mapper;

import com.v2ex.management.entity.Increase;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Auther:lsxh
 * @Date:2018/9/4 19:29
 * @Description:
 */
@Mapper
public interface InMapper {


    /**
     * 根据帖子id查询附言
     * @param tid
     * @return
     */
    @Select("SELECT id,tid,content,time FROM increase where tid=#{tid}")
    public List<Increase> getIncreaseById(int tid);

    /**
     * 根据id删除附言
     */
    @Delete("DELETE FROM increase WHERE id=#{id}")
    public int setDeleteIncreaseByid(int id);

}
