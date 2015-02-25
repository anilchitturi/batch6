package javaclass;

import java.util.Iterator;

//interface
public class CopyOfACMEBicycle implements IBicycle{
	
	int cadence = 0;
    int speed = 0;
    int gear = 1;

    public void changeCadence(int newValue) {
         cadence = 3;
    }

    public void changeGear(int newValue) {
         gear = 2;
         
            }

    public void speedUp(int increment) {
         speed = speed + 2;   
    }

    public void applyBrakes(int decrement) {
         speed = speed - 1;
    }
    
    public void applyBrakesyu(int decrement) {
        speed = speed - decrement;
   }


	public CopyOfACMEBicycle() {
		// TODO Auto-generated constructor stub
	}
	

}
