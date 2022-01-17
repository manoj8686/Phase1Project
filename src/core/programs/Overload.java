package core.programs;


			public class Overload {  
				    int square;
				    long rectangle;
				    double circle;    
				    
				   public void area1(){   
				    	System.out.println("inside");
				    	
				        }  
				      
				    public void area1(int i){   
				    	System.out.println("square : " + i*i);  
				    }  
				    public void area1(int a,long b){   
				    	System.out.println("rectangle : " +( a*b));  
				    }  
				    public void area1(float x){   
				    	System.out.println("circle: " + 3.14*(x*x));  
				    }  
				     
				    
				     public static void main(String args[]){  
				    
				   
				    	 
				    Overload s1 = new Overload();  
				    Overload s2 = new Overload();  
				    Overload s3 = new Overload(); 
				     
				     s1.area1(5);
				     s2.area1(2,2);
				   }
			 
			}


