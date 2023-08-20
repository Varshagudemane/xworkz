package app;

import java.util.Objects;

public class CEO {
	private String name;
	private String company;
	private boolean hasCar;
	private int expernece;
	private String location;
	private double salary;
	public CEO(String name, String company, boolean hasCar, int expernece, String location, double salary) {
		super();
		this.name = name;
		this.company = company;
		this.hasCar = hasCar;
		this.expernece = expernece;
		this.location = location;
		this.salary = salary;
	}
	public CEO() {
		super();
	}
	@Override
	public String toString() {
		return "CEO [name=" + name + ", company=" + company + ", hasCar=" + hasCar + ", expernece=" + expernece
				+ ", location=" + location + ", salary=" + salary + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(company, expernece, hasCar, location, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CEO other = (CEO) obj;
		return Objects.equals(company, other.company) && expernece == other.expernece && hasCar == other.hasCar
				&& Objects.equals(location, other.location) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

}
