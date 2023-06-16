package streams;

import streams.HandlingConsumer;

import java.util.*;
import java.util.List;

public class CheckedExceptionsInStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 4, 3, 2, 1);
        list.forEach(HandlingConsumer.handlingConsumerBuilder(i->Thread.sleep(i)));
    }

    public static void sleeper() {
        List<Integer> list = Arrays.asList(5, 4, 3, 2, 1);
         //list.forEach(i -> Thread.sleep(i));
    }

    /**
     * Added throws to the method level
     * @throws InterruptedException
     */
    public static void sleeper2() throws InterruptedException {
        List<Integer> list = Arrays.asList(5, 4, 3, 2, 1);
      // list.forEach(Thread::sleep);
    }

    /**
     * Using try/catch blocks
     */
    public static void sleeper3() {
        List<Integer> list = Arrays.asList(5, 4, 3, 2, 1);
        list.forEach(millis -> {
            try {
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }

}
