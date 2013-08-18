package newspaper.dto;
/**
 * @since Aug - 18 - 2013
 * @author Nguyen Hoang Anh
 */
public class PaymentReceiver {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Create default values for new instance
     */
    public PaymentReceiver() {
        id = 0;
        name = "";
    }

    /**
     * Create values for new instance
     * @param name Name of receiver
     */
    public PaymentReceiver(String name) {
        this.name = name;
    }
}
