package example2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
Табельный номер
Номер телефона
Имя
Стаж
 */
public class Employee2 {
    private String name;
    private Integer workExperience;
    private List<Long> number;
    static private Integer count = 0;
    private Integer personnelNumber;

    public Employee2(String name, Integer workExperience, Long number) {
        this.name = name;
        this.workExperience = workExperience;
        this.number = new ArrayList<>();
        this.number.add(number);
        this.personnelNumber = ++count;
    }
    public Employee2(String name, Integer workExperience, String number) {
        this.name = name;
        this.workExperience = workExperience;
        this.number = new ArrayList<>();
        if (number.indexOf(0) == '+')
            number.copyValueOf(number.toCharArray(),1, number.length() - 1);
        this.number.add(Long.parseLong(number));
        this.personnelNumber = ++count;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "name='" + name + '\'' +
                ", workExperience=" + workExperience +
                ", number=" + number +
                ", personnelNumber=" + personnelNumber +
                "}\n";
    }

    public String getName() {
        return name;
    }

    public Integer getWorkExperience() {
        return workExperience;
    }

    public List<Long> getNumbers() {
        return number;
    }

    public void addNumber(Long number) {
        this.number.add(number);
    }

    public Integer getPersonnelNumber() {
        return personnelNumber;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee2 employee = (Employee2) o;
        return Objects.equals(name, employee.name) && Objects.equals(workExperience, employee.workExperience) && Objects.equals(number, employee.number) && Objects.equals(personnelNumber, employee.personnelNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, workExperience, number);
    }
}
