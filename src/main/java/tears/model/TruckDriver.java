package tears.model;

/**
 * Created by Ваня on 23.08.2017.
 */
public class TruckDriver {

    String name;
    String surname;
    int age;
    int driverId;
    int howManyTonsWereDelivered;
    int howManyYearsWorksInCompany;
    static int countOfDrivers;

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

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

   public TruckDriver(String name, String surname, int age, int howManyTonsWereDelivered, int howManyYearsWorksInCompany) {
        countOfDrivers++;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.driverId +=countOfDrivers;
        this.howManyTonsWereDelivered = howManyTonsWereDelivered;
        this.howManyYearsWorksInCompany = howManyYearsWorksInCompany;
    }
}
