package problems;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void displayUserInfo() {
        System.out.println("User: " + name);
    }
}