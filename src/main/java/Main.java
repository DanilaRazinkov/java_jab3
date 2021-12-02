import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        int N = 2000;
        System.out.println("|Function       |ArrayList           |LinkedList          | \n" +
                "|---------------|--------------------|--------------------|");

        System.out.print("|add            |"); // тестируем функцию добавления

        System.out.printf("%20d", TestCollection.testAdd(arrayList, N));
        System.out.print("|");
        System.out.printf("%20d", TestCollection.testAdd(linkedList, N));
        System.out.println("|");
        System.out.println("|---------------|--------------------|--------------------|");

        System.out.print("|remove(first)  |"); //тестируем удаления первого элемента

        System.out.printf("%20d", TestCollection.testRemoveFirst(arrayList, N));
        System.out.print("|");
        System.out.printf("%20d", TestCollection.testRemoveFirst(linkedList, N));
        System.out.println("|");
        System.out.println("|---------------|--------------------|--------------------|");

        System.out.print("|remove(last)   |"); // тестируем удаление последнего элемента

        System.out.printf("%20d", TestCollection.testRemoveLast(arrayList, N));
        System.out.print("|");
        System.out.printf("%20d", TestCollection.testRemoveLast(linkedList, N));
        System.out.println("|");
        System.out.println("|---------------|--------------------|--------------------|");

        System.out.print("|remove(center) |"); // тестируем удаление из середины

        System.out.printf("%20d", TestCollection.testRemoveCenter(arrayList, N));
        System.out.print("|");
        System.out.printf("%20d", TestCollection.testRemoveCenter(linkedList, N));
        System.out.println("|");
        System.out.println("|---------------|--------------------|--------------------|");

        System.out.print("|get            |"); // тестируем получение элемента с каждой позиции

        System.out.printf("%20d", TestCollection.testGet(arrayList, N));
        System.out.print("|");
        System.out.printf("%20d", TestCollection.testGet(linkedList, N));
        System.out.println("|");
        System.out.println("|---------------|--------------------|--------------------|");

        System.out.print("|clear          |"); // тестируем очистку от всех элементов

        System.out.printf("%20d", TestCollection.testClear(arrayList, N));
        System.out.print("|");
        System.out.printf("%20d", TestCollection.testClear(linkedList, N));
        System.out.println("|");
        System.out.println("|---------------|--------------------|--------------------|");
    }
}