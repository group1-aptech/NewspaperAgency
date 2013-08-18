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
}
