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

    Emp selectEmpAndDeptById(Integer eid);

    List<Emp> selectOneById(Integer did);

    /*
    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
     */
}
