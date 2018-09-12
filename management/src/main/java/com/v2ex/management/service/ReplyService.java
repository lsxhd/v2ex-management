package com.v2ex.management.service;

import com.v2ex.management.entity.Reply;

import java.util.List;

/**
 * @Auther:lsxh
 * @Date:2018/9/4 16:05
 * @Description:
 */
public interface ReplyService {
    /**
     * 跟据tid 来查看整个帖子回复
     * @param tid
     * @return
     */
    public List<Reply> getReplyBytid(int tid);

    /**
     * 根据回复id来删除回复
     * @param id
     * @return
     */
    public int setDeReply(int id);
}
