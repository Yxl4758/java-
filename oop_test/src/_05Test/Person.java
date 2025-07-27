package _05Test;

public class Person {
    private String name;
    private int age;
    private String passwd;
    private String phone;
    private String province;
    private String city;

    public Person() {

    }

    public Person(String name, int age, String passwd, String phone, String province,String city) {
        this.name = name;
        this.age = age;
        this.passwd = passwd;
        this.phone = phone;
        this.province = province;
        this.city = city;
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
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        if (age < 0 || age > 100) {
            System.out.println("年龄超出限制！！！");
        }else {
            this.age = age;
        }
    }

    /**
     * 获取
     * @return passwd
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * 设置
     * @param passwd
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    /**
     * 获取
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public String toString() {
        return this.name + "\t\t\t" + this.passwd + "\t\t" + this.age + "\t\t" + this.phone + "\t\t" + this.province + "\t\t" + this.city;
    }
}
