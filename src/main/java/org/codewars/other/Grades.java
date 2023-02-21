package org.codewars.other;

import java.util.List;

public class Grades {

    private List<Integer> maths;
    private List<Integer> physics;
    private List<Integer> english;

    public Grades(List<Integer> maths, List<Integer> physics, List<Integer> english) {
        this.maths = maths;
        this.physics = physics;
        this.english = english;
    }

    public List<Integer> getMaths() {
        return maths;
    }

    public List<Integer> getPhysics() {
        return physics;
    }

    public List<Integer> getEnglish() {
        return english;
    }
}
