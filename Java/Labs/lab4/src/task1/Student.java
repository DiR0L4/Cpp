package task1;

import java.util.*;

public class Student implements Comparable<Student> {
    private String name;
    private int course;

    public Student()
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = inp.nextLine();
        System.out.println("Enter group: ");
        System.out.println("Enter course");
        course = inp.nextInt();
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public int compareTo(Student anotherStudent) {
        int anotherStudentCourse = anotherStudent.getCourse();
        return this.course - anotherStudentCourse;
    }

    public static void listInfo(Collection<Student> students)
    {
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next().toString());
        }
    }

    public static void printStudents(LinkedList<Student> students, int course)
    {
        ListIterator<Student> iterator = students.listIterator();
        while(iterator.hasNext()) {
            Student buff = iterator.next();
            if (buff.course == course) {
                System.out.println(buff.name);
            }
        }
    }
    public static void union(LinkedList s1, LinkedList s2)
    {
        LinkedList<Student> rez = new LinkedList<>();
        rez.addAll(0, s1);
        rez.addAll(0, s2);
        Student.listInfo(rez);
    }

    public static void intersect(LinkedList s1, LinkedList s2)
    {
        LinkedList<Student> rez = new LinkedList<>();
        rez.addAll(0, s1);
        rez.retainAll(s2);
        Student.listInfo(rez);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

}
