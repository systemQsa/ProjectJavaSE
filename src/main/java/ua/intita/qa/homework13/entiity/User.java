package ua.intita.qa.homework13.entiity;

import java.util.Objects;

/*

   При инициализации полей проверять:
   имя и фамилия: состоит только из букв, первая в верхнем регистре, остальные в нижнем.
   возраст это число которое не может быть отрицательным или ноль, а так же не больше 150
   email соответствует шаблону стандарного email
   пароль должен состоять как минимум из 10 символов, а именно обязательно буквы в верхнем и нижнем регистре, цифры.
   Использовать кастомные исключения для негативных кейсов и все знания о классах с которыми уже работали.
   Реализовать класс который содержит функционал по заполнению вышеуказаных полей пользователем с консоли.
   При правильном заполнении полей юзером, результат должен выводиться на консоль.
 */
public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String password;

    public User() {
    }

    public User(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return firstName.equals(user.firstName) && lastName.equals(user.lastName) && email.equals(user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

