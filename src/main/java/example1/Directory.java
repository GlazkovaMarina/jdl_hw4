package example1;

import java.util.ArrayList;
import java.util.List;

/*
    + Добавить метод добавление нового сотрудника в справочник
    + Добавить метод, который ищет сотрудника по табельному номеру
    + Добавить метод, который ищет сотрудника по стажу (может быть список)
    + Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)

 */
public class Directory {
    private List<Employee> list;

    public Directory(List<Employee> list) {
        this.list = list;
    }
    public Directory(){
        list = new ArrayList<>();
    }
    public List<Employee> add(Employee employee){
        this.list.add(employee);
        return this.list;
    }
    public List<Employee> add(List<Employee> list){
        this.list.addAll(list);
        return this.list;
    }

    @Override
    public String toString() {
        return "Directory{" +
                "list=\n" + list +
                '}';
    }

    public Employee searchByPersonnelNumber(Integer personnelNumber){
        for (Employee employee: this.list){
            if (personnelNumber.equals(employee.getPersonnelNumber())){
                return employee;
            }
        }
        return null;
    }
    public List<Employee> searchByWorkExperience(Integer workExperience){
        return this.list.stream().filter(employee -> employee.getWorkExperience().equals(workExperience)).toList();
    }
    public List<Long> getNumbersByName(String name){
        for (Employee employee: this.list){
            if (name.equals(employee.getName())){
                return employee.getNumbers();
            }
        }
        return null;
    }
}
