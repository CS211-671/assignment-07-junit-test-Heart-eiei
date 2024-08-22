package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    StudentList l1;
    @BeforeEach
    void init(){
        l1 = new StudentList();
        l1.addNewStudent("6xxxxxx0", "tommy");
        l1.addNewStudent("6xxxxx90", "tony", 100.0);
    }

    @Test
    void testAddNewStudent() {
        l1.addNewStudent("6xxxxxx0", "tommy");
        assertEquals("tommy", l1.findStudentById("6xxxxxx0").getName());
        assertEquals("6xxxxxx0", l1.findStudentById("6xxxxxx0").getId());
        assertEquals(0.0, l1.findStudentById("6xxxxxx0").getScore());
        l1.addNewStudent("6xxxxx90", "tony", 100.0);
        assertEquals("tony", l1.findStudentById("6xxxxx90").getName());
        assertEquals("6xxxxx90", l1.findStudentById("6xxxxx90").getId());
        assertEquals(100.0, l1.findStudentById("6xxxxx90").getScore());
    }

    @Test
    void testFindNewStudentById(){
//        l1.addNewStudent("6xxxxxx0", "tommy");
        assertEquals("tommy", l1.findStudentById("6xxxxxx0").getName());
        assertEquals("6xxxxxx0", l1.findStudentById("6xxxxxx0").getId());
        assertEquals(0.0, l1.findStudentById("6xxxxxx0").getScore());
    }

    @Test
    void testGiveScoreToId(){
//        l1.addNewStudent("6xxxxxx0", "tommy");
        l1.giveScoreToId("6xxxxxx0", 100.0);
        assertEquals(100.0, l1.findStudentById("6xxxxxx0").getScore());

    }

    @Test
    void testViewGradeOfId(){
        l1.addNewStudent("6xxxxxx0", "tommy");
        l1.giveScoreToId("6xxxxxx0", 100.0);
        assertEquals("A", l1.findStudentById("6xxxxxx0").grade());

    }

}