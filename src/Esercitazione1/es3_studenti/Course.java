package Esercitazione1.es3_studenti;

import java.util.ArrayList;

public class Course implements ICourse {
    private ArrayList<String> students = new ArrayList<>();
    private String name;

    Course(String p_name) {
        name = p_name;
    }

    @Override
    public void addStudent(String student) {
        if (students.contains(student)) throw new IllegalArgumentException(student + " already in course.");
        students.add(student);
    }

    @Override
    public String[] getStudents() {
        return students.toArray(new String[0]);
    }

    @Override
    public int getNumberOfStudents() {
        return students == null ? 0 : students.size();
    }

    @Override
    public String getCourseName() {
        return name;
    }

    @Override
    public void dropStudent(String student) {
        int pos = students.indexOf(student);
        if (pos == -1) throw new IllegalArgumentException(student + " not in course.");
        else students.remove(pos);
    }

    @Override
    public void clear() {
        students.clear();
    }

    @Override
    public String toString() {
        return getCourseName() + ":" + students.toString();
    }

}
