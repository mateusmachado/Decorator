public class ThreeCheesePizza implements Pizza{

    private String description = "Mozzarella, Fontina, Parmesan Cheese Pizza";
    private double cost = 10.50;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}