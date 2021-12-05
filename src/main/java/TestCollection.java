import java.util.Collection;
import java.util.List;

public class TestCollection {

    private TestCollection(){}

    /**
     * измеряет время выполнения n операций добавления
     *
     * @param testList коллекция для теста
     * @param n        количесво необходимых элементов
     * @return время выполнения
     */
    public static long testAdd(List<Integer> testList, int n) {
        long start = System.nanoTime();
        for (int i = 0; i < n; i++)
            testList.add(i);
        return System.nanoTime() - start;
    }

    /*
    операция удаления и получения будут давать различные результаты в LinkedList, в зависимости от положения элемента.
    Самые быстрые из начала и с конца и самые долгие из середины списка.
    По этой причине, для более точного сравнения, выполняются три теста.
    Похожая ситуация и в ArrayList
     */

    /**
     * измеряет время n операций удаления с первой позиции
     *
     * @param testList коллекция для теста
     * @param n        количесво необходимых элементов
     * @return время выполнения
     */
    public static long testRemoveFirst(List<Integer> testList, int n) {
        addTo(n, testList);
        long start = System.nanoTime();
        for (int i = 0; i < n; i++)
            testList.remove(0);
        return System.nanoTime() - start;
    }

    /**
     * измеряет время n операций удаления с последней позиции
     *
     * @param testList коллекция для теста
     * @param n        количесво необходимых элементов
     * @return время выполнения
     */
    public static long testRemoveLast(List<Integer> testList, int n) {
        addTo(n, testList);
        long start = System.nanoTime();
        for (int i = n - 1; i >= 0; i--)
            testList.remove(i);
        return System.nanoTime() - start;
    }

    /**
     * измеряет время n операций удаления из середины
     *
     * @param testList коллекция для теста
     * @param n        количесво необходимых элементов
     * @return время выполнения
     */
    public static long testRemoveCenter(List<Integer> testList, int n) {
        addTo(n, testList);
        long start = System.nanoTime();
        int halfN = n / 2;
        for (int i = 0; i < n; i++)
            testList.remove(halfN - i / 2 - 1);
        return System.nanoTime() - start;
    }

    /**
     * измеряем время получения со всех n позиций
     *
     * @param testList коллекция для теста
     * @param n        количесво необходимых элементов
     * @return время выполнения
     */
    public static long testGet(List<Integer> testList, int n) {
        addTo(n, testList);
        long start = System.nanoTime();
        for (int i = 0; i < n; i++)
            testList.get(i);
        return System.nanoTime() - start;
    }

    /**
     * измеряет время n операций получения с первой позиции
     *
     * @param testList коллекция для теста
     * @param n        количесво необходимых элементов
     * @return время выполнения
     */
    public static long testGetFirst(List<Integer> testList, int n) {
        addTo(n, testList);
        long start = System.nanoTime();
        for (int i = 0; i < n; i++)
            testList.get(0);
        return System.nanoTime() - start;
    }

    /**
     * измеряет время n операций получения с последней позиции
     *
     * @param testList коллекция для теста
     * @param n        количесво необходимых элементов
     * @return время выполнения
     */
    public static long testGetLast(List<Integer> testList, int n) {
        addTo(n, testList);
        long start = System.nanoTime();
        for (int i = n - 1; i >= 0; i--)
            testList.get(n-1);
        return System.nanoTime() - start;
    }

    /**
     * измеряет время n операций получения из середины
     *
     * @param testList коллекция для теста
     * @param n        количесво необходимых элементов
     * @return время выполнения
     */
    public static long testGetCenter(List<Integer> testList, int n) {
        addTo(n, testList);
        long start = System.nanoTime();
        int halfN = n / 2;
        for (int i = 0; i < n; i++)
            testList.get(halfN);
        return System.nanoTime() - start;
    }

    /**
     * измеряем время очистки
     *
     * @param testList коллекция для теста
     * @param n        количесво необходимых элементов
     * @return время выполнения
     */
    public static long testClear(List<Integer> testList, int n) {
        addTo(n, testList);
        long start = System.nanoTime();
        testList.clear();
        return System.nanoTime() - start;
    }

    /**
     * дополняет элементы ДО необходимого количества
     *
     * @param count  необходимое количество
     * @param addCol коллекция для добавления
     */
    private static void addTo(int count, Collection<Integer> addCol) {
        for (int i = addCol.size(); i < count; i++)
            addCol.add(i);
    }
}