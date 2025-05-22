package com.learning.examples;

import lombok.SneakyThrows;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import static org.testng.Assert.assertEquals;

public class SynchronizedExample {
    private int sum = 0;

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public synchronized void calculate() {
        setSum(getSum() + 1);
    }

    @SneakyThrows
    @Test
    public void givenMultiThread_whenNonSyncMethod() {
        ExecutorService service = Executors.newFixedThreadPool(3);
        SynchronizedExample summation = new SynchronizedExample();
        IntStream.range(0, 1000)
                .forEach(count -> service.submit(summation::calculate));
        service.awaitTermination(1000, TimeUnit.MILLISECONDS);

        assertEquals(1000, summation.getSum());
    }

}
