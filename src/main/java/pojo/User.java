package pojo;

import java.util.Date;

/**
 * IntelliJ IDEA-2020.1
 *
 * @ClassName: User
 * @Date: 2023/08/16/14:55
 * @Author: 李鹏程
 * @Description:
 */
public class User {

    private Integer id;

    private String userName;

    private String password;

    private Date time;

    public User(Integer id, String userName, String password, Date time) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", time=" + time +
                '}';
    }
}
