package tears.dao;

import tears.model.TruckDriver;

import java.util.List;

public interface TruckDriverDao {

    /**
     * @param name
     * @param surname
     * @param age
     * @param driverId - identification number of driver.
     * @param tons - how many tons were delivered by this driver.
     * @param years - how many years driver has being working in the company.
     */
    void addDriverToDataBase(String name,String surname,int age, int tons, int years );

    /**
     * @param driverId - identification number of driver.
     *     Deletes driver from data base.
     */
     void deleteDriverById(int driverId);

     void getDriverById(int driverId);

     List<TruckDriver> getAllDataBase();
}
