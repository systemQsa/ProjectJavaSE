package ua.intita.qa.homework17.student;


public class Student {
    private String name;
    private String group;
    private int course;
    private int score;

    public Student(String name, String group, int course, int score) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    @Override
    public String toString() {
        return "(" + name + "-" + group + "-" + course + "-" + score + ")";
    }

}
