package com.v2ex.management.controller;

import com.v2ex.management.entity.Reply;
import com.v2ex.management.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther:lsxh
 * @Date:2018/9/4 16:08
 * @Description:
 */
@Controller
@CrossOrigin

public class ReplyController {
    @Autowired
    private ReplyService replyService;

    /**
     * 跟据tid 来查看整个帖子回复
     * @param tid
     * @return
     */
    @RequestMapping(value = "/getReply",method = RequestMethod.POST)
    @ResponseBody
    public List<Reply> getReplyBytid(@RequestParam("tid") int tid){
        return replyService.getReplyBytid(tid);
    }

    /**
     * 根据回复id来删除回复
     * @param id
     * @return
     */
    @RequestMapping(value = "/deleteReply",method = RequestMethod.POST)
    @ResponseBody
    public int setDeReply(@RequestParam("id")int id){
        return replyService.setDeReply(id);
    }
}
