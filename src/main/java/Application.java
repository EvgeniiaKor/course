import entity.Alphinist;
import entity.Groups;
import entity.Mountain;

public class Application {
    public static void main(String[] args) {


        Alphinist[] alpinists1 = new Alphinist[3];
        alpinists1[0] = new Alphinist("Maxim", "New York");
        alpinists1[1] = new Alphinist("Ivan", "Tokio");
        alpinists1[2] = new Alphinist("Olga", "Bangladesh");

        Alphinist[] alpinists2 = new Alphinist[2];
        alpinists2[0] = new Alphinist("Yana", "Moscow");
        alpinists2[1] = new Alphinist("Oleg", "Saint-Petersburg");

        Alphinist[] alpinists3 = new Alphinist[2];
        alpinists3[0] = new Alphinist("Alexandr", "Kazan");
        alpinists3[1] = new Alphinist("Georgii", "Munich");


        Mountain mountain1 = new Mountain("Everest", "China", 8848);
        Mountain mountain2 = new Mountain("Elbrus", "Russia", 5642);
        Mountain mountain3 = new Mountain("Ararat", "Turkey", 5137);


        Groups groupName1 = new Groups(false, mountain1, alpinists1);
        groupName1.setGroupName("Group №1");
        groupName1.setMountain(mountain1);

        Groups groupName2 = new Groups(true, mountain2, alpinists2);
        groupName2.setGroupName("Group №2");
        groupName2.setMountain(mountain2);

        Groups groupName3 = new Groups(true, mountain3, alpinists3);
        groupName3.setGroupName("Group №3");
        groupName3.setMountain(mountain3);

        System.out.println(groupName1.getGroupName() + " - " + groupName1.getMountain());

        for (int i = 0; i < alpinists1.length; i++){
            System.out.println(alpinists1[i].getName());
        }

        System.out.println(groupName2.getGroupName() + " - " + groupName2.getMountain());

        for (int i = 0; i < alpinists2.length; i++){
            System.out.println(alpinists2[i].getName());
        }

        System.out.println(groupName3.getGroupName() + " - " + groupName3.getMountain());

        for (int i = 0; i < alpinists3.length; i++){
            System.out.println(alpinists3[i].getName());
        }
    }
}