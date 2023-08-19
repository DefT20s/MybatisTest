package mapper;

import pojo.Dept;

/**
 * IntelliJ IDEA-2020.1
 *
 * @ClassName: DeptMapper
 * @Date: 2023/08/18/13:49
 * @Author: 李鹏程
 * @Description:
 */
public interface DeptMapper {

    Dept selectByDid(Integer did);

    Dept selectDeptAndEmp(Integer did);

}
