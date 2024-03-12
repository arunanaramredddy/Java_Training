package com.Streams;

import java.util.ArrayList;

public class StreamsDemo {
    public static void main(String[] args) {
        ArrayList<String> trainees = new ArrayList<>();
        trainees.add("John");
        trainees.add("Peter");
        trainees.add("Mary");
        trainees.add("Tom");
        trainees.add("Mark");
        trainees.forEach(System.out::println);
        trainees.stream().forEach( trainees->System.out::println);
    }
}
