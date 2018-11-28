package com.study.jdk18;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-10-11 18:22
 */
public class ConsumerDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("sunjie");
        student.setScore(95);
        Student stu = new Student();
        stu.setName("sj");
        stu.setScore(59);
        System.out.println(getFree(student, student1 -> student1.getScore() > 90, student1 -> student.setFree(100)).toString());
        System.out.println(getFree(stu, stu1 -> stu1.getScore() < 60, stu1 -> stu.setFree(0)).getFree());


        Student stu1 = new Student("s1", 90);
        Student stu2 = new Student("s2", 80);
        Student stu3 = new Student("s3", 70);
        List<Student> students = new ArrayList<Student>() {{
            add(stu);
            add(student);
            add(stu1);
            add(stu2);
            add(stu3);
        }};
        List<Student> retVal = students.stream().filter(s -> s.getScore() > 80).collect(Collectors.toList());
        System.out.println(retVal);
    }

    public static Student getFree(Student student, Predicate<Student> studentPredicate, Consumer<Student> consumer) {
        if (studentPredicate.test(student)) {
            consumer.accept(student);
        }
        return student;
    }

}
