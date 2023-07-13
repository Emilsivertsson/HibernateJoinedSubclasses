package org.CodeForPizza;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
@PrimaryKeyJoinColumn(name = "PERSON_ID")
public class Employee extends Person{
    @Column(name = "joining_date")
    private String joiningDate;
    @Column(name = "department_name")
    private String departmentName;

    public Employee(int personID, String firstName, String lastName, String joiningDate, String departmentName) {
        super(personID, firstName, lastName);
        this.joiningDate = joiningDate;
        this.departmentName = departmentName;
    }

    public Employee() {

    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "joiningDate='" + joiningDate + '\'' +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
