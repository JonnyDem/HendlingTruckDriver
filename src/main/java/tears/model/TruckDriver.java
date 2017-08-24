package tears.model;

import tears.database.TruckDriverDataBase;

import java.util.ArrayList;

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
    String phoneNumber;

    public String getPhone() {
        return phoneNumber;
    }

    public void setPhone(String phone) {
        phoneNumber = phone;
    }

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

    /**  Constructor.
     * @param name
     * @param surname
     * @param age
     * @param howManyTonsWereDelivered
     * @param howManyYearsWorksInCompany
     */
   public TruckDriver(String name, String surname, int age,String phone, int howManyTonsWereDelivered, int howManyYearsWorksInCompany) {
       ArrayList<TruckDriver> list=TruckDriverDataBase.listOfDriver;
       this.name = name;
       this.surname = surname;
       this.age = age;
       phoneNumber=phone;
       driverId = 1;
        this.howManyTonsWereDelivered = howManyTonsWereDelivered;
        this.howManyYearsWorksInCompany = howManyYearsWorksInCompany;
         for (int i = 0; i < list.size(); i++) {
             if (driverId == list.get(i).driverId) {
                 driverId++;
                 i = 0;
             }
       }System.out.println("Driver "+name+" was successfully added to data base with Id: "+driverId);
    }
}
