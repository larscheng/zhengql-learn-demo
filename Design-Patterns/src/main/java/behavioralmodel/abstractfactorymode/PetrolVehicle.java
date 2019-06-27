package behavioralmodel.abstractfactorymode;

import behavioralmodel.simplefactorymode.Vehicle;

/**
 * 描述:
 * 汽油车
 *
 * @author zhengql
 * @date 2019/6/18 15:00
 */
public class PetrolVehicle implements Vehicle {
    public PetrolVehicle() {
        info();
    }

    public void info() {
        System.out.println("感谢您购买xx牌汽油车!!!");
    }

}
