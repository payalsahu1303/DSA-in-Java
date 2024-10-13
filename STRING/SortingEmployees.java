// You are given two arrays, employee and salary, where employee[i] denotes the name of the ith employee, and salary[i] denotes the salary of the ith employee. Your task is to sort the employee array based on their salaries in non-decreasing order. If two or more employees have the same salary, sort them alphabetically by their names. Return the sorted employee array.

import java.util.Arrays;
import java.util.Comparator;

public class SortingEmployees {
    public String[] sortEmployees(String[] employee, int[] salary) {
        String[][] employeeSalary = new String[employee.length][2];
        for (int i = 0; i < employee.length; i++) {
            employeeSalary[i][0] = employee[i];
            employeeSalary[i][1] = Integer.toString(salary[i]);
        }
        Arrays.sort(employeeSalary, new Comparator<String[]>() {
            @Override
            public int compare(String[] emp1, String[] emp2) {
                int salaryCompare = Integer.parseInt(emp1[1]) - Integer.parseInt(emp2[1]);
                if (salaryCompare != 0) {
                    return salaryCompare;
                } else {
                    return emp1[0].compareTo(emp2[0]);
                }
            }
        });
        String[] sortedEmployees = new String[employee.length];
        for (int i = 0; i < employee.length; i++) {
            sortedEmployees[i] = employeeSalary[i][0];
        }
        return sortedEmployees;
    }

    public static void main(String[] args) {
        SortingEmployees obj = new SortingEmployees();
        String[] employee = { "Tom", "Jack", "Steve", "Rick", "Bob" };
        int[] salary = { 70000, 60000, 50000, 40000, 30000 };
        String[] sortedEmployee = obj.sortEmployees(employee, salary);
        System.out.println(Arrays.toString(sortedEmployee));
    }
}

// The time complexity is O(n log n) due to sorting, and space complexity is
// O(n) for storing the employee-salary array.