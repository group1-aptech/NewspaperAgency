package newspaper.dto;

/**
 * @since Aug - 18 - 2013
 * @author Nguyen Hoang Anh
 */
public class Requirement {
    private int id;
    private int customerId;
    private int productId;
    private NewsPaperDay[] newsPaperDays;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getId() {
        return id;
    }

    public NewsPaperDay[] getNewsPaperDays() {
        return newsPaperDays;
    }

    public void setNewsPaperDays(NewsPaperDay[] newsPaperDays) {
        this.newsPaperDays = newsPaperDays;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    /**
     * Create default values for new instance
     */
    public Requirement() {
        id = 0;
        customerId = 0;
        productId = 0;
        newsPaperDays = new NewsPaperDay[7];
    }

    /**
     * Create values for new instance
     * @param customerId
     * @param productId
     * @param newsPaperDays 
     */
    public Requirement(int customerId, int productId, NewsPaperDay[] newsPaperDays) {
        this.customerId = customerId;
        this.productId = productId;
        this.newsPaperDays = newsPaperDays;
    }
}
