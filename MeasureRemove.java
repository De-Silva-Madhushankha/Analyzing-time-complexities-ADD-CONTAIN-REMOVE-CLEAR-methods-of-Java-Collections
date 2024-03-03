import java.util.*;

public class MeasureRemove {
    // Set
    public long measureRemoveOperation(Set<Integer> set) {
        long startTime, endTime, totalTime = 0;
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            Integer elementToRemove = random.nextInt(100000);

            startTime = System.nanoTime();
            set.remove(elementToRemove);
            endTime = System.nanoTime();
            totalTime += (endTime - startTime);

            if(set.size() != 100000){
                Integer elementToAdd = random.nextInt(100000);
                set.add(elementToAdd);
            }

        }
        return (totalTime / 100);
    }

    // List
    public long measureRemoveOperation(List<Integer> list) {
        long startTime, endTime, totalTime = 0;
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            Integer elementToRemove = random.nextInt(100000);

            startTime = System.nanoTime();
            list.remove(elementToRemove); // Remove by value
            endTime = System.nanoTime();
            totalTime += (endTime - startTime);

            if(list.size() != 100000) {
                Integer elementToAdd = random.nextInt(100000);
                list.add(elementToAdd);
            }

        }
        return (totalTime / 100);
    }

    // Queue
    public long measureRemoveOperation(Queue<Integer> queue) {
        long startTime, endTime, totalTime = 0;
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            startTime = System.nanoTime();
            queue.remove(); // Remove from the head of the queue
            endTime = System.nanoTime();
            totalTime += (endTime - startTime);

            Integer elementToAdd = random.nextInt(100000);
            queue.add(elementToAdd);

        }
        return (totalTime / 100);
    }

    // Map
    public long measureRemoveOperation(Map<Integer, Integer> map) {
        long startTime, endTime, totalTime = 0;
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            Integer index = random.nextInt(100000);
            Integer element = random.nextInt(100000);

            startTime = System.nanoTime();
            map.remove(element); // Remove by value
            endTime = System.nanoTime();
            totalTime += (endTime - startTime);

            if(!map.containsValue(element)){
                map.put(index,element);
            }
        }
        return (totalTime / 100);
    }

}
