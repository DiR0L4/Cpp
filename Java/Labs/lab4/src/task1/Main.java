package task1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>();
        students.add(new Student("Stas Smok", 4));
        students.add(new Student("Nikita Kot", 1));
        students.add(new Student("Dan Been", 3));
        students.add(new Student("Jan Lee", 3));

        LinkedList<Student> students2 = new LinkedList<>();
        students2.add(students.getFirst());
        students2.add(students.getLast());
        students2.add(new Student("Nastya Rane", 2));
        students2.add(new Student("Rock Lee", 2));
        students2.add(new Student("Kate Brah", 1));

        //Student.union(students, students2);
        //Student.intersect(students, students2);

        TreeSet<Student> set = new TreeSet<>();
        set.addAll(students2);
        set.addAll(students);
        Student.listInfo(set);
    }
}
