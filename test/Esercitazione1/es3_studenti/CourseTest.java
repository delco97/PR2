package Esercitazione1.es3_studenti;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CourseTest {

    @Test
    void addStudent() {
        Course c = new Course("test");
        c.addStudent("a");
        c.addStudent("b");
        assertEquals("a", c.getStudents()[0]);
        assertEquals("b", c.getStudents()[1]);
        assertThrows(IllegalArgumentException.class, () -> {
            c.addStudent("a");
        });
    }

    @Test
    void getStudents() {
        Course c = new Course("test");
        c.addStudent("a");
        c.addStudent("b");
        assertEquals("a", c.getStudents()[0]);
        assertEquals("b", c.getStudents()[1]);
    }

    @Test
    void getNumberOfStudents() {
        Course c = new Course("test");
        assertEquals(0, c.getNumberOfStudents());
        c.addStudent("b");
        assertEquals(1, c.getNumberOfStudents());
    }

    @Test
    void getCourseName() {
        Course c = new Course("test");
        assertEquals("test", c.getCourseName());
    }

    @Test
    void dropStudent() {
        Course c = new Course("test");
        assertThrows(IllegalArgumentException.class, () -> {
            c.dropStudent("a");
        });
        c.addStudent("a");
        c.dropStudent("a");
        assertEquals(0, c.getNumberOfStudents());
    }

    @Test
    void clear() {
        Course c = new Course("test");
        c.addStudent("a");
        c.addStudent("b");
        c.clear();
        assertEquals(0, c.getNumberOfStudents());

    }
}