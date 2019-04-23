package Esercitazione1.es3_studenti;

interface ICourse {
    void addStudent(String student);

    String[] getStudents();

    int getNumberOfStudents();

    String getCourseName();

    void dropStudent(String student);

    void clear();
}
