package JDBC;

import java.sql.*;
import java.util.Scanner;

public class Main{

    // Variable for Creating connection to database
    private static final String url = "jdbc:mysql://localhost:3306/prasudb";
    private static final String username = "root";
    private static final String password = "Prasu@3598";

    public static void main(String[] args) {

        // Set up
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        // Connecting actual database connection
        try {

            Connection connection = DriverManager.getConnection(url, username, password);

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

             // Each operation in Statement compiles SQL compiler which is not time efficient

//             Statement statement = connection.createStatement();
//
//             String queryGetTable = "select * from student";
//             String queryInsertRow = String.format("insert into student(name, age , marks) values('%s', %o, %f)","Rudra",20,90.90);
//             String queryUpdateTable = String.format("update student set marks = %f where id = %d",95.00,1);
//             String queryDeleteTable = String.format("delete from student where id = %d",4);
//
//             // insert table
//            int rowsAffected = statement.executeUpdate(queryInsertRow);
//
//             // update table
//             int rowAffeced = statement.executeUpdate(queryUpdateTable);
//
//             // Delete row
//             int rowAfected = statement.executeUpdate(queryDeleteTable);
//
//             // get table
//             ResultSet resultSet = statement.executeQuery(queryGetTable);
//
//             while(resultSet.next()){
//                 int id = resultSet.getInt("id");
//                 String name = resultSet.getString("name");
//                 int age = resultSet.getInt("age");
//                 double marks = resultSet.getDouble("marks");
//
//                 System.out.println(id+" "+name+" "+age+" "+marks);
//             }

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

            // Prepared Statements
//            String query = String.format("insert into student(name, age, marks) values(?, ?, ?)");
//
//            PreparedStatement preparedStatement = connection.prepareStatement(query);
//            preparedStatement.setString(1, "Ankita");
//            preparedStatement.setInt(2, 23);
//            preparedStatement.setFloat(3, 89);
//
//            int rows = preparedStatement.executeUpdate();
//
//            System.out.println(rows);

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

            // Batch Querying in Statement

//            Scanner sc = new Scanner(System.in);
//            Statement statement = connection.createStatement();
//
//            while(true){
//                System.out.print("First name : ");
//                String name = sc.nextLine();
//
//                System.out.print("Age : ");
//                int age = sc.nextInt();
//
//                System.out.print("marks : ");
//                float marks = sc.nextFloat();
//
//                System.out.print("Continue ? (Y/N) : ");
//                String choice = sc.nextLine();
//
//                String query = String.format("insert into student(name, age, marks) values('%s', %d, %f)",name, age, marks);
//
//                statement.addBatch(query);
//
//                if(choice.equalsIgnoreCase("N")){
//                    break;
//                }
//            }
//
//            int[] array = statement.executeBatch();

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

            // Batch Querying in PreparedStatement

            Scanner sc = new Scanner(System.in);
            String query = String.format("insert into student(name, age, marks) values('? ? ?)");
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            while(true){
                System.out.print("First name : ");
                String name = sc.nextLine();

                System.out.print("Age : ");
                int age = sc.nextInt();

                System.out.print("marks : ");
                float marks = sc.nextFloat();

                System.out.print("Continue ? (Y/N) : ");
                String choice = sc.nextLine();

                preparedStatement.setString(1, name);
                preparedStatement.setInt(2, age);
                preparedStatement.setFloat(3, marks);

                preparedStatement.addBatch(query);

                if(choice.equalsIgnoreCase("N")){
                    break;
                }
            }

            int[] array = preparedStatement.executeBatch();


        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}