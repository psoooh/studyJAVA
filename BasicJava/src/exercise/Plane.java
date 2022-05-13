package exercise;

public class Plane {

	   
			private String manufacture;
			private String model;
			private int maxNumberOfPassengers;
			private static int numberOfPlanes;
			
			public Plane() {
				this(null, null, 0);  // numberOfPlanes++의 중복사용 제한
			}
			
			public Plane(String manufacture, String model, int maxNumberOfPassengers) {
				this.manufacture = manufacture;
				this.model = model;
				this.maxNumberOfPassengers = maxNumberOfPassengers;
				numberOfPlanes++;
			}
			
			public String getManufacture() {
				return manufacture;
			}
			
			public void setManuFature(String manuFature) {
				this.manufacture = manuFature;
			}
			
			public String getModel() {
				return model;
			}
		    
			public void setmodel(String model) {
				this.model = model;
			}
			
			public int getMaxNumberOfPassengers() {
				return maxNumberOfPassengers;
			}
			
	        public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
				this.maxNumberOfPassengers = maxNumberOfPassengers;   //if(maxNumberOfPassengers>0){this.maxNumberOfPassengers = maxNumberOfPassengers}
				if (maxNumberOfPassengers<0) {
					this.maxNumberOfPassengers = 0;
				}	
			}
	        
	        public static int getNumberOfPlanes() {
	        	return numberOfPlanes;
	        }
	        
}
