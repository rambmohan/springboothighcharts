package in.bushansirgur.highcharts.model;




public class Data {
	

	private Integer id;
	private String category;
	private Double series;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Double getSeries() {
		return series;
	}
	public void setSeries(Double series) {
		this.series = series;
	}
	@Override
	public String toString() {
		return "Data [id=" + id + ", category=" + category + ", series="
				+ series + "]";
	}
}
