import entity.Alpinist;
import entity.GroupList;
import entity.GroupList;
import entity.Mountain;

public class Application {
    public static void main(String[] args) {

        Mountain mountain1 = new Mountain("Everest", "China", 8848);
        Mountain mountain2 = new Mountain("Elbrus", "Russia", 5642);
        Mountain mountain3 = new Mountain("Ararat", "Turkey", 5137);

        GroupList groupList1 = new GroupList(mountain1);
        GroupList groupList2 = new GroupList(mountain2);
        GroupList groupList3 = new GroupList(mountain3);

        Alpinist alpinists1 = new Alpinist("Maxim", "New York");
        Alpinist alpinists2 = new Alpinist("Ivan", "Tokio");
        Alpinist alpinists3 = new Alpinist("Olga", "Bangladesh");
        Alpinist alpinists4 = new Alpinist("Yana", "Moscow");
        Alpinist alpinists5 = new Alpinist("Oleg", "Saint-Petersburg");
        Alpinist alpinists6 = new Alpinist("Alexandr", "Kazan");
        Alpinist alpinists7 = new Alpinist("Georgii", "Munich");

        groupList1.addAlpinist(alpinists1, alpinists2);
        groupList2.addAlpinist(alpinists4, alpinists5);
        groupList3.addAlpinist(alpinists6, alpinists7);

        System.out.println(groupList1);
    }
}

