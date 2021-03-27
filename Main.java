package com.company;

    import java.sql.*;
        public class Main {

            public static void createNewDatabase() {

                String url = "jdbc:sqlite:D:/SQLITE/2503_.db";

                try (Connection conn = DriverManager.getConnection(url)) {
                    if (conn != null) {
                        DatabaseMetaData meta = conn.getMetaData();
                        System.out.println("The driver name is " + meta.getDriverName());
                        System.out.println("A new database has been created.");
                    }
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            }
            public static void selectAll() {
                String url = "jdbc:sqlite:C:\\Users\\yelena\\SQL2203.db";

                try (Connection conn = DriverManager.getConnection(url)) {
                    if (conn != null) {
                        String sql = "SELECT * FROM PRODUCT";

                        Statement stmt = conn.createStatement();
                        ResultSet rs = stmt.executeQuery(sql);
                        // loop through the result set
                        while (rs.next()) {
                            System.out.println(rs.getInt("id") + "\t" +
                                    rs.getString("name") + "\t" +
                                    rs.getDouble("price"));
                        }
                    }
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            }
            public static void main(String[] args) {
                selectAll();
            }
        }
















