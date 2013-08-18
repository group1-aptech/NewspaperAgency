package newspaper.dto;

import java.util.Date;

/**
 * @since Aug - 18 - 2013
 * @author Nguyen Hoang Anh
 */
public class Inward {
    private int id;
    private Date inwardDate;
    private int supplierID;
    private int productID;
    private int inwardQuantity;
    private int returned;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getInwardDate() {
        return inwardDate;
    }

    public void setInwardDate(Date inwardDate) {
        this.inwardDate = inwardDate;
    }

    public int getInwardQuantity() {
        return inwardQuantity;
    }

    public void setInwardQuantity(int inwardQuantity) {
        this.inwardQuantity = inwardQuantity;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getReturned() {
        return returned;
    }

    public void setReturned(int returned) {
        this.returned = returned;
    }

    public int getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(int supplierID) {
        this.supplierID = supplierID;
    }

    /**
     * Create default values for new instance
     */
    public Inward() {
        id = 0;
        inwardDate = new Date();
        supplierID = 0;
        productID = 0;
        inwardQuantity = 0;
        returned = 0;
    }

    /**
     * Create values for new instance
     * @param inwardDate Inward date
     * @param supplierID Supplier ID
     * @param productID Product ID
     * @param inwardQuantity Inward quantity
     * @param returned Number of returned products
     */
    public Inward(Date inwardDate, int supplierID, int productID, int inwardQuantity, int returned) {
        this.inwardDate = inwardDate;
        this.supplierID = supplierID;
        this.productID = productID;
        this.inwardQuantity = inwardQuantity;
        this.returned = returned;
    }
}
