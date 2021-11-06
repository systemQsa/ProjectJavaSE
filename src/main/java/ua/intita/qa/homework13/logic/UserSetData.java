package ua.intita.qa.homework13.logic;

import ua.intita.qa.homework13.entiity.User;
import ua.intita.qa.homework13.exception.AgeException;
import ua.intita.qa.homework13.exception.EmailException;
import ua.intita.qa.homework13.exception.NameException;
import ua.intita.qa.homework13.exception.PasswordException;

import java.util.Scanner;

public class UserSetData {

    private final Scanner scanner = new Scanner(System.in);
    private final String REGEX = "\\b[A-Z]{1}[a-z]+\\b";

    public String  setFirstName(User user,Scanner scanner) throws NameException {
        System.out.println("enter your first name");
        String name = scanner.nextLine();
        if (name.matches(REGEX)) {
            user.setFirstName(name);
            return name;
        }
        throw new NameException("INCORRECT FIRST NAME  INPUT");
    }
    public String setLastName(User user,Scanner scanner) throws NameException {
        System.out.println("enter your last name");
        String surname = scanner.nextLine();
        if (surname.matches(REGEX)) {
            user.setLastName(surname);
            return surname;
        }
        throw new NameException("INCORRECT LAST NAME INPUT");
    }

    public int setAge(User user,Scanner scanner) throws  AgeException {
            System.out.println("enter your age");
            int age = scanner.nextInt();
            if (age > 0 && age <= 150) {
                user.setAge(age);
                return age;
            }
        throw new AgeException("INCORRECT AGE INPUT");
    }

    public String setEmail(User user,Scanner scanner) throws  EmailException {
        String email;
        boolean match;
            System.out.println("enter your email");
            email = scanner.next();
            match = email.matches("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)" +
                    "*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]" +
                    "|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]" +
                    "*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4]" +
                    "[0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]" +
                    "*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]" +
                    "|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+))");

            if (match) {
                user.setEmail(email);
                return email;
            }
        throw new EmailException("INCORRECT EMAIL INPUT");

    }

    public String setPassword(User user,Scanner scanner) throws  PasswordException {
            System.out.println("enter your password");
            String password = scanner.next();
            boolean check = password.matches("(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{10,}");
            if (check) {
                user.setPassword(password);
                scanner.close();
                return password;
            }
        throw new PasswordException("INCORRECT PASSWORD INPUT");
    }

    public User setDataForUser() throws PasswordException, NameException, EmailException, AgeException {
        User user = new User();
        setFirstName(user,scanner);
        setLastName(user,scanner);
        setAge(user,scanner);
        String email = setEmail(user,scanner);
        setPassword(user,scanner);
        return user;
    }
}
