package com.v2ex.management.serviceimpl;

import com.v2ex.management.entity.Node;
import com.v2ex.management.mapper.NodeMapper;
import com.v2ex.management.service.NodeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther:lsxh
 * @Date:2018/9/4 15:07
 * @Description:
 */
@Service
public class NodeServiceimpl implements NodeService {
    @Resource
    private NodeMapper nodeMapper;


    @Override
    public List<Node> getAllNode() {
        return nodeMapper.getAllNode();
    }

    @Override
    public List<Node> getNode(int id) {
        return nodeMapper.getNode(id);
    }

    @Override
    public int setAddNode(String pid, String content, String url, String avatar) {
        return nodeMapper.setAddNode(pid,content,url,avatar);
    }

    @Override
    public int setDeNode(int id) {
        return nodeMapper.setDeNode(id);
    }

    @Override
    public int setUpNode(String pid, String content, String url, String avatar, int id) {
        return nodeMapper.setUpNode(pid,content,url,avatar,id);
    }
}
