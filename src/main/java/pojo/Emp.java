package pojo;

/**
 * IntelliJ IDEA-2020.1
 *
 * @ClassName: Emp
 * @Date: 2023/08/18/13:46
 * @Author: 李鹏程
 * @Description:
 */
public class Emp {

    private Integer eid;

    private String empName;

    private Integer did;

    private Dept dept;


    public Emp(Integer eid, String empName, Integer did, Dept dept) {
        this.eid = eid;
        this.empName = empName;
        this.did = did;
        this.dept = dept;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eid=" + eid +
                ", empName='" + empName + '\'' +
                ", did=" + did +
                ", dept=" + dept +
                '}';
    }
}
