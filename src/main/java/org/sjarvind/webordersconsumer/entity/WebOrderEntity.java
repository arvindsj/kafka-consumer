package org.sjarvind.webordersconsumer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "WebOrder")
public class WebOrderEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String id;
    private String name;
    private String description;
    private String units;
    private String price;
    public WebOrderEntity() {}

    public WebOrderEntity(String name, String description, String units, String price) {
        this.name = name;
        this.description = description;
        this.units = units;
        this.price = price;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
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
        return "WebOrder [id=" + id + ", name=" + name + ", description=" + description + ", units=" + units + ", price=" + price + "]";
    }

}
