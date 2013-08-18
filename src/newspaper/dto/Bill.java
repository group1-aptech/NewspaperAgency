package newspaper.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @since Aug - 18 - 2013
 * @author Nguyen Hoang Anh
 */
public class Bill {
    private int billNo;
    private int customerID;
    private String message;
    private Date prepareDate;
    private double totalAmout;
    private int receiverID;
    private List<BillDetails> details;
    private double paid;

    public int getBillNo() {
        return billNo;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getPrepareDate() {
        return prepareDate;
    }

    public void setPrepareDate(Date prepareDate) {
        this.prepareDate = prepareDate;
    }

    public int getReceiverID() {
        return receiverID;
    }

    public void setReceiverID(int receiverID) {
        this.receiverID = receiverID;
    }

    public double getTotalAmout() {
        return totalAmout;
    }

    public void setTotalAmout(double totalAmout) {
        this.totalAmout = totalAmout;
    }

    public List<BillDetails> getDetails() {
        return details;
    }

    public void setDetails(List<BillDetails> details) {
        this.details = details;
    }

    public double getPaid() {
        return paid;
    }

    public void setPaid(double paid) {
        this.paid = paid;
    }

    /**
     * Create default values for new instance
     */
    public Bill() {
        billNo = 0;
        customerID = 0;
        message = "";
        prepareDate = new Date();
        totalAmout = 0;
        receiverID  = 0;
        details = new ArrayList<>();
    }

    /**
     * Create values for new instance
     * @param customerID
     * @param message
     * @param prepareDate
     * @param totalAmout
     * @param receiverID
     * @param details
     * @param paid 
     */
    public Bill(int customerID, String message, Date prepareDate, double totalAmout, int receiverID, List<BillDetails> details, double paid) {
        this.customerID = customerID;
        this.message = message;
        this.prepareDate = prepareDate;
        this.totalAmout = totalAmout;
        this.receiverID = receiverID;
        this.details = details;
        this.paid = paid;
    }
}
