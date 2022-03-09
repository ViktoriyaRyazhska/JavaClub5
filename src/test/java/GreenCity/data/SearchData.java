package GreenCity.data;

public class SearchData {
    private String request1;
    private String request2;

    public SearchData() {
        request1 = "rule";
        request2 = "Courier works";
    }

    // setters

    public void setrequestR(String request1) {
        this.request1 = request1;
    }

    public void setRequest2(String request2) {
        this.request2 = request2;
    }

    // getters

    public String getRequest1() {
        return request1;
    }

    public String getRequest2() {
        return request2;
    }
}
