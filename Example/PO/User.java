package Example.PO;

import jdk.nashorn.internal.objects.annotations.Getter;

/**
 * @Author bxdu
 * @Date 2022/12/20/ 10:53
 **/
public class User {

    private String userName;

    private Long userId;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public User(String userName, Long userId) {
        this.userName = "小明";
        this.userId = 1001L;
    }
}
