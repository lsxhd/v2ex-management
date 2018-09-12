package com.v2ex.management.service;

import com.v2ex.management.entity.Increase;

import java.util.List;

/**
 * @Auther:lsxh
 * @Date:2018/9/4 19:44
 * @Description:
 */
public interface InService {
    /**
     * 根据帖子id查询附言
     * @param tid
     * @return
     */
    public List<Increase> getIncreaseById(int tid);

    /**
     * 根据id删除附言
     */
    public int setDeleteIncreaseByid(int id);
}
