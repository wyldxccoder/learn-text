package day5;

public class user {
    private int id;
    private String name;
    private int password;

    public user() {
    }

    public user(int id, String name, int password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return password
     */
    public int getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(int password) {
        this.password = password;
    }

    public String toString() {
        return "user{id = " + id + ", name = " + name + ", password = " + password + "}";
    }
}
