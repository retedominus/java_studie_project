package OOP_Lesson_1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Person implements PersonsDataBase{
    protected String firstName;
    protected String lastName;

    protected Integer age;
    protected String gender;
    protected String maritalStatus;
    protected static Integer personId;
    protected String eyeColor;
    protected String hairColor;
    protected Integer fatherId;
    protected Integer motherId;
    protected Integer sonId;
    protected Integer daughterId;
    protected Integer spouseId;

    static {
        personId = 0;
    }

    public Person(String firstName, String lastName, Integer age, String gender, String maritalStatus,
                  String eyeColor, String hairColor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
        ++personId;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Person() {

    }

//    public String parentToString(Integer parentId) {
//        return
//    }

    @Override
    public String toString() {
        return "id: " + personId + ", " + firstName + " " + lastName
                + ", Возраст: " + age + ", Пол: " + gender + ", Семейное положение: " + maritalStatus;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public Integer getPersonId() {
        return personId;
    }

    public Integer getSpouseId() {
        return spouseId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public void setSpouseId(Integer spouseId) {
        this.spouseId = spouseId;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public Integer getFatherId() {
        return fatherId;
    }

    public Integer getMotherId() {
        return motherId;
    }

    public Integer getSonId() {
        return sonId;
    }

    public Integer getDaughterId() {
        return daughterId;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static void setPersonId(Integer personId) {
        Person.personId = personId;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }

    public void setMotherId(Integer motherId) {
        this.motherId = motherId;
    }

    public void setSonId(Integer sonId) {
        this.sonId = sonId;
    }

    public void setDaughterId(Integer daughterId) {
        this.daughterId = daughterId;
    }


    @Override
    public void saveData() throws IOException {

    }
}

