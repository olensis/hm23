import java.util.HashSet;
import java.util.Set;

public class ProductList {
    Set<Product> lists = new HashSet<>();


    public Set<Product> getLists() {
        return lists;
    }

    public void setLists(Set<Product> lists) {
        this.lists = lists;
    }

    public void addList(Product product) {
        if (product.getName().isBlank() || product.getCost() == 0 || product.getWeight() == 0) {
            throw new RuntimeException("Поле должно быть заполнено");
        }
        lists.add(product);
    }

    public void isBought(Product product) {
        if (lists.contains(product)) {
            product.setBought(true);
        } else {
            throw new RuntimeException("Продукт еще не добавлен в список");
        }
    }
}



