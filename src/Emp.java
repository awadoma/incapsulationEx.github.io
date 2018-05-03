//154 incapsulation
public class Emp {
	private int _EmpNumb;
	private String _EmpName;
	private String _EmpAdress;
	public int get_EmpNumb() {
		return _EmpNumb;
	}
	public void set_EmpNumb(int _EmpNumb) {
		this._EmpNumb = _EmpNumb;
	}
	public String get_EmpName() {
		return _EmpName;
	}
	public void set_EmpName(String _EmpName) {
		this._EmpName = _EmpName;
	}
	public String get_EmpAdress() {
		return _EmpAdress;
	}
	public void set_EmpAdress(String _EmpAdress) {
		this._EmpAdress = _EmpAdress;
	}
	public void printInfo() {
		System.out.println("Employee Number" + "\n" +_EmpNumb);
		System.out.println("Employee Name" + "\n" +_EmpName);
		System.out.println("Employee Adress" + "\n" +_EmpAdress);
		
	}
	

}
