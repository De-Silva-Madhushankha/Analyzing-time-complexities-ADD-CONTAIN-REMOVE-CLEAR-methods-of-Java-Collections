import java.util.*;
public class MeasureAdd {
    //Sets
    public long measureAddOperation(Set<Integer> set) {
        long startTime, endTime, totalTime = 0;
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            Integer elementToAdd = random.nextInt(100000);

            startTime = System.nanoTime();
            set.add(elementToAdd);
            endTime = System.nanoTime();
            totalTime += (endTime - startTime);

            set.remove(elementToAdd);
        }
        return (totalTime /100);
    }
    //List
    public long measureAddOperation(List<Integer> list) {
        long startTime, endTime, totalTime = 0;
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            Integer elementToAdd = random.nextInt(100000);
            Integer index = random.nextInt(100000);

            startTime = System.nanoTime();
            list.add(index,elementToAdd);
            endTime = System.nanoTime();
            totalTime += (endTime - startTime);

            list.remove(elementToAdd);
        }
        return (totalTime /100);
    }
    //Queue
    public long measureAddOperation(Queue<Integer> queue) {
        long startTime, endTime, totalTime = 0;
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            Integer elementToAdd = random.nextInt(100000);

            startTime = System.nanoTime();
            queue.add(elementToAdd);
            endTime = System.nanoTime();
            totalTime += (endTime - startTime);

            queue.remove(elementToAdd);
        }
        return (totalTime /100);
    }
    //Map
    public long measureAddOperation(Map<Integer,Integer> map) {
        long startTime, endTime, totalTime = 0;
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            Integer elementToAdd = random.nextInt(100000);
            Integer index = random.nextInt(100000);

            startTime = System.nanoTime();
            map.put(index,elementToAdd);
            endTime = System.nanoTime();
            totalTime += (endTime - startTime);

            map.remove(elementToAdd);
        }
        return (totalTime /100);
    }
}


