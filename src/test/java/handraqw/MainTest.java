package handraqw;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;
//import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @ParameterizedTest
    @MethodSource("testSelectionSortData")
    void testSort(int N) {
        int[] arr = new int[N];
        //Random random = new Random(7777);
        for (int i = 0; i < N; i++) {
            arr[i] = N - i + 1;
            //arr[i] = random.nextInt(100);
        }

        long start = System.nanoTime();
        Main.selectionSort(arr);
        System.out.println(System.nanoTime() - start);

        for (int i = 0; i < arr.length - 1; i++) {
            assertTrue(arr[i] <= arr[i + 1]);
        }
    }

    static Stream<Arguments> testSelectionSortData() {
        return Stream.of(
                Arguments.of(10), Arguments.of(100), Arguments.of(1000),
                Arguments.of(2000), Arguments.of(4000), Arguments.of(8000),
                Arguments.of(16000), Arguments.of(32000), Arguments.of(64000),
                Arguments.of(128000)
        );
    }
}




//package handraqw;
//
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.Arguments;
//import org.junit.jupiter.params.provider.MethodSource;
//
//import java.util.Arrays;
//import java.util.Random;
//import java.util.stream.Stream;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class MainTest {
//
//
//    @ParameterizedTest
//    @MethodSource("testSelectionSortData")
//    void testArraysSort(int N) {
//        int[] arr = new int[N];
//        for (int i = 0; i < N; i++) {
//            arr[i] = N - i + 1;
//        }
//
//        long start = System.nanoTime();
//        Arrays.sort(arr);
//        System.out.println(System.nanoTime() - start);
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            assertTrue(arr[i] <= arr[i + 1]);
//        }
//    }
//
//    static Stream<Arguments> testSelectionSortData() {
//        return Stream.of(
//                Arguments.of(10), Arguments.of(100), Arguments.of(1000),
//                Arguments.of(2000), Arguments.of(4000), Arguments.of(8000),
//                Arguments.of(16000), Arguments.of(32000), Arguments.of(64000),
//                Arguments.of(128000)
//        );
//    }
//}
