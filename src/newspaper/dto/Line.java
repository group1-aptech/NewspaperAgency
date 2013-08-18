package newspaper.dto;

/**
 * @since Aug - 17 - 2013
 * @author Nguyen Hoang Anh
 */
public class Line {
    private int id;
    private String name;
    private String address;
    private String phoneNo;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    /**
     * Create default values for new instance
     */
    public Line() {
        id = 0;
        name = "";
        address = "";
        phoneNo = "";
    }

    /**
     *
     * Create values for new instance
     * @param id Line ID
     * @param name Line name of delivery boy
     * @param address Address of delivery boy
     * @param phoneNo Phone number of of delivery boy
     */
    public Line(String name, String address, String phoneNo) {
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
    }
}
