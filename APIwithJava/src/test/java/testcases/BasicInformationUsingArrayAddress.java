package testcases;

public class BasicInformationUsingArrayAddress {
	
	private String Name;
	private String EmplyeeCode;
	private String Role;
	private String id;
	private AddressInformationArray[] Address;
	
	
	
	public AddressInformationArray[] getAddress() {
		return Address;
	}
	public void setAddress(AddressInformationArray[] address) {
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
