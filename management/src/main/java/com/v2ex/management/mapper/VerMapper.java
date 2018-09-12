package com.v2ex.management.mapper;

import com.v2ex.management.entity.Verification;
import org.apache.ibatis.annotations.Select;

/**
 * @Auther:lsxh
 * @Date:2018/9/10 10:57
 * @Description:
 */
public interface VerMapper {
    /**
     *
     * @param id
     * @return
     */
    @Select("SELECT verification.id,verification.url,verification.answer FROM verification WHERE id=#{id}")
    public Verification getVerById(int id);


}
