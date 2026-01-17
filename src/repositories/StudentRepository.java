package repositories;

import data.interfaces.IDB;
import entities.student;
import repositories.interfaces.IStudentRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private final IDB db;

    public StudentRepository(IDB db) {
        this.db = db;
    }

    @Override
    public boolean createStudent(student student) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "INSERT INTO student(name, info, group_id, id) VALUES (?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, student.getName());
            st.setString(2, student.getInfo());
            st.setString(3, student.getGroupId());
            st.setInt(4, student.getId());

            st.execute();
            return true;
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e);
        } finally {
            try {
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
    @Override
    public boolean updateStudent(int id, String newGroup) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "UPDATE student SET group_id = ? WHERE id = ?";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, newGroup);
            st.setInt(2, id);

            st.execute();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            try { if (con != null) con.close(); } catch (Exception e) { e.printStackTrace(); }
        }
    }

    @Override
    public boolean deleteStudent(int id) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "DELETE FROM student WHERE id = ?";
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, id);

            st.execute();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            try { if (con != null) con.close(); } catch (Exception e) { e.printStackTrace(); }
        }
    }


    @Override
    public List<student> getAllStudents() {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT id, name, info, group_id FROM student";
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);
            List<student> students = new ArrayList<>();
            while (rs.next()) {
                student s = new student(
                        rs.getString("name"),
                        rs.getString("info"),
                        rs.getInt("id"),
                        rs.getString("group_id")
                );
                students.add(s);
            }
            return students;
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e);
        } finally {
            try { if (con != null) con.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
        return null;
    }

    @Override
    public student getStudent(int id) {
        return null;
    }
}