package ua.intita.qa.homework12.entiry;

import java.util.Map;

public class Student {
    private String name;
    private String surname;
    private String group;

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    private String faculty;
    private Map<String, Integer> lessons;

    public Map<String, Integer> getLessons() {
        return lessons;
    }

    public void setLessons(Map<String, Integer> lessons) {
        this.lessons = lessons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


}
