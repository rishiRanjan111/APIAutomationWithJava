package testcases;

public class BasicInformation {
	
	private String Name;
	private String EmplyeeCode;
	private String Role;
	private String id;
	private AddressInformation Address;
	
	public AddressInformation getAddress() {
		return Address;
	}
	public void setAddress(AddressInformation address) {
		Address = address;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmplyeeCode() {
		return EmplyeeCode;
	}
	public void setEmplyeeCode(String emplyeeCode) {
		EmplyeeCode = emplyeeCode;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
