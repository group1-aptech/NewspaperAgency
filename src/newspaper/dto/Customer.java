package newspaper.dto;

import java.util.Date;

/**
 * @since Aug - 17 - 2013
 * @author Nguyen Hoang Anh
 */
public class Customer {
    private int id;
    private String name;
    private String deliveryAddress;
    private String phoneNo;
    private float deliveryCharge;
    private Date startDate;
    private Date closeDate;
    private boolean active;
    private int lineId;
    private String customerAvailableDay;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean _active) {
        this.active = _active;
    }

    public Date getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Date _closeDate) {
        this.closeDate = _closeDate;
    }

    public String getCustomerAvailableDay() {
        return customerAvailableDay;
    }

    public void setCustomerAvailableDay(String _customerAvailableDay) {
        this.customerAvailableDay = _customerAvailableDay;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String _deliveryAddress) {
        this.deliveryAddress = _deliveryAddress;
    }

    public float getDeliveryCharge() {
        return deliveryCharge;
    }

    public void setDeliveryCharge(float _deliveryCharge) {
        this.deliveryCharge = _deliveryCharge;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    public int getLineId() {
        return lineId;
    }

    public void setLineId(int _lineId) {
        this.lineId = _lineId;
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date _startDate) {
        this.startDate = _startDate;
    }

    /**
     * Create default values for new instance
     */
    public Customer() {
    }

    /**
     * Create values for new instance
     * @param name Customer Name
     * @param deliveryAddress Customer Delivery Address
     * @param phoneNo Customer phone number
     * @param deliveryCharge Delivery Charge
     * @param startDate
     * @param closeDate
     * @param active
     * @param lineId
     * @param customerAvailableDay 
     */
    public Customer(String name, String deliveryAddress, String phoneNo, float deliveryCharge,
                    Date startDate, Date closeDate, boolean active, int lineId, String customerAvailableDay) {
        this.name = name;
        this.deliveryAddress = deliveryAddress;
        this.phoneNo = phoneNo;
        this.deliveryCharge = deliveryCharge;
        this.startDate = startDate;
        this.closeDate = closeDate;
        this.active = active;
        this.lineId = lineId;
        this.customerAvailableDay = customerAvailableDay;
    }
}
