package arraylist;

import java.util.ArrayList;

public class Assigments7 {

    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();
        friends.add("Bang");
        friends.add("Sang");
        friends.add("Cao Anh");
        friends.add("Bao");
        friends.add("H Anh");
        System.out.println("Danh sach ban be: ");
        for (String firend : friends) {
            System.out.println(firend);
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        System.out.println(numbers.remove(4));
        System.out.println("Danh sach sau khi xoa so 5: \n" + numbers);

        ArrayList<String> city = new ArrayList<>();
        city.add("Da Nang");
        city.add("Quang Nam");
        city.add("Hoi An");
        city.add("Hue");
        city.add("Quang Binh");
        System.out.println("Danh sach cac thanh pho:");
        for (String n : city) {
            System.out.println(n);
        }

        ArrayList<String> check = new ArrayList<>();
        check.add("Java");
        check.add("Python");
        check.add("C++");
        check.add("JavaScript");
        if (check.contains("Python")) {
            System.out.println("Python co trong danh sach");
        } else {
            System.out.println("Python khong co trong danh sach");
        }

        ArrayList<Integer> updateNumbers = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            updateNumbers.add(i);
        }
        updateNumbers.set(2, 100);
        System.out.println("Danh sach sau khi cap nhat: " + updateNumbers);

        ArrayList<Integer> Arrange = new ArrayList<>();
        Arrange.add(5);
        Arrange.add(3);
        Arrange.add(8);
        Arrange.add(2);
        Arrange.add(4);
        for (int i = 0; i < Arrange.size() - 1; i++) {
            for (int j = 0; j < Arrange.size() - 1 - i; j++) {
                if (Arrange.get(j) > Arrange.get(j + 1)) {
                    int temp = Arrange.get(j);
                    Arrange.set(j, Arrange.get(j + 1));
                    Arrange.set(j + 1, temp);
                }
            }
        }
        System.out.println("Danh sach sau khi sap xep: " + Arrange);

        ArrayList<Integer> arrayListToArray = new ArrayList<>();
        arrayListToArray.add(1);
        arrayListToArray.add(2);
        arrayListToArray.add(3);
        arrayListToArray.add(4);
        arrayListToArray.add(5);
        Integer[] array = new Integer[arrayListToArray.size()];
        arrayListToArray.toArray(array);
        System.out.println("Mang sau khi chuyen doi tu ArrayList:");
        for (int num : array) {
            System.out.println(num);
        }

    }
}
