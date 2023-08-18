package pojo;

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

    public Dept(Integer did, String deptName) {
        this.did = did;
        this.deptName = deptName;
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
                '}';
    }
}
