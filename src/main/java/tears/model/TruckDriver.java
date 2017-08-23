package tears.model;

/**
 * Created by Ваня on 23.08.2017.
 */
public class TruckDriver {

    String name;
    String surname;
    int age;
    int howManyYearsWorksInCompany;
    int howManyTonsWereDelivered;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHowManyYearsWorksInCompany() {
        return howManyYearsWorksInCompany;
    }

    public void setHowManyYearsWorksInCompany(int howManyYearsWorksInCompany) {
        this.howManyYearsWorksInCompany = howManyYearsWorksInCompany;
    }

    public int getHowManyTonsWereDelivered() {
        return howManyTonsWereDelivered;
    }

    public void setHowManyTonsWereDelivered(int howManyTonsWereDelivered) {
        this.howManyTonsWereDelivered = howManyTonsWereDelivered;
    }
}
