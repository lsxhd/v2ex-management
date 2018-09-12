package com.v2ex.management.mapper;

import com.v2ex.management.entity.Theme;
import org.apache.ibatis.annotations.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

/**
 * @Auther:lsxh
 * @Date:2018/9/3 10:55
 * @Description:进行"帖子"的增删改查操作
 */
@Mapper
public interface ThemeMapper {
   /**
    *查询所有帖子
    */
    @Select("SELECT id, title, author, content, date, tag, collect, thanks, click, good, top FROM theme ")
    @Results({
            @Result(
                    property = "user",column = "author",
                    one = @One(select = "com.v2ex.management.mapper.UserMapper.getUserById")
            ),
            @Result(
                    property = "node",column = "tag",
                    one = @One(select = "com.v2ex.management.mapper.NodeMapper.getNode")
            )
    })
   public List<Theme> getAllTheme();

   /**
    * 根据id查询帖子
    * @param id
    * @return
    */
    @Select("SELECT id, title, author, content, date, tag, collect, thanks, click, good, top FROM theme where id=#{id}")
    public List<Theme> getThemeById(int id);


 /**
  * 按关键词查询帖子
  * @param key
  * @returngetThemeByKey
  */
 @Select("SELECT\n" +
         "\ttheme.*\n" +
         "FROM\n" +
         "\ttheme\n" +
         "JOIN `user` ON `user`.id = theme.author\n" +
         "JOIN node ON theme.tag = node.pid\n" +
         "WHERE" +
         "\tnode.content LIKE CONCAT('%',#{content},'%')" +
         "OR theme.title LIKE CONCAT('%',#{title},'%')" +
         "OR `user`.`name` LIKE CONCAT('%',#{name},'%')")
 @Results({
         @Result(
                 property = "user",column = "author",
                 one = @One(select = "com.v2ex.management.mapper.UserMapper.getUserById")
         ),
         @Result(
                 property = "node",column = "tag",
                 one = @One(select = "com.v2ex.management.mapper.NodeMapper.getNode")
         )
 })
    public List<Theme> getThemeByKey(@Param("content") String content,@Param("title") String title,@Param("name") String name);


    /**
     * 根据id删除帖子
     */
    @Delete("DELETE FROM theme WHERE id=#{id}")
    public int setDeleteThemeByid(int id);

    /**
     * 根据id更新帖子内容
     */
    @Update("UPDATE theme SET title=#{title}, content=#{content} WHERE id=#{id}")
    public int setThemeByid(@Param("title") String title,@Param("content")String content, @Param("id") int id);



    /**
     * 根据id置顶帖子
     */
    @Update("UPDATE theme SET top=1 WHERE id=#{id}")
    public int setTopByid(int id);

    /**
     * 根据id取消置顶帖子
     */
    @Update("UPDATE theme SET top=0 WHERE id=#{id}")
    public int setNoTopByid(int id);
    /**
     * 根据id加精帖子
     */
    @Update("UPDATE theme SET good=1 WHERE id=#{id}")
    public int setGoodByid(int id);

    /**
     * 根据id取消加精帖子
     */
    @Update("UPDATE theme SET good=0 WHERE id=#{id}")
    public int setNoGoodByid(int id);
}
