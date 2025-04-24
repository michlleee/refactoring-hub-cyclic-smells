package solutions;

public class UserManager {
    private User user;

    public UserManager(String userName) {
        this.user = new User(userName);
    }

    public void displayUserInfo() {
        user.displayUserInfo();
    }
}
