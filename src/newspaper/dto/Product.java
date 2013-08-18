package newspaper.dto;

/**
 * @since Aug - 17 - 2013
 * @author Nguyen Hoang Anh
 */
public class Product {
    
    private int id;
    private String name;
    private String language;
    private int supplierID;
    private int type;
    private float rateOfMagazine;
    // TODO: Fix?
    private int rateOfNewspaperID;
    
    /**
     * Language for product: English
     */
    public static final String EN = "English";
    /**
     * Language for product: Vietnamese
     */
    public static final String VI = "Vietnamese";
    /**
     * Type of Product: Newspaper
     */
    public static final int NP = 1;
    /**
     * Type of Product: Magazine
     */
    public static final int MZ = 2;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(int supplierID) {
        this.supplierID = supplierID;
    }

    public int getType() {
        return type;
    }

    public void setType(int typeID) {
        this.type = typeID;
    }

    public float getRateOfMagaznie() {
        return rateOfMagazine;
    }

    public void setRateOfMagaznie(float rateOfMagaznie) {
        this.rateOfMagazine = rateOfMagaznie;
    }

    public int getRateOfNewspaperID() {
        return rateOfNewspaperID;
    }

    public void setRateOfNewspaperID(int rateOfNewspaperID) {
        this.rateOfNewspaperID = rateOfNewspaperID;
    }

    
    /**
     * Create default values for new instance
     */
    public Product() {
        id = 0;
        name = "Product";
        language = Product.EN;
        supplierID = 1;
        type = Product.NP; // NP is newspaper, MZ is magazine
    }

    /**
     * Create values for new instance
     * @param id Product ID 
     * @param name Product name
     * @param language Language
     * @param supplierID Supplier ID
     * @param type TypeID: MyConstant.NP is newspaper, MyConstant.MZ is magazine
     */
    // TODO: id?
    public Product(int id, String name, String language, int supplierID, int type) {
        this.id = id;
        this.name = name;
        this.language = language;
        this.supplierID = supplierID;
        this.type = type;
    }
}
