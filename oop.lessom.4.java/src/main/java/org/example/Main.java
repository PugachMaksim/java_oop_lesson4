package org.example;

import java.util.ArrayList;
import java.util.List;

//— Создать класс УчительСервис и реализовать аналогично проделанному на семинаре;
//— Создать класс УчительВью и реализовать аналогично проделанному на семинаре;
//— Создать класс УчительКонтроллер и реализовать возможность создания, редактирования конкретного
// учителя и отображения списка учителей, имеющихся в системе.
public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Наталья", "Иванова", "Александровна", 12379L);
        Teacher teacher2 = new Teacher("Николай", "Свинцов", "Викторович",146L);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(teacher1);
        teacherList.add(teacher2);

        new TeacherGroup("1a", teacherList);
        TeacherController teacherController = new TeacherController();
        teacherController.create("Наталья", "Иванова", "Александровна", 12379L);
        teacherController.create("Николай", "Свинцов", "Викторович",146L);

        teacherController.printConsole(teacherList);

        teacher1.setFirstName("Ольга");
        System.out.println(teacher1);
    }
}