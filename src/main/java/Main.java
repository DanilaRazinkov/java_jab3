import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        int N = 20000;
        System.out.println("|Function       |ArrayList           |LinkedList          | \n" +
                "|---------------|--------------------|--------------------|");

        System.out.print("|add            |"); // тестируем функцию добавления
        System.out.println(printResult(TestCollection.testAdd(arrayList, N), TestCollection.testAdd(linkedList, N)));

        System.out.print("|remove(first)  |"); //тестируем удаления первого элемента
        System.out.println(printResult(TestCollection.testRemoveFirst(arrayList, N), TestCollection.testRemoveFirst(linkedList, N)));

        System.out.print("|remove(last)   |"); // тестируем удаление последнего элемента
        System.out.println(printResult(TestCollection.testRemoveLast(arrayList, N), TestCollection.testRemoveLast(linkedList, N)));

        System.out.print("|remove(center) |"); // тестируем удаление из середины
        System.out.println(printResult(TestCollection.testRemoveCenter(arrayList, N), TestCollection.testRemoveCenter(linkedList, N)));

        System.out.print("|get            |"); // тестируем получение элемента с каждой позиции
        System.out.println(printResult(TestCollection.testGet(arrayList, N), TestCollection.testGet(linkedList, N)));

        System.out.print("|get(first)     |"); //тестируем получение первого элемента
        System.out.println(printResult(TestCollection.testGetFirst(arrayList, N), TestCollection.testGetFirst(linkedList, N)));

        System.out.print("|get(last)      |"); // тестируем получение последнего элемента
        System.out.println(printResult(TestCollection.testGetLast(arrayList, N), TestCollection.testGetLast(linkedList, N)));

        System.out.print("|get(center)    |"); // тестируем получение из середины
        System.out.println(printResult(TestCollection.testGetCenter(arrayList, N), TestCollection.testGetCenter(linkedList, N)));


        System.out.print("|clear          |"); // тестируем очистку от всех элементов
        System.out.println(printResult(TestCollection.testClear(arrayList, N), TestCollection.testClear(linkedList, N)));
    }

    private static String printResult(long res1, long res2) {
        return String.format("%20d|%20d|\n|---------------|--------------------|--------------------|", res1, res2);
    }
}