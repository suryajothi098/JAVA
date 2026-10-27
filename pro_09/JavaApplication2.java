"-----> in cmd type this  :"

  psql -U postgres -d postgres -h localhost -p 5432

  CREATE DATABASE emps;
  
  \c emps
  
  CREATE TABLE emp_details (
    id SERIAL PRIMARY KEY,
    emp_name VARCHAR(100),
    email VARCHAR(100),
    phone VARCHAR(15),
    created_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

 INSERT INTO emp_details (emp_name, email, phone)
VALUES
('sri', 'sri@example.com', '9876543210'),
('devi', 'devi@example.com', '9876543211'),
('dhivya', 'dhivya@example.com', '9876543212'),
('Sanjana', 'sanjana@example.com', '9876543213'),
('viyaan', 'viyaan@example.com', '9876543214');

  SELECT * FROM emp_details;

  " important -> both program file and JDBC file in ame folder (C:\JavaLab) "
---------------------------------------------------------------------------------

-----> JavaApplication2.java


import java.sql.*;

public class JavaApplication2 {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/emps";
        String user = "postgres";
        String pass = "MCA"; // Replace with your actual PostgreSQL password

        String sql = "SELECT * FROM emp_details";

        try (Connection con = DriverManager.getConnection(url, user, pass);
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            System.out.println("Connection Successful\n");

            while (rs.next()) {
                System.out.println("ID = " + rs.getInt("id"));
                System.out.println("NAME = " + rs.getString("emp_name"));
                System.out.println("EMAIL = " + rs.getString("email"));
                System.out.println("PHONE = " + rs.getString("phone"));
                System.out.println("DATE = " + rs.getTimestamp("created_date"));
                System.out.println("--------------------");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

-------------------------------------------------------------------------------------

-----> Running Process :

    javac -cp ".;postgresql-42.7.14.jar" JavaApplication2.java
    java -cp ".;postgresql-42.7.14.jar" JavaApplication2

    
