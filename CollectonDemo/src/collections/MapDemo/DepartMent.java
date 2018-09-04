package collections.MapDemo;

import java.util.Random;

public class DepartMent {

	private Integer deptId;
	private String deptName;
	
	public DepartMent(Integer deptId, String deptName) {
		
		this.deptId = deptId;
		this.deptName = deptName;
	}

	public DepartMent() {
		// TODO Auto-generated constructor stub
		
		Integer deptId;
		Random r = new Random();
		
		deptId =r.nextInt(100)*57;
			
		String randamName="ITFINANCESUPPORTSECURTITY";
		int N= randamName.length();
		
		StringBuffer name=new  StringBuffer();
		
		for (int i = 0; i < 3; i++) {
			
		name.append(randamName.charAt(r.nextInt(N)));
			
		}
		
		this.deptId=deptId;
		this.deptName=name.toString();
		
	}
	
	public Integer getDeptId() {
		return deptId;
	}
	
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	
	public String getDeptName() {
		return deptName;
	}
	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	@Override
	public String toString() {
		return "DepartMent [deptId=" + deptId + ", deptName=" + deptName + "]";
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return getDeptId();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		DepartMent deptObj= new DepartMent();
		
		System.out.println("dept equals method");
		return deptObj.deptId.equals(getDeptId());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DepartMent dept= new DepartMent();
		
		System.out.println(dept);

	}

}
