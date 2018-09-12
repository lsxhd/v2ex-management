package com.v2ex.management.serviceimpl;

import com.v2ex.management.entity.Reply;
import com.v2ex.management.mapper.ReplyMapper;
import com.v2ex.management.service.ReplyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther:lsxh
 * @Date:2018/9/4 16:06
 * @Description:
 */
@Service
public class ReplyServiceimpl implements ReplyService {
    @Resource
    private ReplyMapper replyMapper;

    @Override
    public List<Reply> getReplyBytid(int tid) {
        return replyMapper.getReplyBytid(tid);
    }

    @Override
    public int setDeReply(int id) {
        return replyMapper.setDeReply(id);
    }
}
