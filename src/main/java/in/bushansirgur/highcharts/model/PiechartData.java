package in.bushansirgur.highcharts.model;



public class PiechartData {
	
	private Integer id;
	private String name;
	private Integer yaxis;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getYaxis() {
		return yaxis;
	}
	public void setYaxis(Integer yaxis) {
		this.yaxis = yaxis;
	}
	@Override
	public String toString() {
		return "PiechartData [id=" + id + ", name=" + name + ", yaxis=" + yaxis + "]";
	}

}
