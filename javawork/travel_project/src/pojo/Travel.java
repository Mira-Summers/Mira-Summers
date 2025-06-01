package pojo;

public class Travel {
    private Integer id;
    private String travelName;
    private String travelDesc;
    private String startDate;
    private String endDate;
    private String tripStart;
    private String tripEnd;
    private Double price;
    private Integer num;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTravelName() {
        return travelName;
    }

    public void setTravelName(String travelName) {
        this.travelName = travelName;
    }

    public String getTravelDesc() {
        return travelDesc;
    }

    public void setTravelDesc(String travelDesc) {
        this.travelDesc = travelDesc;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getTripStart() {
        return tripStart;
    }

    public void setTripStart(String tripStart) {
        this.tripStart = tripStart;
    }

    public String getTripEnd() {
        return tripEnd;
    }

    public void setTripEnd(String tripEnd) {
        this.tripEnd = tripEnd;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "travel{" +
                "id=" + id +
                ", travelName='" + travelName + '\'' +
                ", travelDesc='" + travelDesc + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", tripStart='" + tripStart + '\'' +
                ", tripEnd='" + tripEnd + '\'' +
                ", price=" + price +
                ", num=" + num +
                '}';
    }


}
