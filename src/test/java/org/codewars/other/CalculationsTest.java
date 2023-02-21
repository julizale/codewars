package org.codewars.other;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CalculationsTest {

    @Test
    void findStudentsWhichSpeakPolishWithAverageFromMathAbove4() {
        //Given

        //When

        //Then

    }

    @Test
    void testFindStudentsNamesWithBestAverage() {
        //Given
        List<Integer> maths1 = new ArrayList<>(List.of(4, 4, 4));
        List<Integer> physics1 = new ArrayList<>(List.of(3, 4, 2));
        List<Integer> maths2 = new ArrayList<>(List.of(3, 5, 3));
        List<Integer> physics2 = new ArrayList<>(List.of(5, 2));
        List<Integer> english2 = new ArrayList<>(List.of(3, 3));
        List<Integer> english3 = new ArrayList<>(List.of(3, 4));

        Student studentA = new Student("Jakub", "Woziwoda", null);
        Student studentB = new Student("Halina", "Malina", "Polish");
        Student studentC = new Student("Lucyna", "Wozniak", "Spanish");

        Map<Student, Grades> studentGradesMap = new HashMap<>();
        studentGradesMap.put(studentA, new Grades(maths1, physics1, new ArrayList<>()));
        studentGradesMap.put(studentB, new Grades(maths2, physics2, english2));
        studentGradesMap.put(studentC, new Grades(new ArrayList<>(), new ArrayList<>(), english3));

        Calculations calculations = new Calculations();
        //When
        List<String> result = calculations.findStudentsNamesWithBestAverage(studentGradesMap);

        //Then
        assertEquals(2, result.size());
        assertTrue(result.contains("Lucyna Wozniak"));
        assertTrue(result.contains("Jakub Woziwoda"));
    }

    @Test
    void testCalculateBestAverage() {
        //Given
        List<Integer> maths1 = new ArrayList<>(List.of(4, 4, 4));
        List<Integer> physics1 = new ArrayList<>(List.of(3, 4, 2));
        List<Integer> maths2 = new ArrayList<>(List.of(3, 5, 3));
        List<Integer> physics2 = new ArrayList<>(List.of(5, 2));
        List<Integer> english = new ArrayList<>(List.of(3, 3));

        Student studentA = new Student("Jakub", "Woziwoda", null);
        Student studentB = new Student("Halina", "Malina", "Polish");

        Map<Student, Grades> studentGradesMap = new HashMap<>();
        studentGradesMap.put(studentA, new Grades(maths1, physics1, new ArrayList<>()));
        studentGradesMap.put(studentB, new Grades(maths2, physics2, english));

        Calculations calculations = new Calculations();

        //When
        double result = calculations.calculateBestAverage(studentGradesMap);
        //Then
        assertEquals(3.5 , result);
    }

    @Test
    void testCalculateBestAverageWhenMapIsEmpty() {
        //Given
        Map<Student, Grades> studentGradesMap = new HashMap<>();
        Calculations calculations = new Calculations();

        //When
        double result = calculations.calculateBestAverage(studentGradesMap);
        //Then
        assertEquals(0 , result);
    }

    @Test
    void testCalculateBestAverageWhenListsAreEmpty() {
        //Given

        //When

        //Then

    }

    @Test
    void testFindStudentsWhichSpeakPolishWithAverageFromMathAbove4EmptyLists() {
        //Given
        List<Integer> maths1 = new ArrayList<>(List.of(4, 5, 4));
        List<Integer> physics1 = new ArrayList<>(List.of(3, 4, 2));
        List<Integer> maths2 = new ArrayList<>(List.of(3, 5, 5));
        List<Integer> physics2 = new ArrayList<>(List.of(5, 2));
        List<Integer> english2 = new ArrayList<>(List.of(3, 3));
        List<Integer> english3 = new ArrayList<>(List.of(3, 4));
        List<Integer> maths3 = new ArrayList<>(List.of(4));

        Student studentA = new Student("Jakub", "Woziwoda");
        Student studentB = new Student("Halina", "Malina", "Polish");
        Student studentC = new Student("Lucyna", "Wozniak", "Polish");

        Map<Student, Grades> studentGradesMap = new HashMap<>();
        studentGradesMap.put(studentA, new Grades(maths1, physics1, new ArrayList<>()));
        studentGradesMap.put(studentB, new Grades(maths2, physics2, english2));
        studentGradesMap.put(studentC, new Grades(maths3, new ArrayList<>(), english3));
        Calculations calculations = new Calculations();

        //When
        List<Student> result = calculations.findStudentsWhichSpeakPolishWithAverageFromMathAbove4(studentGradesMap);

        //Then
        assertEquals(1, result.size());
        assertEquals("Halina", result.get(0).getFirstName());
    }

    @Test
    void testFindStudentsNamesWithBestAverageWhenListsAreEmpty() {
        //Given

        //When

        //Then

    }

    @Test
    void testFindStudentsWhichSpeakPolishWithAverageFromMathAbove4EmptyMath() {
        //Given

        //When

        //Then

    }

    @Test
    void testFindStudentsNamesWithBestAverageWhenMapIsEmpty() {
        //Given

        //When

        //Then

    }

    @Test
    void testFindStudentsWhichSpeakPolishWithAverageFromMathAbove4EmptyMap() {
        //Given

        //When

        //Then

    }

}