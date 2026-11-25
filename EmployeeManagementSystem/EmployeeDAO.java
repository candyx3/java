
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class EmployeeDAO {
    public void addEmployee(Employee emp) {
        String sql="INSERT INTO employees(name,email,department,salary) VALUES(?,?,?,?)";
        try {
            Connection con=DBConnection.getConnection();
            if(con==null) return;
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,emp.getName());
            ps.setString(2,emp.getEmail());
            ps.setString(3,emp.getDepartment());
            ps.setDouble(4,emp.getSalary());
            int rows=ps.executeUpdate();
            if(rows>0) {
                System.out.println("Employee Added Successfully!");
            }
            ps.close();
            con.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    public void viewEmployees() {
        String sql="SELECT * FROM employees ORDER BY id";
        try {
            Connection con=DBConnection.getConnection();
            if(con==null) return;
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            boolean found=false;
            while(rs.next()) {
                found=true;
                System.out.println("----------------------");
                System.out.println("ID: "+rs.getInt("id"));
                System.out.println("Name: "+rs.getString("name"));
                System.out.println("Email: "+rs.getString("email"));
                System.out.println("Department: "+rs.getString("department"));
                System.out.println("Salary: "+rs.getDouble("salary"));
            }
            if(!found) {
                System.out.println("No Employees Found!");
            }
            rs.close();
            ps.close();
            con.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    public void searchEmployee(int id) {
        String sql="SELECT * FROM employees WHERE id=?";
        try {
            Connection con=DBConnection.getConnection();
            if(con==null) return;
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()) {
                System.out.println("----------------------");
                System.out.println("ID: "+rs.getInt("id"));
                System.out.println("Name: "+rs.getString("name"));
                System.out.println("Email: "+rs.getString("email"));
                System.out.println("Department: "+rs.getString("department"));
                System.out.println("Salary: "+rs.getDouble("salary"));
            } else {
                System.out.println("Employee Not Found!");
            }
            rs.close();
            ps.close();
            con.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    public void updateEmployee(int id,String name,String email,String department,double salary) {
        String sql="UPDATE employees SET name=?,email=?,department=?,salary=? WHERE id=?";
        try {
            Connection con=DBConnection.getConnection();
            if(con==null) return;
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,name);
            ps.setString(2,email);
            ps.setString(3,department);
            ps.setDouble(4,salary);
            ps.setInt(5,id);
            int rows=ps.executeUpdate();
            if(rows>0) {
                System.out.println("Employee Updated Successfully!");
            } else {
                System.out.println("Employee Not Found!");
            }
            ps.close();
            con.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    public void deleteEmployee(int id) {
        String sql="DELETE FROM employees WHERE id=?";
        try {
            Connection con=DBConnection.getConnection();
            if(con==null) return;
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,id);
            int rows=ps.executeUpdate();
            if(rows>0) {
                System.out.println("Employee Deleted Successfully!");
            } else {
                System.out.println("Employee Not Found!");
            }
            ps.close();
            con.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}

