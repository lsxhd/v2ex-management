package com.v2ex.management.serviceimpl;

import com.v2ex.management.entity.Increase;
import com.v2ex.management.mapper.InMapper;
import com.v2ex.management.service.InService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther:lsxh
 * @Date:2018/9/4 19:45
 * @Description:
 */
@Service
public class InServiceimpl implements InService {
    @Resource
    private InMapper inMapper;

    @Override
    public List<Increase> getIncreaseById(int tid) {
        return inMapper.getIncreaseById(tid);
    }

    @Override
    public int setDeleteIncreaseByid(int id) {
        return inMapper.setDeleteIncreaseByid(id);
    }
}
