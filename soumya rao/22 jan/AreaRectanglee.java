package demo;


		class Rectangle{
			  int l,b;
			  public double Arearect(){
			    double s =l*b;
			   return s;
			  }
			  
			}

			class Area{
			  public static void main(String[] args){
			  Rectangle t = new Rectangle();
			    t.l = 2;
			    t.b = 5;
			  
			    System.out.println(t.Arearect());
	
			  }
			
	}


