package com.v2ex.management.mapper;

import com.v2ex.management.entity.Reply;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther:lsxh
 * @Date:2018/9/4 15:37
 * @Description:
 */
@Mapper
public interface ReplyMapper {

    /**
     * 跟据tid 来查看整个帖子回复
     * @param tid
     * @return
     */
    @Select("SELECT id, tid, content, date, uid FROM reply WHERE tid=#{tid}")
    @Results({
            @Result(
                    property = "theme",column = "tid",
                    one = @One(select = "com.v2ex.management.mapper.ThemeMapper.getThemeById")
            ),
            @Result(
                    property = "user",column = "uid",
                    one = @One(select = "com.v2ex.management.mapper.UserMapper.getUserById")
            )
    })
    public List<Reply> getReplyBytid(int tid);

    /**
     * 根据回复id来删除回复
     * @param id
     * @return
     */
    @Delete("DELETE FROM reply WHERE id=#{id}")
    public int setDeReply(int id);

}
