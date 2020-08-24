import java.util.*;

public class SetImplementations {
    public static class MyComperator implements Comparator<String> {
        public int compare(String s1, String s2) {
            return s2.trim().compareTo(s1.trim());
        }
    }

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>(new MyComperator());

        String[] exampleArray = {"1. Vera", "2. Jani", "3. Adam", "4. Mate", "5. Kata"};

        for (String name : exampleArray) {
            hashSet.add(name);
            linkedHashSet.add(name);
            treeSet.add(name);
        }

        /**
         *    The HashSet doesn't keep the order.
         *    This is the fastest of the three.
         */
        System.out.println("The current order is by HashSet: ");
        for(String name : hashSet){
            System.out.println(name + " --> Hashcode: " + name.hashCode());
        }

        //A LinkedList megtartja a sorrendet
        /**
         *    The LinkedList and TreeSet are keep the order.
         */
        System.out.println("The current order is by LinkedHashSet: ");
        for(String name : linkedHashSet){
            System.out.println(name);
        }

        System.out.println("The current order is by TreeSet: ");
        //An ordered Set, the elements order by
        //Egy rendezett halmaz, a belarakott elemeket valamilyen szempont szerint sorrendbe rakja.
        for(String name : treeSet){
            System.out.println(name);
        }
    }
}
