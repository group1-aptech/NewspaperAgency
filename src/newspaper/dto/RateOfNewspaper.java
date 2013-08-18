package newspaper.dto;

/**
 * @since Aug - 17 - 2013
 * @author Nguyen Hoang Anh
 */
public class RateOfNewspaper {
    private int id;
    private int productID;
    private int dayOfWeek;
    private double rate;

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

   /**
     * Create default values for new instance
     */
    public RateOfNewspaper() {
        id = 0;
        productID = 0;
        rate = 0;
    }
}
