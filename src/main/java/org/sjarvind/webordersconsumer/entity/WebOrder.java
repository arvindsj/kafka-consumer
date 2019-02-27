package org.sjarvind.webordersconsumer.entity;

public class WebOrder {
    private String name;
    private String description;
    private String units;
    private String price;
    public WebOrder() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getUnits() {
        return units;
    }
    public void setUnits(String units) {
        this.units = units;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "WebOrder [name=" + name + ", description=" + description + ", units=" + units + ", price=" + price + "]";
    }
    
    

}
