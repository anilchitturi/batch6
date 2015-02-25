package javaclass;
//inheritance 
class BicycleDemo extends Bicycle{
	
	public void speedDouble(int increment) {
         speed = speed * increment;   
    }
	
	 public static void main(String[] args) {
	    	
	    	BicycleDemo bike1 = new BicycleDemo();
	    	bike1.printStates();
	    	bike1.speedDouble(5);
	    	bike1.printStates();
	    	
	    	BicycleDemo bike2 = new BicycleDemo();
	    	bike2.printStates();
	    	bike2.speedDouble(4);
	    	bike2.printStates();
	    	bike1.printStates();
	    	bike1.speedDouble(4);
	    	bike1.printStates();



	    }
	 
	 //speed up
	// speedup >> 
	
	
	
}

