import java.util.*;

public class Main {
    public static void main(String[] args) {

        //1
        HashMap<Guide, String> guide = new HashMap<>();
        Guide ivanow = new Guide("Иванов", "И.И");
        Guide petrow = new Guide("Петров","П.П");
        Guide nik = new Guide("Николев ", "И.И");
        Guide zub = new Guide("Зубов","А.П");
        Guide ivan = new Guide("Иванович", "К.И");
        Guide pettr= new Guide("Петрович", "М.П");
        Guide kot =new Guide("Котов", "И.И");
        Guide mol = new Guide("Молович", "Т.П");
        Guide man = new Guide("Маняхин", "И.В");
        Guide dur = new Guide("Дурилов", " А.П");
        Guide udr = new Guide("Ибрагимов", "Р.В");
        Guide molod = new Guide("Молодцов", "О.П");
        Guide kit = new Guide("Китов", "Т.П");
        Guide sad = new Guide("Садовникова", "Е.В");
        Guide gawr = new Guide("Гаврилов", "Г.Г");
        Guide golow = new Guide("Голованов", "В.В");
        Guide sid = new Guide("Сидоров", "П.П");
        Guide il = new Guide("Ильин", "И.И");
        Guide zot = new Guide("Зотов", "А.А");
        Guide kost = new Guide("Костин", "М.М");

        guide.put(ivanow, "892711111");
        guide.put(petrow, "+792348576");
        guide.put(nik, "8927166111");
        guide.put(zub, "+7992348576");
        guide.put(ivan, "892-11111");
        guide.put(pettr, "+7923-485-76");
        guide.put(kot, "892711111");
        guide.put(mol, "+7923848576");
        guide.put(man, "89271155911");
        guide.put(dur, "+7909348576");
        guide.put(udr, "89527131111");
        guide.put(molod, "+79902348576");
        guide.put(kit, "+7923948576");
        guide.put(sad, "892711911");
        guide.put(gawr, "+7929348576");
        guide.put(golow, "8927131111");
        guide.put(sid, "+792348576");
        guide.put(il, "8978787878");
        guide.put(zot, " 7898765432");
        guide.put(kost, "7895647777");
        System.out.println(guide.entrySet());

        //2
        ProductList apple = new ProductList("Яблоко", 50, 2);
        ProductList cola = new ProductList("Кола", 150, 3);
        ProductList meat = new ProductList("Мясо", 200, 1);
        ProductList banan = new ProductList("Банан", 100, 5);
        ProductList cucumber = new ProductList("Огурец", 25, 5);
        ProductList potato = new ProductList("Картошка", 10, 10);
        Product product = new Product();
        product.addList(apple);
        product.addList(cola);
        product.addList(meat);
        product.addList(banan);
        product.addList(cucumber);

//        System.out.println(product.getLists());

        HashMap<ProductList, Integer> products = new HashMap<>();
        ProductList recipe = new ProductList();
        products.put(banan, 2);
        products.put(apple,3);

        // 1 вариант решения
        Recipes salat = new Recipes("Салат",recipe.getProducts());
        salat.addProducts(banan, 2);
        salat.addProducts(apple,3);
        recipe.addReception(salat);
        System.out.println(salat.getProducts().keySet());

        // как сделать метод, чтобы счетчик работал?
        System.out.println(salat.getTotalCosts());

        // 2 вариант решения
        Set<Recipes> meaty = new HashSet<>();
        meaty.add(meat);
        meaty.add(cucumber);
        meaty.add(potato);
        System.out.println("Рецепт" + meaty);

        //задание 3
        HashMap<String, Integer> abs = new HashMap<>();
        abs.put("екатерина", 7);
        abs.put("мария ", 10);
        abs.put("владимир", 5);
        abs.put("коля", 4);
        addToMap(abs, "екатерина", 8);
        System.out.println(abs.get("екатерина"));

        //задание 4

        Map<String, List<Integer>> map =new HashMap<>();
        map.put("Один", randomList ());
        map.put("Два", randomList());
        map.put("Три", randomList());
        map.put("Четыре", randomList());
        map.put("Пять", randomList());
        System.out.println(map.entrySet());
        Map<String, Integer> string = convertMap(map);
        System.out.println(string.entrySet());

        // задание 5

        Map<Integer, String> random = new HashMap<>();
        random.put(7, "Я");
        random.put(8, "Ты");
        random.put(9,"Он");
        random.put(10, "Она");
        random.put(6, "Оно");
        random.put(5,"Они");
        random.put(4, "Мы");
        random.put(3, "Их");
        random.put(2, "Его");
        random.put(1,"Ее");
        System.out.println(random.entrySet());









    }
    public static void addToMap(HashMap<String, Integer> abs , String a, Integer i) {
        if (abs.containsKey(a) && abs.get(a).equals(i)) {
            throw new RuntimeException("Значения совпадают"); }
        abs.put(a, i);
    }
    public static List<Integer> randomList() {
        List<Integer> integers = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            integers.add((int) (Math.random() * 1000));
        }
        return integers;
    }
    public static HashMap<String, Integer> convertMap(Map<String, List<Integer>> map) {
        HashMap<String, Integer> string = new HashMap<>();
        for (String s : map.keySet()) {
            int total = 0;
            for (Integer integer : map.get(s)) {
                total = total + integer;
            }
            string.put(s, total);
        }
        return string;

    }
}