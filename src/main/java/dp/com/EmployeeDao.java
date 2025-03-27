package dp.com;
import com.springcore.model.EmployeeMapper;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import com.springcore.model.Employee;

public class EmployeeDao {

    private JdbcTemplate jdbcTemplate;

    // Setter method with correct naming convention
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Save Employee
    public int saveEmployee(Employee e) {
        String query = "INSERT INTO employee (id, name, gender, salary) VALUES (?, ?, ?, ?)";
        return jdbcTemplate.update(query, e.getId(), e.getName(), e.getGender(), e.getSalary());
    }

    // Update Employee
    public int updateEmployee(Employee e) {
        String query = "UPDATE employee SET name = ?, gender = ? WHERE id = ?";
        return jdbcTemplate.update(query, e.getName(), e.getGender(), e.getId());
    }

    // Delete Employee
    public int deleteEmployee(int id) {
        String query = "DELETE FROM employee WHERE id = ?";
        return jdbcTemplate.update(query, id);
    }

	public List<Employee> getAllEmp() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select* from employee", new EmployeeMapper() );
	}
}