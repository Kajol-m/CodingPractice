import java.io.*;
import java.util.*;

class Student {
    int ID;
    String FName;
    float CGPA;

    public Student(int id, String fname, float cgpa) {
        this.ID = id;
        this.FName = fname;
        this.CGPA = cgpa;
    }

    public int getID() {
        return ID;
    }

    public String getFName() {
        return FName;
    }

    public float getCGPA() {
        return CGPA;
    }
}

public class Solution implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getCGPA() == s2.getCGPA()) {
            if (s1.getFName().equals(s2.getFName())) {
                return Integer.compare(s1.getID(), s2.getID());
            } else {
                return s1.getFName().compareTo(s2.getFName());
            }
        } else {
            return Float.compare(s2.getCGPA(), s1.getCGPA()); // Decreasing order
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String fname = sc.next();
            float cgpa = sc.nextFloat();
            students.add(new Student(id, fname, cgpa));
        }

        Collections.sort(students, new Solution());
        for (Student s : students) {
            System.out.println(s.getFName());
        }
    }
}
