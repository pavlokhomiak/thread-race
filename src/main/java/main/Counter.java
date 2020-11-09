package main;

import lombok.Data;

@Data
public class Counter {
    private final int maxInt = 100;
    private int count;

    public Counter(int count) {
        this.count = count;
    }

    public void increment() {
        count++;
    }
}
