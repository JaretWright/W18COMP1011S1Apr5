package w18comp1011s1apr5;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author JWright
 */
public class Car{
    
    //variables common to all cars
    private static int nextStockNum = 10001;
    private static String[] manufacturers = {"Acura", "Audi", "BMW", "Buick", "Cadillac", "Chevrolet", "Dodge", "Honda", "Hyundai", "Mazda", "Mercedes", "Porche"}; 
    private static String[] validColors = {"Red", "Yellow", "Green", "Grey","Black","White", "Orange"};
    
    //instance variables  
    private LocalDate purchaseByDealerDate, purchasedByOwnerDate;
    private double price;
    private int milage, year, stockNumber;
    private String make, model, color;    
    
    public Car(int year, String make, String model, String color, double price, int milage) {
        setMilage(milage);
        setYear(year);
        setMake(make);
        setModel(model);
        setColor(color);    
        setPrice(price);        
        stockNumber = nextStockNum;
        nextStockNum++; 
    }

    
    public static List<String> getValidColors() {
        List<String> colors = Arrays.asList(validColors);
        Collections.sort(colors);
        return colors;
    }
    
    
    public static List<String> getManufacturers()
    {
        List<String> validMakes = Arrays.asList(manufacturers);
        Collections.sort(validMakes);
        return validMakes;
    }

    public int getMilage() {
        return milage;
    }

    /**
     * This method will set the milage for the car
     * @param milage - must be greater than 0
     */
    public void setMilage(int milage) {
        if (milage < 0)
            throw new IllegalArgumentException("milage must be greater than or equal to 0");
        else
            this.milage = milage;
    }

    public int getYear() {
        return year;
    }

    
    /**
     * This sets the model year of the car.  
     * @param year - must be in the range of 1900 to 1 year beyond the current year
     */
    public void setYear(int year) {
        int nextYear = LocalDate.now().getYear()+1;
        if (year < 1900 || year > LocalDate.now().getYear()+1)
            throw new IllegalArgumentException("Model year of the car must be between 1900 and " + nextYear);
        else
            this.year = year;
    }

    public String getMake() {
        return make;
    }

    /**
     * This sets the make of the car
     * @param make - valid entries are "Acura", "Audi", "BMW", "Buick", "Cadillac", "Chevrolet", "Dodge", "Honda", "Hyundai", "Mazda", "Mercedes", "Porche"
     */
    public void setMake(String make) {
        List<String> validMakes = Arrays.asList(this.manufacturers);
        
        if (validMakes.contains(make))
            this.make = make;
        else
            throw new IllegalArgumentException("Invalid manufacturer name");
    }

    
    
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getPurchaseByDealerDate() {
        return purchaseByDealerDate;
    }

    public void setPurchaseByDealerDate(LocalDate purchaseByDealerDate) {
        this.purchaseByDealerDate = purchaseByDealerDate;
    }

    public LocalDate getPurchasedByOwnerDate() {
        return purchasedByOwnerDate;
    }

    public void setPurchasedByOwnerDate(LocalDate purchasedByOwnerDate) {
        this.purchasedByOwnerDate = purchasedByOwnerDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0)
            this.price = price;
        else
            throw new IllegalArgumentException("Price should be >= 0");
    }
    public int getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(int stockNumber) {
        this.stockNumber = stockNumber;
    }    
    
    @Override
    public String toString()
    {
        return String.format("%d %s %s %d kms $%.2f", getYear(), getMake(), getModel(), getMilage(), getPrice());
    }


}
