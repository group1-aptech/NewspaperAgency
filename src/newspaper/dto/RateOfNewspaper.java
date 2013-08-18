package newspaper.dto;

import newspaper.util.MyConstant;

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
        dayOfWeek = MyConstant.DAY_OF_WEEK_ENUM.SUN.getValue();
        productID = 0;
        rate = 0;
    }

    /**
     * Create values for new instance
     * @param productID
     * @param dayOfWeek 
     * @param rate Rate of product which has productID
     */
    public RateOfNewspaper(int productID, int dayOfWeek, double rate) {
        this.productID = productID;
        this.dayOfWeek = dayOfWeek;
        this.rate = rate;
    }
}
