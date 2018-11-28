package com.study.jdk18;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-10-11 18:21
 */
public class Student {
    private String name;
    private Integer score;
    private Integer free;

    public String getName() {
        return name;
    }

    public Student() {
    }

    public Student(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getFree() {
        return free;
    }

    public void setFree(Integer free) {
        this.free = free;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", free=" + free +
                '}';
    }
}
