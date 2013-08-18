package newspaper.dto;

/**
 * @since Aug - 18 - 2013
 * @author Nguyen Hoang Anh
 */
public class BillDetails {
    private int billNo;
    private int productID;
    private int quantity;

    public int getBillNo() {
        return billNo;
    }

    public void setBillNo(int billNo) {
        this.billNo = billNo;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Create default values for new instance
     */
    public BillDetails() {
        billNo = 0;
        productID = 0;
        quantity = 0;
    }
    
    /**
     * Create values for new instance
     * @param billNo
     * @param productID
     * @param quantity 
     */
    public BillDetails(int billNo, int productID, int quantity) {
        this.billNo = billNo;
        this.productID = productID;
        this.quantity = quantity;
    }
}
