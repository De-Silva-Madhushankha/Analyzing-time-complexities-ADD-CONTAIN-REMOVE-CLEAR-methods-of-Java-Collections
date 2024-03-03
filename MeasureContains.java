import java.util.*;

public class MeasureContains {

    public long measureContainOperation(Set<Integer> set) {
        long startTime, endTime, totalTime = 0;
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            Integer value = random.nextInt(100000);

            startTime = System.nanoTime();
            set.contains(value);
            endTime = System.nanoTime();
            totalTime += (endTime - startTime);

        }
        return (totalTime /100);
    }
    //List
    public long measureContainOperation(List<Integer> list) {
        long startTime, endTime, totalTime = 0;
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            Integer value = random.nextInt(10000);

            startTime = System.nanoTime();
            list.contains(value);
            endTime = System.nanoTime();
            totalTime += (endTime - startTime);

        }
        return (totalTime /100);
    }
    //Queue
    public long measureContainOperation(Queue<Integer> queue) {
        long startTime, endTime, totalTime = 0;
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            Integer value = random.nextInt(100000);

            startTime = System.nanoTime();
            queue.contains(value);
            endTime = System.nanoTime();
            totalTime += (endTime - startTime);

        }
        return (totalTime /100);
    }
    //Map
    public long measureContainOperation(Map<Integer,Integer> map) {
        long startTime, endTime, totalTime = 0;
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            Integer value = random.nextInt(100000);
            startTime = System.nanoTime();
            map.containsValue(value);
            endTime = System.nanoTime();
            totalTime += (endTime - startTime);
        }
        return (totalTime /100);
    }
}
