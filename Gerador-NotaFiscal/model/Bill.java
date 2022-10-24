package model;

public class Bill {
	private String name;
    private String address;
    private Service service;
    private Double salary;

	public Bill(String name, String address, Service service, Double salary) {
		this.name = name;
        this.address = address;
        this.service = service;
        this.salary = salary;
	}
	
	public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public Double getSalary() {
        return this.salary;
    }

    public Service getService() {
        return this.service;
    }
}

}
