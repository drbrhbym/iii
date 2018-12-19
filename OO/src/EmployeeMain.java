
public class EmployeeMain {

	public static void main(String[] args) {
		/*Employee e1 = new Employee();
		//e1.empno = 111;
		//e1.name = "Tom";
		e1.setEmpno(111);
		e1.setName("Tom");
		//e1.display(); // System.out.println("empno= " + e1.empno);
		              // System.out.println("Name= " + e1.name);
	    System.out.println(e1.getEmpno());
		System.out.println(e1.getName());
		
		Employee e2 = new Employee(222 , "Mary");
		e2.display(); 
		
		Permanent p = new Permanent();
        //p.empno = 333;
        //p.name = "Tina";
		p.setEmpno(333);
		p.setName("Tina");
       // p.salary = 45000;
		p.setSalary(45000);
        p.display();
        
        Permanent p1 = new Permanent(999 , "Jay" , 45300);
        p1.display();
        
        Temporary t = new Temporary(561 , "Gem" , 200 , 90);
        t.display();
        
        Sales s = new Sales(987 , "PAN", 90000,93000);
        s.display();
        */
        
        Permanent p1 = new Permanent(999 , "Jay" , 45300);
        Temporary t = new Temporary(561 , "Gem" , 200 , 90);
        Sales s = new Sales(987 , "PAN", 90000,93000);
        System.out.println(p1.paySalary());
        System.out.println(t.paySalary());
        System.out.println(s.paySalary());
        
        System.out.println("===================");
        
        Employee[] e = new Employee[3];
        e[0] = new Permanent(999 , "Jay" , 45300);
        e[1] = new Temporary(561 , "Gem" , 200 , 90);
        e[2] = new Sales(987 , "PAN", 90000,93000);
        for (int i = 0; i < e.length; i++) {
        	System.out.println(e[i].paySalary());
        }
        
        System.out.println("===================");
        for (int i = 0; i < e.length; i++) {
        	e[0].raiseSalary(e[i]);
        }
        for (int i = 0; i < e.length; i++) {
        	System.out.println(e[i].paySalary());
        }
        
        System.out.println("EmpCount = " + Employee.getEmpCount());
        
      }
        

}
