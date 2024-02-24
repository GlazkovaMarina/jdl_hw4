package example2;

import example1.Directory;
import example1.Employee;

/*
Создать справочник сотрудников
Необходимо:
Создать класс справочник сотрудников, который содержит внутри
коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
Табельный номер
Номер телефона
Имя
Стаж
Добавить метод, который ищет сотрудника по стажу (может быть список)
Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
Добавить метод, который ищет сотрудника по табельному номеру
Добавить метод добавление нового сотрудника в справочник
 */
public class Main {
    public static void main(String[] args) {
        Employee2 employee1 = new Employee2("Egor", 5, 79005007788L);
        Employee2 employee2 = new Employee2("Olga", 4, "79899999999");
        Employee2 employee3 = new Employee2("Kirill", 4, "+79898888888");
        Employee2 employee4 = new Employee2("Tom", 3, "+79112223344");
        employee4.addNumber(79991111111L);
        Directory2 directory = new Directory2();
        directory.add(employee1);
        directory.add(employee2);
        directory.add(employee3);
        directory.add(employee4);
        System.out.println(directory);
        System.out.println(directory.searchByPersonnelNumber(2));
        System.out.println(directory.searchByWorkExperience(4));
        System.out.println(directory.getNumbersByName("Kirill"));
        System.out.println(directory.getNumbersByName("Tom"));

    }


}
