package newspaper.dto;
/**
 * @since Aug - 17 - 2013
 * @author Nguyen Hoang Anh
 */
public class Supplier {
    private int id;
    private String name;
    private String address;
    private String phoneNo;

    public String getAddress() {
        return address;
    }

    public void setAddress(String _address) {
        this.address = _address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String _name) {
        this.name = _name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String _phoneNo) {
        this.phoneNo = _phoneNo;
    }

    /**
     * Create default values for new instance
     */
    public Supplier() {
        id = 0;
        name = "";
        address = "";
        phoneNo = "";
    }
    
    /**
     * Create values for new instance
     * @param _id Supplier ID
     * @param _name Supplier name
     * @param _address Supplier address
     * @param _phoneNo Supplier Phone number
     */
    public Supplier(int _id, String _name, String _address, String _phoneNo) {
        this.id = _id;
        this.name = _name;
        this.address = _address;
        this.phoneNo = _phoneNo;
    }
}
