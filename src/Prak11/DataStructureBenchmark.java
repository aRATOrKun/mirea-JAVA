package Prak11;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class DataStructureBenchmark
{

    public static void main(String[] args)
    {
        int n = 100000;
        int k = 1000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < n; i++)
        {
            arrayList.add(i);
            linkedList.add(i);
        }

        // Тесты вставки значения в начало списка
        long startTime = System.nanoTime();
        for (int i = 0; i < k; i++)
            arrayList.add(0, n + i);
        long arrayListInsertTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < k; i++)
            linkedList.add(n + i);
        long linkedListInsertTime = System.nanoTime() - startTime;

        // Тесты удаления значения из середины списка
        startTime = System.nanoTime();
        for (int i = 0; i < k; i++)
            arrayList.remove(n / 2);
        long arrayListRemoveTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < k; i++)
            linkedList.remove(n / 2);
        long linkedListRemoveTime = System.nanoTime() - startTime;

        // Тесты добавления значения в конец списка
        startTime = System.nanoTime();
        for (int i = 0; i < k; i++)
            arrayList.add(n + i);
        long arrayListAddTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < k; i++)
            linkedList.add(n + i);
        long linkedListAddTime = System.nanoTime() - startTime;

        // Тесты поиска значения в списке
        int searchValue = n / 2;
        startTime = System.nanoTime();
        for (int i = 0; i < k; i++)
            arrayList.indexOf(searchValue);
        long arrayListSearchTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < k; i++)
            linkedList.indexOf(searchValue);
        long linkedListSearchTime = System.nanoTime() - startTime;

        System.out.println("ArrayList Insert Time: " + TimeUnit.NANOSECONDS.toMillis(arrayListInsertTime));
        System.out.println("LinkedList Insert Time: " + TimeUnit.NANOSECONDS.toMillis(linkedListInsertTime));
        System.out.println("ArrayList Remove Time: " + TimeUnit.NANOSECONDS.toMillis(arrayListRemoveTime));
        System.out.println("LinkedList Remove Time: " + TimeUnit.NANOSECONDS.toMillis(linkedListRemoveTime));
        System.out.println("ArrayList Add Time: " + TimeUnit.NANOSECONDS.toMillis(arrayListAddTime));
        System.out.println("LinkedList Add Time: " + TimeUnit.NANOSECONDS.toMillis(linkedListAddTime));
        System.out.println("ArrayList Search Time: " + TimeUnit.NANOSECONDS.toMillis(arrayListSearchTime));
        System.out.println("LinkedList Search Time: " + TimeUnit.NANOSECONDS.toMillis(linkedListSearchTime));
    }
}
