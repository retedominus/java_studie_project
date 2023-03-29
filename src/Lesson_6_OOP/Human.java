package Lesson_6_OOP;

public class Human {
    protected String firstName;
    protected String lastName;
    protected int age;
    protected String country;
    protected String gender;
    protected Integer parent;
    protected Integer idPerson;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public String getGender() {
        return gender;
    }

    public Integer getParent() {
        return parent;
    }

    public Integer getIdPerson() {
        return idPerson;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public void setIdPerson(Integer idPerson) {
        this.idPerson = idPerson;
    }

    public Human() {
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.country = "";
        this.gender = "";
        this.parent = null;
        this.idPerson = null;
    }

    public Human(String firstName, String lastName, Integer idPerson) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idPerson = idPerson;
    }

    public void greetings(String msg) {
        System.out.println(msg);
    }

    public void printInfo() {
        System.out.println(printString());
    }


    private String printString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", gender='" + gender + '\'' +
                ", parent=" + parent +
                ", idPerson=" + idPerson +
                '}';
    }



    public static void main(String[] args) {
        Human ivanov = new Human("Petr", "Ivanov", 1);
        ivanov.printInfo();

    }
}
