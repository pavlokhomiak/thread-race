package main;

import lombok.Data;

@Data
public class Counter {
    private int count;

    public Counter(int count) {
        this.count = count;
    }

    public void increment() {
        count++;
    }
}
