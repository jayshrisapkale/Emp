
public class Emp {

	float salary = 24000;
	public void employee() {
    System.out.println("employee salary is " +salary);
	
	}
    public static void main(String[] args) {
		 wageemp e = new wageemp();
		 e.permant();
		 permantemp p = new permantemp();
		 p.wage();
		 Emp e1 = new Emp();
		 e1.employee();

	}
}
	class permantemp extends Emp{
		
		public void wage() {
			double hike =0.5;

	      System.out.println("permant employee increment salary is " +(salary +(salary * hike)));

	}
	}
	
	class wageemp extends Emp{
		public void permant() {
			
		
	      System.out.println("wageemployee salary is " +salary);
		}
	
	

	}
	


