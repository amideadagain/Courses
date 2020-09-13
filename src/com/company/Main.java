package com.company;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Экономика", "Менеджмент", 4, 42, 53);
        Courses courses = new Courses();
        courses.list.add(course);
        courses.list.add(new Course("ООП", "Комп Технологии", 3, 34, 122));
        courses.list.add(new Course("ТАУ", "Прикладная Математика", 2, 34, 111));
        courses.list.add(new Course("Философия", "Философия", 1, 28, 23));

        for (Course course1 : courses.list) {
            System.out.println(course1);
        }
    }
}