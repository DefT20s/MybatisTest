package mapper;


import org.apache.ibatis.annotations.MapKey;
import pojo.User;

import java.util.List;
import java.util.Map;


/**
 * IntelliJ IDEA-2020.1
 *
 * @ClassName: UserMapper
 * @Date: 2023/08/16/14:58
 * @Author: 李鹏程
 * @Description:
 */
public interface UserMapper {

    User selectUserById(Integer id);

    Integer insertUser(User user);

    @MapKey("id")
    Map<String , Object> selectToMap();

}
