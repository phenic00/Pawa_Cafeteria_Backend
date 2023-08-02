package ke.co.safaricom.model;

public class Login {
    private String email;
    private String password;
    private String name;
    private String typerOfUser;
    private int id;

    public Login() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTyperOfUser() {
        return typerOfUser;
    }

    public void setTyperOfUser(String typerOfUser) {
        this.typerOfUser = typerOfUser;
    }
}
