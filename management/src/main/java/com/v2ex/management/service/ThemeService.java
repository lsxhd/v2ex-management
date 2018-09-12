package com.v2ex.management.service;

import com.v2ex.management.entity.Theme;

import java.util.List;

/**
 * @Auther:lsxh
 * @Date:2018/9/3 14:13
 * @Description:
 */
public interface ThemeService {
    /**
     * 查询所有帖子信息
     * @return
     */
    public List<Theme> getAllTheme();

    /**
     * 按关键词查询帖子
     * @param key
     * @return
     */
    public List<Theme> getThemeByKey(String content,String title,String name);

    /**
     * 根据id删除帖子
     */
    public int setDeleteThemeByid(int id);


    /**
     * 根据id更新帖子内容
     */
    public int setThemeByid( String title,String content,int id);


    /**
     * 根据id置顶帖子
     */
    public int setTopByid(int id);


    /**
     * 根据id取消置顶帖子
     */
    public int setNoTopByid(int id);


    /**
     * 根据id加精帖子
     */
    public int setGoodByid(int id);


    /**
     * 根据id取消加精帖子
     */
    public int setNoGoodByid(int id);
}
