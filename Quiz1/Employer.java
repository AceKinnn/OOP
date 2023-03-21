package Quiz1;

import java.util.List;
import java.util.ArrayList;

public class Employer {
    String name;
    String industry;
    List<Person> employees;
    List<String> employeesStr;

    Employer(String name, String industry) {
        this.name = name;
        this.industry = industry;
        this.employees = new ArrayList<Person>();
        this.employeesStr = new ArrayList<String>();
    }

    String getName() {
        return name;
    }

    String getIndustry() {
        return industry;
    }

    List<Person> getEmployees() {
        return this.employees;
    }

    Person addEmployee(Person p) {
        this.employees.add(p);
        return p;
    }

    List<String> getEmployeesStr() {
        return this.employeesStr;
    }

    String addEmployeeStr(String s) {
        this.employeesStr.add(s);
        return s;
    }
}
