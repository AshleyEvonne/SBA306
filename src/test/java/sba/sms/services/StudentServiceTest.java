package sba.sms.services;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.hibernate.Session;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import sba.sms.models.Student;
import sba.sms.utils.CommandLine;
import sba.sms.utils.HibernateUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class StudentServiceTest {
    private static Session session;

    @BeforeAll
    static void initialize() {
        session = HibernateUtil.getSessionFactory().openSession();

    }

    @Test
    public void testCreateStudent() {
        session.beginTransaction();
        Student student = new Student("useremail@gmail.com", "usertest", "passwordtest");
        session.persist(student);
        session.getTransaction().commit();
        assertTrue("useremail@gmail.com".equals(student.getEmail()));
    }

    @Test
    public void validateStudent (){
        Student student = session.get(Student.class, "useremail@gmail.com");

    }
}

