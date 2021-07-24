package Phase5.Day25_0_ObjectCommunication;

import java.io.Serializable;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/24 - 07 - 24 - 21:29
 * @Description: Phase5.Day25_0_ObjectCommunication
 * @version: 1.0
 *
 * 该对象需要呗传输,所以需要进行序列化
 */
public class User implements Serializable {
    private static final long serialVersionUID = 7120241489319495288L;
    private String userName;
    private String psw;

    public User(String userName, String psw) {
        this.userName = userName;
        this.psw = psw;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", psw='" + psw + '\'' +
                '}';
    }
}
