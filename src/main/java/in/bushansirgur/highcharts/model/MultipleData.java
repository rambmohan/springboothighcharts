package in.bushansirgur.highcharts.model;




public class MultipleData {
	
	private Integer id;
	private String name;
	private String subscribers;
	private String year;
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
	public String getSubscribers() {
		return subscribers;
	}
	public void setSubscribers(String subscribers) {
		this.subscribers = subscribers;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "MultipleData [id=" + id + ", name=" + name + ", subscribers=" + subscribers + ", year=" + year + "]";
	}
	
}
