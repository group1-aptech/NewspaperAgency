package newspaper.dto;


/**
 * @since Aug - 17 - 2013
 * @author Nguyen Hoang Anh
 */
public class Product {
    
    private int id;
    private String code;
    private String name;
    private int supplierID;
    private int type;
    private double rateOfMagazine;
    private RateOfNewspaper[] rateOfNewspapers;
    
    /**
     * Type of Product: Newspaper
     */
    public static final int NP = 1;
    /**
     * Type of Product: Magazine
     */
    public static final int MZ = 2;
    
    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public double getRateOfMagazine() {
        return rateOfMagazine;
    }

    public void setRateOfMagazine(double rateOfMagazine) {
        this.rateOfMagazine = rateOfMagazine;
    }
    
    public RateOfNewspaper[] getRateOfNewspapers() {
        return rateOfNewspapers;
    }

    public void setRateOfNewspapers(RateOfNewspaper[] rateOfNewspapers) {
        this.rateOfNewspapers = rateOfNewspapers;
    }
    
    /**
     * Create default values for new instance
     */
    public Product() {
        id = 0;
        code = "";
        name = "";
        supplierID = 0;
        type = Product.NP; // NP is newspaper, MZ is magazine
        rateOfMagazine = 0.0;
        rateOfNewspapers = new RateOfNewspaper[7];
    }

    /**
     * Create values for new instance
     * @param code Code of product
     * @param name Name of product
     * @param supplierID Supplier ID
     * @param type Type of product: NP is newspaper, MZ is magazine
     * @param rateOfMagazine If product is newspaper, rateOfNewspapers = 0
     * @param rateOfNewspapers If product is magazine, rateOfMagazine is empty
     */
    public Product(String code, String name, int supplierID, int type, double rateOfMagazine, RateOfNewspaper[] rateOfNewspapers) {
        this.code = code;
        this.name = name;
        this.supplierID = supplierID;
        this.type = type;
        this.rateOfMagazine = rateOfMagazine;
        this.rateOfNewspapers = rateOfNewspapers;
    }
}