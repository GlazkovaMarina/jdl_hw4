package example2;

import example1.Employee;

import java.util.ArrayList;
import java.util.List;

/*
    + Добавить метод добавление нового сотрудника в справочник
    + Добавить метод, который ищет сотрудника по табельному номеру
    + Добавить метод, который ищет сотрудника по стажу (может быть список)
    + Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)

 */
public class Directory2 {
    private List<Employee2> list;

    public Directory2(List<Employee2> list) {
        this.list = list;
    }
    public Directory2(){
        list = new ArrayList<>();
    }
    public List<Employee2> add(Employee2 employee){
        this.list.add(employee);
        return this.list;
    }
    public List<Employee2> add(List<Employee2> list){
        this.list.addAll(list);
        return this.list;
    }

    @Override
    public String toString() {
        return "Directory{" +
                "list=\n" + list +
                '}';
    }

    public Employee2 searchByPersonnelNumber(Integer personnelNumber){
        for (Employee2 employee: this.list){
            if (personnelNumber.equals(employee.getPersonnelNumber())){
                return employee;
            }
        }
        return null;
    }
    public List<Employee2> searchByWorkExperience(Integer workExperience){
        return this.list.stream().filter(employee -> employee.getWorkExperience().equals(workExperience)).toList();
    }
    public List<Long> getNumbersByName(String name){
        for (Employee2 employee: this.list){
            if (name.equals(employee.getName())){
                return employee.getNumbers();
            }
        }
        return null;
    }
}
