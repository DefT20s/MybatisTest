package pojo;

import java.util.List;

/**
 * IntelliJ IDEA-2020.1
 *
 * @ClassName: Dept
 * @Date: 2023/08/18/13:47
 * @Author: 李鹏程
 * @Description:
 */
public class Dept {

    private Integer did;

    private String deptName;

    private List<Emp> emps;

    public List<Emp> getEmps() {
        return emps;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }



    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "did=" + did +
                ", deptName='" + deptName + '\'' +
                ", emps=" + emps +
                '}';
    }
}
