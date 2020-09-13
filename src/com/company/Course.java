package com.company;

public class Course {
    String name;
    String faculty;
    Teacher yourTeacher;
    int hours;
    int code;

    public boolean isCorrectTitle(String title) {
        for (int i = 0; i < title.length(); i++) {
            if (!Character.isAlphabetic(title.charAt(i)) && !(title.charAt(i) == '_')&& !(title.charAt(i) == ' '))
                return false;
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = isCorrectTitle(name) ? name : "Incorrect";
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = isCorrectTitle(faculty) ? faculty : "Incorrect";
    }

    public Teacher getYourTeacher() {
        return yourTeacher;
    }

    public void setYourTeacher(int TeacherNumber) {
        this.yourTeacher = (TeacherNumber > 0 && TeacherNumber <= 4) ? Teacher.values()[TeacherNumber] : Teacher.Отсутствует;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours > 0 ? hours : -1;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code > 0 ? code : -1;
    }

    Course() {
        this.name = "";
        this.faculty = "";
        this.hours = 0;
        this.code = 0;
    }

    public Course(String name, String faculty, int yourTeacher, int hours, int code) {
        this.setName(name);
        this.setFaculty(faculty);
        this.setYourTeacher(yourTeacher);
        this.setHours(hours);
        this.setCode(code);
    }
    public String toString() {
        return name + ", code " + code + ", faculty " + faculty + ", teacher " + yourTeacher + ", hours " + hours;
    }
}
