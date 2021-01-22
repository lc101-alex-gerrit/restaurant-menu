package restuarant;

import java.util.Date;

public class MenuItem {
    private double price;
    private String name;
    private String description;
    private String category;
    private boolean isNew;
    private Date dateCreated;
    private String pictureLocation;
    private int calories;

    public MenuItem(double price,
                    String name,
                    String description,
                    String category,
                    String pictureLocation,
                    int calories) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.category = category;
        this.pictureLocation = pictureLocation;
        this.calories = calories;
        this.isNew = true;
        this.dateCreated = new Date();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPictureLocation() {
        return pictureLocation;
    }

    public void setPictureLocation(String pictureLocation) {
        this.pictureLocation = pictureLocation;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public boolean isNew() {
        return isNew;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

}
