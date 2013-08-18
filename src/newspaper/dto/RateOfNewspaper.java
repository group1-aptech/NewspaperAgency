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

    /**
     * Day of week
     */
    public static enum DayOfWeek{
        
        SUN(1), MON(2), TUE(3), WED(4), THU(5), FRI(6), SAT(7);
        
        private int value;

        /**
         * Get value of a day of week
         * @return value from 1 - 8
         */
        public int getValue() {
            return value;
        }
        
        private DayOfWeek(int d){
            value = d;
        }
    } 
    
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
        dayOfWeek = DayOfWeek.SUN.getValue();
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
