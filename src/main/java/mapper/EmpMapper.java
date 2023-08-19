package mapper;

import org.apache.ibatis.annotations.MapKey;
import pojo.Emp;

import java.util.List;
import java.util.Map;

/**
 * IntelliJ IDEA-2020.1
 *
 * @ClassName: EmpMapper
 * @Date: 2023/08/18/13:49
 * @Author: 李鹏程
 * @Description:
 */
public interface EmpMapper {

    List<Emp> selectAll();


    Emp selectOneById(Integer eid);

    /*
    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
     */
}
