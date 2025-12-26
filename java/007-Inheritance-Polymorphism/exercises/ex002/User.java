package ex002;

public class User {
    private String name;
    private String email;
    private String password;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void login(String email, String password) {
        if (this.email.equals(email) && this.password.equals(password)) {
            System.out.println("User " + this.name + " logged in successfully.");
        } else {
            System.out.println("Invalid credentials.");
        }
    }

    public void logout() {
        System.out.println("User " + this.name + " logged out.");
    }

    public void changeData(String newName, String newEmail) {
        this.name = newName;
        this.email = newEmail;
        System.out.println("User data updated.");
    }

    public void changePassword(String newPassword) {
        this.password = newPassword;
        System.out.println("User password updated.");
    }
}
