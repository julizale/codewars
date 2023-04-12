package org.codewars.other;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Calculations {

    public List<Integer> sort(List<Integer> list){
        for (int n = list.size()-1; n > 0; n--) {
            for (int i = 0; i < n; i++) {
                if (list.get(i) > list.get(i+1)) {
                    Integer next = list.get(i+1);
                    list.set(i+1, list.get(i));
                    list.set(i, next);
                }
            }
        }
        return list;
    }

    private double calculateAverage(Grades grades) {
        List<Integer> allGrades = new ArrayList<>();
        allGrades.addAll(grades.getEnglish());
        allGrades.addAll(grades.getMaths());
        allGrades.addAll(grades.getPhysics());
        if (allGrades.size() == 0) {
            return 0;
        }
        double sum = 0;
        for (Integer grade : allGrades) {
            sum += grade;
        }
        return sum / allGrades.size();
    }

    public double calculateBestAverage(Map<Student, Grades> scores) {
        double bestAverage = 0;
        for (Map.Entry<Student, Grades> entry : scores.entrySet()) {
            double average = calculateAverage(entry.getValue());
            if (average > bestAverage) {
                bestAverage = average;
            }
        }
        return bestAverage;
    }

    public List<String> findStudentsNamesWithBestAverage(Map<Student, Grades> scores) {
        List<String> studentsNamesWithBestAverage = new ArrayList<>();
        double bestAverage = calculateBestAverage(scores);
        for (Map.Entry<Student, Grades> entry : scores.entrySet()) {
            double average = calculateAverage(entry.getValue());
            if (average == bestAverage) {
                String studentName = entry.getKey().getFirstName() + " " + entry.getKey().getLastName();
                studentsNamesWithBestAverage.add(studentName);
            }
        }
        return studentsNamesWithBestAverage;
    }

    public List<Student> findStudentsWhichSpeakPolishWithAverageFromMathAbove4(Map<Student, Grades> scores) {
        List<Student> students = new ArrayList<>();
        for (Map.Entry<Student, Grades> entry : scores.entrySet()) {
            Student student = entry.getKey();
            if (student.getLanguage() != null && student.getLanguage().equals("Polish") &&
                    averageFromIntList(entry.getValue().getMaths()) > 4.0) {
                students.add(student);
            }
        }
        return students;
    }

    private double averageFromIntList(List<Integer> list) {
        if (list.size() == 0) {
            return 0;
        }
        double sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        return sum / list.size();
    }

}



