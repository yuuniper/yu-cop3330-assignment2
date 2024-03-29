package oop.example.ex34.base;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class RemoveEmployeeTest {

   @Test
    public void removeEmployee_set1(){
       String [] employeeList = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
       assertEquals(RemoveEmployee.removeEmp(employeeList, "Chris Jones"), "Chris Jones");
   }
    @Test
    public void removeEmployee_not_blank(){
        String [] employeeList = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        assertNotEquals(RemoveEmployee.removeEmp(employeeList, "Amanda Cullen"), "");
    }

    @Test
    public void removeEmployee_not_correct_emp(){
        String [] employeeList = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        assertNotEquals(RemoveEmployee.removeEmp(employeeList, "Amanda Cullen"), "Jeremy Goodwin");
    }
}