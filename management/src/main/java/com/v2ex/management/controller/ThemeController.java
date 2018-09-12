package com.v2ex.management.controller;

import com.v2ex.management.entity.Theme;
import com.v2ex.management.service.ThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther:lsxh
 * @Date:2018/9/3 14:17
 * @Description:
 */
@Controller
@CrossOrigin
public class ThemeController {
    @Autowired
    private ThemeService themeService;

    /**
     * 获取所有帖子信息
     * @return
     */
    @RequestMapping(value = "/allTheme")
    @ResponseBody
    public List<Theme> getAllTheme(){
        return themeService.getAllTheme();
    }

    /**
     * 按关键词查询帖子
     * @param key
     * @return
     */
    @RequestMapping(value = "/getTheme")
    @ResponseBody
    public List<Theme> getThemeByKey(@RequestParam("key") String key){
        return themeService.getThemeByKey(key,key,key);
    }

    /**
     * 根据id删除帖子
     */
   @RequestMapping(value = "/deleteTheme",method = RequestMethod.POST)
   @ResponseBody
    public int setDeleteThemeByid(@RequestParam("id") int id){
       return themeService.setDeleteThemeByid(id);
   }

    /**
     * 根据id更新帖子内容
     */
    @RequestMapping(value = "/updateTheme",method = RequestMethod.POST)
    @ResponseBody
    public int setThemeByid(@RequestParam ("title") String title,@RequestParam("content") String content,@RequestParam("id") int id){
        return themeService.setThemeByid(title,content,id);
    }

    /**
     * 根据id置顶帖子
     */
    @RequestMapping(value = "/topTheme",method = RequestMethod.POST)
    @ResponseBody
    public int setTopByid(@RequestParam("id") int id){
        return themeService.setTopByid(id);
    }

    /**
     * 根据id取消置顶帖子
     */
    @RequestMapping(value = "/noTopTheme",method = RequestMethod.POST)
    @ResponseBody
    public int setNoTopByid(@RequestParam("id") int id){
        return themeService.setNoTopByid(id);
    }
    /**
     * 根据id加精帖子
     */
    @RequestMapping(value = "/goodTheme",method = RequestMethod.POST)
    @ResponseBody
    public int setGoodByid(@RequestParam("id") int id){
        return themeService.setGoodByid(id);
    }

    /**
     * 根据id取消加精帖子
     */
    @RequestMapping(value = "/noGoodTheme",method = RequestMethod.POST)
    @ResponseBody
    public int setNoGoodByid(@RequestParam("id") int id){
        return themeService.setNoGoodByid(id);
    }

}

