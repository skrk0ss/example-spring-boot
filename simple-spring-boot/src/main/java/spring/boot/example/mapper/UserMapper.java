package spring.boot.example.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import spring.boot.example.domain.User;

public interface UserMapper {

  @Select("SELECT * FROM mt_user WHERE id = #{id}")
  public User get(String id);

  @Select("SELECT * FROM mt_user WHERE email = #{email}")
  public User getByEmail(String email);

  @Insert("insert into mt_user (id, email, password, status, created_dt) values(#{id}, #{email}, #{password}, #{status}, #{createdDate})")
  public int create(User user);

  @Update("update mt_user set password = #{password} ,email = #{email}, status = #{status}, updated_dt = #{updated_dt}")
  public int update(User user);

  @Delete("delete from mt_user where id = #{id}")
  public void delete(String id);

}
