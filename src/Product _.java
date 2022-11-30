import java.util.HashMap;
import java.util.Objects;

class Product extends Recipes {
    private String name;
    private int cost;
    private int weight;
    private boolean bought = false;

    public Product(String nameRecipes, HashMap<Product, Integer> products) {
        super(nameRecipes, products);
    }

    public Product(ProductList productList) {
        super();
    }
    public Product() {

    }




    @Override
    public String toString() {
        return "ProductList{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Product product = (Product) o;
        return cost == product.cost && weight == product.weight && name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost, weight);
    }

    public Product(String name, int cost, int weight) {
        super(name,cost,weight);
        this.name = name;
        this.cost = cost;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getWeight() {
        return weight;
    }

    public void setBought(boolean bought) {
        this.bought = bought;
    }
    public boolean isBought() {
        return bought;
    }
}
