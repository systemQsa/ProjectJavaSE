package ua.intita.qa.homework13;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;
import ua.intita.qa.homework13.entiity.User;
import ua.intita.qa.homework13.exception.AgeException;
import ua.intita.qa.homework13.exception.EmailException;
import ua.intita.qa.homework13.exception.NameException;
import ua.intita.qa.homework13.exception.PasswordException;
import ua.intita.qa.homework13.logic.UserSetData;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class UserSetDataTest {

    private final UserSetData userSetData = new UserSetData();
    private final User user = new User();

    @Test
    public void setNameSurname() {
        try {
            System.setIn(new ByteArrayInputStream("Sasha".getBytes()));
            Scanner scn = new Scanner(System.in);
            userSetData.setFirstName(user, scn);
            System.setIn(System.in);
            assertEquals("Sasha", user.getFirstName());
        } catch (NameException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void setLastName() {
        System.setIn(new ByteArrayInputStream("Sasha".getBytes()));
        Scanner scn = new Scanner(System.in);
        String result;
        try {
            userSetData.setLastName(user, scn);
            System.setIn(System.in);
            assertEquals("Sasha", user.getLastName());
        } catch (NameException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void setAge() {
        try {
            System.setIn(new ByteArrayInputStream("23".getBytes()));
            Scanner scn = new Scanner(System.in);
            int result = userSetData.setAge(user, scn);
            System.setIn(System.in);
            assertThat(23, is(result));
        } catch (AgeException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void setEmail() {

        System.setIn(new ByteArrayInputStream("alex@gmail.com".getBytes()));
        Scanner scn = new Scanner(System.in);
        try {
            String email = userSetData.setEmail(user, scn);
            System.setIn(System.in);
            assertEquals("alex@gmail.com", email);
        } catch (EmailException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void setEmail2() {
        boolean interrupt = false;
        System.setIn(new ByteArrayInputStream("alex@gmailcom".getBytes()));
        Scanner scn = new Scanner(System.in);
        try {
            String email = userSetData.setEmail(user, scn);
            System.setIn(System.in);
        } catch (EmailException e) {
            interrupt = true;
            e.printStackTrace();
        }
        assertTrue(interrupt);
    }


    @Test
    public void setPassword() {
        System.setIn(new ByteArrayInputStream("1234sashaDA".getBytes()));
        Scanner scn = new Scanner(System.in);

        String password = null;
        try {
            password = userSetData.setPassword(user, scn);
            System.setIn(System.in);
            assertEquals("1234sashaDA", password);
        } catch (PasswordException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void setPassword2() {
        System.setIn(new ByteArrayInputStream("1234sash".getBytes()));
        Scanner scn = new Scanner(System.in);
        boolean interrupt = false;
        try {
            userSetData.setPassword(user, scn);
            System.setIn(System.in);
        } catch (PasswordException e) {
            interrupt = true;
            e.printStackTrace();
        }
        assertTrue(interrupt);
    }

}
