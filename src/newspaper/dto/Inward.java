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

    public Inward() {
    }

    public Inward(Date inwardDate, int supplierID, int productID, int inwardQuantity, int returned) {
        this.inwardDate = inwardDate;
        this.supplierID = supplierID;
        this.productID = productID;
        this.inwardQuantity = inwardQuantity;
        this.returned = returned;
    }
}
