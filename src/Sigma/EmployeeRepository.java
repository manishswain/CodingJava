@Entity
class Employee {
    private int empId;

    private String name;

    private String address;

    private int age;

    @ManyToMany(mappedBy = "employees")
    private List<Department> departments = new ArrayList<>();
}

class Department {
    private int deptId;

    private String name;

    @ManyToMany(mappedBy = "departments")
    private List<Employee> employees = new ArrayList<>();

}

public interface EmployeeRepository implements JpaRepostory<Employee,Integer> {

    Optional<Employee> getEmployeeById();

    Optional<Employee> getEmployeeByDeptId(Integer deptID);
}