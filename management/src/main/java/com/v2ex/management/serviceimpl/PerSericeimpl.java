package com.v2ex.management.serviceimpl;

import com.v2ex.management.entity.Permissions;
import com.v2ex.management.entity.User;
import com.v2ex.management.mapper.PerMapper;
import com.v2ex.management.service.PerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther:lsxh
 * @Date:2018/9/4 10:21
 * @Description:
 */
@Service
public class PerSericeimpl implements PerService {
    @Resource
    private PerMapper perMapper;

    @Override
    public List<Permissions> getAllPerUser() {
        return perMapper.getAllPerUser();
    }

    @Override
    public List<Permissions> getAllPerUserByid(int user) {
        return perMapper.getAllPerUserByid(user);
    }


    @Override
    public int setAddPer(int user, int node) {
        return perMapper.setAddPer(user,node);
    }

    @Override
    public int setDePer(int user, int node) {
        return perMapper.setDePer(user,node);
    }
}
