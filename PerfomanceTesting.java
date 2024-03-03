import java.util.*;

public class PerfomanceTesting {
    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        Queue<Integer> arrayDeque = new ArrayDeque<>();
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        Map<Integer, Integer> hashMap = new HashMap<>();
        Map<Integer, Integer> treeMap = new TreeMap<>();
        Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();

        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            int randomValue = random.nextInt(100000);
            hashSet.add(randomValue);
            treeSet.add(randomValue);
            linkedHashSet.add(randomValue);
            arrayList.add(randomValue);
            linkedList.add(randomValue);
            arrayDeque.add(randomValue);
            priorityQueue.add(randomValue);
            hashMap.put(i, randomValue);
            treeMap.put(i, randomValue);
            linkedHashMap.put(i, randomValue);
        }

        MeasureAdd add_test = new MeasureAdd();

        long hashSet_addTime = add_test.measureAddOperation(hashSet);
        System.out.println("HashSet add       : " + hashSet_addTime + " nanoseconds");

        long treeSet_addTime = add_test.measureAddOperation(treeSet);
        System.out.println("TreeSet add       : " + treeSet_addTime + " nanoseconds");

        long linkedHashSet_addTime = add_test.measureAddOperation(linkedHashSet);
        System.out.println("LinkedHashSet add : " + linkedHashSet_addTime + " nanoseconds");

        long arrayList_addTime = add_test.measureAddOperation(arrayList);
        System.out.println("ArrayList add     : " + arrayList_addTime + " nanoseconds");

        long linkedList_addTime = add_test.measureAddOperation(linkedList);
        System.out.println("LinkedList add    : " + linkedList_addTime + " nanoseconds");

        long arrayDeque_addTime = add_test.measureAddOperation(arrayDeque);
        System.out.println("ArrayDeque add    : " + arrayDeque_addTime + " nanoseconds");

        long priorityQueue_addTime = add_test.measureAddOperation(priorityQueue);
        System.out.println("PriorityQueue add : " + priorityQueue_addTime + " nanoseconds");

        long hashMap_addTime = add_test.measureAddOperation(hashMap);
        System.out.println("HashMap add       : " + hashMap_addTime + " nanoseconds");

        long treeMap_addTime = add_test.measureAddOperation(treeMap);
        System.out.println("TreeMap add       : " + treeMap_addTime + " nanoseconds");

        long linkedHashMap_addTime = add_test.measureAddOperation(linkedHashMap);
        System.out.println("LinkedHashMap add : " + linkedHashMap_addTime + " nanoseconds");




        MeasureContains containsTest = new MeasureContains();

        long hashSet_containsTime = containsTest.measureContainOperation(hashSet);
        System.out.println("HashSet contains       : " + hashSet_containsTime + " nanoseconds");

        long treeSet_containsTime = containsTest.measureContainOperation(treeSet);
        System.out.println("TreeSet contains       : " + treeSet_containsTime + " nanoseconds");

        long linkedHashSet_containsTime = containsTest.measureContainOperation(linkedHashSet);
        System.out.println("LinkedHashSet contains : " + linkedHashSet_containsTime + " nanoseconds");

        long arrayList_containsTime = containsTest.measureContainOperation(arrayList);
        System.out.println("ArrayList contains     : " + arrayList_containsTime + " nanoseconds");

        long linkedList_containsTime = containsTest.measureContainOperation(linkedList);
        System.out.println("LinkedList contains    : " + linkedList_containsTime + " nanoseconds");

        long arrayDeque_containsTime = containsTest.measureContainOperation(arrayDeque);
        System.out.println("ArrayDeque contains    : " + arrayDeque_containsTime + " nanoseconds");

        long priorityQueue_containsTime = containsTest.measureContainOperation(priorityQueue);
        System.out.println("PriorityQueue contains : " + priorityQueue_containsTime + " nanoseconds");

        long hashMap_containsTime = containsTest.measureContainOperation(hashMap);
        System.out.println("HashMap contains       : " + hashMap_containsTime + " nanoseconds");

        long treeMap_containsTime = containsTest.measureContainOperation(treeMap);
        System.out.println("TreeMap contains       : " + treeMap_containsTime + " nanoseconds");

        long linkedHashMap_containsTime = containsTest.measureContainOperation(linkedHashMap);
        System.out.println("LinkedHashMap contains : " + linkedHashMap_containsTime + " nanoseconds");



        MeasureRemove removeTest = new MeasureRemove();

        long hashSet_removeTime = removeTest.measureRemoveOperation(hashSet);
        System.out.println("HashSet remove       : " + hashSet_removeTime + " nanoseconds");

        long treeSet_removeTime = removeTest.measureRemoveOperation(treeSet);
        System.out.println("TreeSet remove       : " + treeSet_removeTime + " nanoseconds");

        long linkedHashSet_removeTime = removeTest.measureRemoveOperation(linkedHashSet);
        System.out.println("LinkedHashSet remove : " + linkedHashSet_removeTime + " nanoseconds");

        long arrayList_removeTime = removeTest.measureRemoveOperation(arrayList);
        System.out.println("ArrayList remove     : " + arrayList_removeTime + " nanoseconds");

        long linkedList_removeTime = removeTest.measureRemoveOperation(linkedList);
        System.out.println("LinkedList remove    : " + linkedList_removeTime + " nanoseconds");

        long arrayDeque_removeTime = removeTest.measureRemoveOperation(arrayDeque);
        System.out.println("ArrayDeque remove    : " + arrayDeque_removeTime + " nanoseconds");

        long priorityQueue_removeTime = removeTest.measureRemoveOperation(priorityQueue);
        System.out.println("PriorityQueue remove : " + priorityQueue_removeTime + " nanoseconds");

        long hashMap_removeTime = removeTest.measureRemoveOperation(hashMap);
        System.out.println("HashMap remove       : " + hashMap_removeTime + " nanoseconds");

        long treeMap_removeTime = removeTest.measureRemoveOperation(treeMap);
        System.out.println("TreeMap remove       : " + treeMap_removeTime + " nanoseconds");

        long linkedHashMap_removeTime = removeTest.measureRemoveOperation(linkedHashMap);
        System.out.println("LinkedHashMap remove : " + linkedHashMap_removeTime + " nanoseconds");


        MeasureClear clearTest = new MeasureClear();

        long hashSet_clearTime = clearTest.measureClearOperation(hashSet);
        System.out.println("HashSet clear       : " + hashSet_clearTime + " nanoseconds");

        long treeSet_clearTime = clearTest.measureClearOperation(treeSet);
        System.out.println("TreeSet clear       : " + treeSet_clearTime + " nanoseconds");

        long linkedHashSet_clearTime = clearTest.measureClearOperation(linkedHashSet);
        System.out.println("LinkedHashSet clear : " + linkedHashSet_clearTime + " nanoseconds");

        long arrayList_clearTime = clearTest.measureClearOperation(arrayList);
        System.out.println("ArrayList clear     : " + arrayList_clearTime + " nanoseconds");

        long linkedList_clearTime = clearTest.measureClearOperation(linkedList);
        System.out.println("LinkedList clear    : " + linkedList_clearTime + " nanoseconds");

        long arrayDeque_clearTime = clearTest.measureClearOperation(arrayDeque);
        System.out.println("ArrayDeque clear    : " + arrayDeque_clearTime + " nanoseconds");

        long priorityQueue_clearTime = clearTest.measureClearOperation(priorityQueue);
        System.out.println("PriorityQueue clear : " + priorityQueue_clearTime + " nanoseconds");

        long hashMap_clearTime = clearTest.measureClearOperation(hashMap);
        System.out.println("HashMap clear       : " + hashMap_clearTime + " nanoseconds");

        long treeMap_clearTime = clearTest.measureClearOperation(treeMap);
        System.out.println("TreeMap clear       : " + treeMap_clearTime + " nanoseconds");

        long linkedHashMap_clearTime = clearTest.measureClearOperation(linkedHashMap);
        System.out.println("LinkedHashMap clear : " + linkedHashMap_clearTime + " nanoseconds");

    }
}
