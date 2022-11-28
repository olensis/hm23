import java.util.HashSet;
import java.util.Set;

public class Product {
    Set<ProductList> lists = new HashSet<>();


    public Set<ProductList> getLists() {
        return lists;
    }

    public void setLists(Set<ProductList> lists) {
        this.lists = lists;
    }

    public void addList(ProductList productlist) {
        if (productlist.getName().isBlank() || productlist.getCost() == 0 || productlist.getWeight() == 0) {
            throw new RuntimeException("Поле должно быть заполнено");
        }
        lists.add(productlist);
    }

    public void isBought(ProductList productlist) {
        if (lists.contains(productlist)) {
            productlist.setBought(true);
        } else {
            throw new RuntimeException("Продукт еще не добавлен в список");
        }
    }
}

