// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        HashSet<Integer> intSet1 = new HashSet<>();
        intSet1.add(1);
        intSet1.add(2);
        intSet1.add(2);
        intSet1.add(3);
        System.out.println("Size of intSet1: " + intSet1.size());

        HashSet<Integer> intSet2 = new HashSet<>();
        intSet2.add(1);
        intSet2.add(2);
        intSet2.add(4);
        System.out.println("Size of intSet2: " + intSet2.size());

        System.out.println("intSet1 contain 1? : " + intSet1.contains(1));
        System.out.println("intSet2 is subset of intSet1? : " + intSet1.containsAll(intSet2));

        System.out.print("intSet1 ");
        intSet1.printAll();

        intSet2.add(5);
        intSet2.remove(1);
        System.out.print("intSet2 ");
        intSet2.printAll();

        System.out.println("------------------------");
        System.out.println("intSet1 - intSet2");
        intSet1.removeAll(intSet2);
        System.out.print("intSet1 ");
        intSet1.printAll();
        System.out.println("------------------------");

        intSet1.add(2);
        System.out.println("intSet1 intersect intSet2");
        intSet1.retainAll(intSet2);
        System.out.print("intSet1 ");
        intSet1.printAll();
        System.out.println("------------------------");

        intSet1.add(1);
        intSet1.add(3);
        System.out.println("intSet1 union intSet2");
        intSet1.addAll(intSet2);
        System.out.print("intSet1 ");
        intSet1.printAll();
        System.out.println("------------------------");

        intSet1.clear();
        System.out.print("intSet1 ");
        intSet1.printAll();
        System.out.print("intSet1 is Empty? : ");
        System.out.println(intSet1.isEmpty());
    }
}