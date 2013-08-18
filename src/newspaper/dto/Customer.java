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
        id = 0;
        name = "";
        deliveryAddress = "";
        phoneNo = "";
        deliveryCharge = 0;
        startDate = new Date();
        closeDate = new Date();
        lineId = 0;
        active = false;
        customerAvailableDay = "";
    }

    /**
     * Create values for new instance
     * @param name Customer Name
     * @param deliveryAddress Customer's Delivery Address
     * @param phoneNo Customer phone number
     * @param deliveryCharge Delivery Charge
     * @param startDate Date when customer start requires newspaper
     * @param closeDate Date when customer stop requires newspaper
     * @param active flag for customer active, 
     *               if customer is not available for some days in a month, 
     *               just set customer this flag, no paper will deliver for this customer for the period.
     * @param lineId Id of line
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
