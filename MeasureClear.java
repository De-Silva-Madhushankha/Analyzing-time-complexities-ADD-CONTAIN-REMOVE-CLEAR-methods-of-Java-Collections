
import java.util.*;
public class MeasureClear {
    // Sets
    public long measureClearOperation(Set<Integer> set) {
        long startTime, endTime, totalTime = 0;
        Random random = new Random();

        for (int i = 0; i < 100; i++) {

            startTime = System.nanoTime();
            set.clear();
            endTime = System.nanoTime();
            totalTime += (endTime - startTime);

            for (int j = 0; j < 100000; j++) {
                set.add(random.nextInt(100000));
            }
        }
        return (totalTime / 100);
    }

    // Lists
    public long measureClearOperation(List<Integer> list) {
        long startTime, endTime, totalTime = 0;
        Random random = new Random();

        for (int i = 0; i < 100; i++) {

            startTime = System.nanoTime();
            list.clear();
            endTime = System.nanoTime();
            totalTime += (endTime - startTime);

            for (int j = 0; j < 100000; j++) {
                list.add(random.nextInt(100000));
            }
        }
        return (totalTime / 100);
    }

    // Maps
    public long measureClearOperation(Map<Integer, Integer> map) {
        long startTime, endTime, totalTime = 0;
        Random random = new Random();

        for (int i = 0; i < 100; i++) {

            startTime = System.nanoTime();
            map.clear();
            endTime = System.nanoTime();
            totalTime += (endTime - startTime);

            for (int j = 0; j < 100000; j++) {
                map.put(random.nextInt(100000), random.nextInt(100000));
            }
        }
        return (totalTime / 100);
    }

    public long measureClearOperation(Queue<Integer> queue) {
        long startTime, endTime, totalTime = 0;
        Random random = new Random();

        for (int i = 0; i<100; i++){
            startTime = System.nanoTime();
            queue.clear();
            endTime = System.nanoTime();
            totalTime += (endTime- startTime);

            for(int j = 0 ; j < 100000; j++){
                queue.add(random.nextInt(100000));
            }
        }
        return (totalTime/100);
    }
}


