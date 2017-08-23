package tears.dao.impl;

import tears.dao.TruckDriverDao;
import tears.database.TruckDriverDataBase;
import tears.model.TruckDriver;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class TruckDriverDaoImpl implements TruckDriverDao {


    /**
     {@inheritDoc}
     */
    public void addDriverToDataBase(String name, String surname, int age, int tons, int years) {
        TruckDriverDataBase.listOfDriver.add(new TruckDriver(name, surname, age, tons,years));
    }

    public void deleteDriverById(int driverId) {
        for(TruckDriver driver:TruckDriverDataBase.listOfDriver){
            if (driverId == driver.getDriverId()) {
                TruckDriverDataBase.listOfDriver.remove(driver);
            }
        }
    }

    public void getDriverById(int driverId) {

    }

    public List<TruckDriver> getAllDataBase() {
        for (TruckDriver driver:TruckDriverDataBase.listOfDriver){
            System.out.print("name: "+driver.getName()+", ");
            System.out.print("surname: "+driver.getSurname()+", ");
            System.out.print("age: "+driver.getAge()+", ");
            System.out.print("Id: "+driver.getDriverId()+", ");
            System.out.print("were delivered: "+driver.getHowManyTonsWereDelivered()+" tons, ");
            System.out.println(" years in company: "+driver.getHowManyYearsWorksInCompany());
        }
        return TruckDriverDataBase.listOfDriver;
    }

    public static void main(String[] args) {
        new TruckDriverDaoImpl().addDriverToDataBase("Jim","Smith",25,20,3);
        new TruckDriverDaoImpl().addDriverToDataBase("Jimy","Sen",56,80,7);
        new TruckDriverDaoImpl().getAllDataBase();
    }
}
