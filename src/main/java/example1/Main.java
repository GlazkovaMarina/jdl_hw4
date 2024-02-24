package example1;

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
        Employee employee1 = new Employee("Egor", 5, 79005007788L);
        Employee employee2 = new Employee("Olga", 4, "79899999999");
        Employee employee3 = new Employee("Kirill", 4, "+79898888888");
        Employee employee4 = new Employee("Tom", 3, "+79112223344");
        employee4.addNumber(79991111111L);
        Directory directory = new Directory();
        directory.add(employee1);
        directory.add(employee2);
        directory.add(employee3);
        directory.add(employee4);
        System.out.println(directory);
        System.out.println(directory.searchByPersonnelNumber(-525390404));
        System.out.println(directory.searchByWorkExperience(4));
        System.out.println(directory.getNumbersByName("Kirill"));
        System.out.println(directory.getNumbersByName("Tom"));

    }


}
