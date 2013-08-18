package newspaper.dto;

/**
 * @since Aug - 18 - 2013
 * @author Nguyen Hoang Anh
 */
public class User {
    private int id;
    private String userName;
    private String passWord;

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    /**
     * Create default values for new instance
     */
    public User() {
        id = 0;
        userName = "";
        passWord = "";
    }

    public User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }
}
