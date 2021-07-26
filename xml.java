package pojo;

public class xml {
	private double xmin;
	private double ymin;
	private double xmax;
	private double ymax;
	private String name;
	public double getXmin() {
		return xmin;
	}
	public void setXmin(double xmin) {
		this.xmin = xmin;
	}
	public double getYmin() {
		return ymin;
	}
	public void setYmin(double ymin) {
		this.ymin = ymin;
	}
	public double getXmax() {
		return xmax;
	}
	public void setXmax(double xmax) {
		this.xmax = xmax;
	}
	public double getYmax() {
		return ymax;
	}
	public void setYmax(double ymax) {
		this.ymax = ymax;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "xml [xmin=" + xmin + ", ymin=" + ymin + ", xmax=" + xmax
				+ ", ymax=" + ymax + ", name=" + name + "]";
	}
	public xml(double xmin, double ymin, double xmax, double ymax, String name) {
		super();
		this.xmin = xmin;
		this.ymin = ymin;
		this.xmax = xmax;
		this.ymax = ymax;
		this.name = name;
	}
	public xml() {
		super();
	}
	
}
