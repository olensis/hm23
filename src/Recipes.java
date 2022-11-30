import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipes {
    private int totalCosts;
    private String nameRecipes;
    private Set<Product> lists = new HashSet<>();
    private HashMap<Product, Integer> products = new HashMap<Product, Integer>();
    private boolean bought = false;

    public Recipes(String name, int cost, int weight) {
    }

    public Recipes() {
    }


    public String getNameRecipes() {
        return nameRecipes;
    }

    public Set<Product> getLists() {
        return lists;
    }


    public Recipes(String nameRecipes, HashMap<Product, Integer> products) {
        this.nameRecipes = nameRecipes;
        this.products = products;
        this.totalCosts = getTotalCosts();

    }

    @Override
    public int hashCode() {
        return Objects.hash(nameRecipes);
    }


    public void isBought(Recipes nameRecipes) {
        if (lists.contains(nameRecipes)) {
            nameRecipes.setBought(true);
        } else {
            throw new RuntimeException("Такого названия еще нет");
        }
    }


    public void setBought(boolean bought) {
        this.bought = bought;
    }

    public int getTotalCosts() {
        return totalCosts;
    }

    public HashMap<Product, Integer> getProducts() {
        return products;
    }

    public void addProducts(Product product, int i) {
        products.put(product, 1);
    }

    public void setProducts(HashMap<Product, Integer> products) {
        this.products = products;
    }

    public void addReception(Recipes reception) {
        if (reception.getNameRecipes().isBlank()) {
            throw new RuntimeException("Рецепт не указан");
        } else
            System.out.println("Рецепт есть в списке" + getProducts());
    }

    public int getTotalCost() {
        calculateCost();
        return totalCosts;

    }
    public void calculateCost() {
        int total = 0;
        for (Product product : getProducts().keySet() ) {
            int i =( product.getWeight() * product.getCost())* products.get(product);
            total += i;
        }
        totalCosts = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipes recipes = (Recipes) o;
        return nameRecipes.equals(recipes.nameRecipes);
    }
}
