package com.zoo;

import java.util.*;
import java.util.stream.*;

public class StreamTest {

    public static void main(String[] args) {

//        // array stream
//        String[] arr = new String[]{"a","b","c"};
//        Stream<String> stream = Arrays.stream(arr);
//        Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
//
//        stream.forEach(System.out::println);
//        streamOfArrayPart.forEach(System.out::println);
//
//        // collection stream
//        List<String> list = Arrays.asList("aa", "bb", "cc");
//        Stream<String> lstream = list.stream();
//        Stream<String> lpstream = list.parallelStream();
//
//        lstream.forEach(System.out::println);
//        lpstream.forEach(System.out::println);
//
//        // stream.builder
//        Stream<String> builderStream =
//                Stream.<String>builder()
//                    .add("Eric").add("Elena").add("Java")
//                    .build();
//        builderStream.forEach(System.out::println);
//
//        Stream<String> generatedStream =
//                Stream.generate(() -> "gen").limit(10);
//
//        generatedStream.forEach(System.out::println);
//
//        Stream<Integer> iteratedStream =
//                Stream.iterate(30, n -> n + 2).limit(5);
//
//        iteratedStream.forEach(System.out::println);
//
//        IntStream intStream = IntStream.range(1,5);
//        LongStream longStream = LongStream.rangeClosed(1,5);
//
//        intStream.forEach(System.out::println);
//        longStream.forEach(System.out::println);
//
//        DoubleStream dStream = new java.util.Random().doubles(3);
//        dStream.forEach(System.out::println);
//
//        Stream<String> stream1 = Stream.of("Java", "Scala", "Groovy");
//        Stream<String> stream2 = Stream.of("Python", "Go", "Swift");
//        Stream<String> stream3 = Stream.concat(stream1, stream2);
//        stream3.forEach(s -> System.out.print(s + " "));

//
//        List<String> names = Arrays.asList("Eric", "Elena", "Java");
//
//        Stream<String> stream =
//                names.stream()
//                    .filter(name -> name.contains("a"));
//        stream.forEach(s -> System.out.print(s + " "));
//
//        // mapping
//        // map은 스트림 내 요소들을 하나씩 특정 값으로 변환해줌.
//        // 이 때 값을 변환하기 위한 람다를 인자로 받음
//        Stream<String> upperStream =
//                names.stream()
//                    .map(String::toUpperCase);
//        upperStream.forEach(s -> System.out.print(s + " "));
//        System.out.println(names.toString());

        // flatmap
        List<List<String>> list =
                Arrays.asList(Arrays.asList("a"), Arrays.asList("b"));
        System.out.println(list.toString());


        List<String> flatList =
                list.stream()
                    .flatMap(Collection::stream)
                    .collect(Collectors.toList());

        System.out.println(flatList.toString());

        StreamTest st = new StreamTest();
        st.run();



    }

    class Student {
        private int kor;
        private int eng;
        private int math;

        public Student(int kor, int eng, int math) {
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }

        public int getKor() {
            return this.kor;
        }

        public int getEng() {
            return this.eng;
        }

        public int getMath() {
            return this.math;
        }
    }

    public void run() {
//        Student s1 = new Student(10, 20, 30);
//        Student s2 = new Student(76, 15, 48);
//        Student s3 = new Student(34, 82, 51);
//
//        List<Student> list = Arrays.asList(s1, s2, s3);
//        list.stream()
//                .flatMapToInt(student ->
//                        IntStream.of(student.getKor(),
//                                student.getEng(),
//                                student.getMath()))
//                .forEach(System.out::println);

//                .average()
//                .ifPresent(avg -> System.out.println(Math.round(avg * 10) / 10.0));

        List<Integer> list = IntStream.of(14, 11, 20, 39, 23)
                .sorted()
                .boxed()
                .collect(Collectors.toList());
        System.out.println(list.toString());


        List<String> lang =
                Arrays.asList("Java", "Scala", "Groovy", "Python", "Go", "Swift");

        lang.stream().sorted().forEach(s -> System.out.print(s + " "));
        System.out.println(" ");
        lang.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.print(s + " "));
        System.out.println(" ");
        lang.stream().sorted(Comparator.comparingInt(String::length)).forEach(s -> System.out.print(s + " "));
        System.out.println(" ");
        lang.stream().sorted((s1, s2) -> s2.length() - s1.length()).forEach(s -> System.out.print(s + " "));

        int sum = IntStream.of(1,3,5,7,9)
                .peek(System.out::println)
                .sum();
        System.out.println("sum : " + sum);

        long count = IntStream.of(1, 3, 5, 7, 9).count();
        long summ = LongStream.of(1, 3, 5, 7, 9).sum();
        System.out.println(count + " " + summ);

        OptionalInt minn = IntStream.of(1, 3, 5, 7, 9).min();
        OptionalInt maxx = IntStream.of(1, 3, 5, 7, 9).max();
        minn.ifPresent(System.out::print);
        maxx.ifPresent(System.out::print);

    }
}
