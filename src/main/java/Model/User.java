package Model;

public class User {
    private String nome;
    private String idUser;
    private int id;
    private String phone;
    private String password;
    private String roll;
    private String lastName;

    public User(String nome, String idUser, int id, String phone,  String roll, String lastName) {
        this.nome = nome;
        this.idUser = idUser;
        this.id = id;
        this.phone = phone;
        this.roll = roll;
        this.lastName = lastName;
    }

    public User(String nome, String idUser, String phone, String password, String lastName) {
        this.nome = nome;
        this.idUser = idUser;
        this.phone = phone;
        this.password = password;
        this.lastName = lastName;
    }

    public User(int id) {
        this.id = id;
    }

    public User(String idUser) {
        this.idUser = idUser;
    }

    public User() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
