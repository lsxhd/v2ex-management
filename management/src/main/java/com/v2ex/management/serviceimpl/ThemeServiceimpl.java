package com.v2ex.management.serviceimpl;

import com.v2ex.management.entity.Theme;
import com.v2ex.management.mapper.ThemeMapper;
import com.v2ex.management.service.ThemeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther:lsxh
 * @Date:2018/9/3 14:14
 * @Description:
 */
@Service
public class ThemeServiceimpl implements ThemeService {
    @Resource
    private ThemeMapper themeMapper;

    public List<Theme> getAllTheme(){
        return themeMapper.getAllTheme();
    }

    @Override
    public List<Theme> getThemeByKey(String content, String title, String name) {
        return themeMapper.getThemeByKey(content, title, name);
    }



    public int setDeleteThemeByid(int id) {
        return themeMapper.setDeleteThemeByid(id);
    }


    public int setThemeByid(String title,String content, int id) {
        return themeMapper.setThemeByid(title,content,id);
    }


    public int setTopByid(int id) {
        return themeMapper.setTopByid(id);
    }


    public int setNoTopByid(int id) {
        return themeMapper.setNoTopByid(id);
    }


    public int setGoodByid(int id) {
        return themeMapper.setGoodByid(id);
    }


    public int setNoGoodByid(int id) {
        return themeMapper.setNoGoodByid(id);
    }
}
