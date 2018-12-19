
public abstract  class Employee {

	private int empno;
	private String name;
	private static int empCount;

	public Employee() {
          empCount++;
	}

	public Employee(int empno, String name) {
		this.empno = empno;
		this.name = name;
		// empno = empno1;
		// name = name1;
		empCount++;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getEmpno() {
		return empno;
	}
	
	public String getName() {
		return name;
	}
	
	public static int getEmpCount() {
		return empCount;
	}
	
	void display() {
		System.out.println("empno= " + empno);
		System.out.println("name= " + name);
	}

/*	public double paySalary() {
		return 0; // 過門而不入
					// 需overriding 不能用void. 這個叫動態連結
	}*/
	
	public abstract double paySalary();

	void raiseSalary(Employee e) {
         if (e instanceof Permanent) {
        	 Permanent p = (Permanent) e ;
        	 //p.salary *= 1.1;
        	 p.setSalary(p.getSalary()*1.1);
         } else if (e instanceof Temporary) {
        	 Temporary t = (Temporary) e	;
        	 //t.hourPay += 20;
        	 t.setHourPay(t.getHourPay() + 20);
         }
	}

}