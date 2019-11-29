/* 
 * 
 * Â® All rights reserved 2019 , By Ahmed Saadawey
 * 
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author username
 */
public class MYSQL {

    //private String pass = "11111111";
    //private String user = "a7a";
    //private String host = "192.168.1.101";
    final private String pass = "123456";
    final private String user = "root";
    final private String host = "localhost";
    private boolean catcher = true;
   
        public boolean getClip()
    { 
        boolean r = false;
        try {
                       MYSQL N = new MYSQL();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://" + N.host + ":3306/employees?autoReconnect=true&useSSL=false", N.user, N.pass);
            
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT clipboard FROM services");
            //   ArrayList <String>A = new ArrayList<String>();
            String s = "";
            while (rs.next()) {
                s = rs.getString(1);
            }
            if(s.equals("Disabled"))
                r=false;
            else
                r=true;
        } catch (Exception ex) {
            Logger.getLogger(MYSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
 return r;

    }
    public boolean getCatch()
    { 
        boolean r = false;
        try {
                       MYSQL N = new MYSQL();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://" + N.host + ":3306/employees?autoReconnect=true&useSSL=false", N.user, N.pass);
            
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT catcher FROM services");
            //   ArrayList <String>A = new ArrayList<String>();
            String s = "";
            while (rs.next()) {
                s = rs.getString(1);
            }
            if(s.equals("Disabled"))
                r=false;
            else
                r=true;
        } catch (Exception ex) {
            Logger.getLogger(MYSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
 return r;

    }
    public void Enable(int i) {
        switch (i) {

            case 1: //catcher
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":3306/employees?autoReconnect=true&useSSL=false", this.user, pass);

                    Statement stmt = con.createStatement();

                    //  int rs = stmt.executeUpdate("DELETE FROM workers;");
                    int rs2 = stmt.executeUpdate("UPDATE services SET catcher='Enabled';");

                    con.close();
                } catch (Exception ex) {
                    Logger.getLogger(MYSQL.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
                            case 2: //clip
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":3306/employees?autoReconnect=true&useSSL=false", this.user, pass);

                    Statement stmt = con.createStatement();

                    //  int rs = stmt.executeUpdate("DELETE FROM workers;");
                    int rs2 = stmt.executeUpdate("UPDATE services SET clipboard='Enabled';");

                    con.close();
                } catch (Exception ex) {
                    Logger.getLogger(MYSQL.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;

        }

    }

    public void Disable(int i) {
        switch (i) {

            case 1: //catcher
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":3306/employees?autoReconnect=true&useSSL=false", this.user, pass);

                    Statement stmt = con.createStatement();

                    //  int rs = stmt.executeUpdate("DELETE FROM workers;");
                    int rs2 = stmt.executeUpdate("UPDATE services SET catcher='Disabled';");

                    con.close();
                } catch (Exception ex) {
                    Logger.getLogger(MYSQL.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
                            case 2: //catcher
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":3306/employees?autoReconnect=true&useSSL=false", this.user, pass);

                    Statement stmt = con.createStatement();

                    //  int rs = stmt.executeUpdate("DELETE FROM workers;");
                    int rs2 = stmt.executeUpdate("UPDATE services SET clipboard='Disabled';");

                    con.close();
                } catch (Exception ex) {
                    Logger.getLogger(MYSQL.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;

        }

    }

    public boolean isLogged(String user) {
        boolean res = true;
        try {
            MYSQL N = new MYSQL();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":3306/employees?autoReconnect=true&useSSL=false", this.user, N.pass);

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Status FROM workers WHERE Name='Admin';");
            //   ArrayList <String>A = new ArrayList<String>();
            String s = "";
            while (rs.next()) {
                s = rs.getString("Status");
            }
            if (s.equals("Logged in")) {
                res = true;
            } else {
                res = false;
            }
            con.close();
        } catch (Exception e) {

        }
        return res;
    }

    public void ChangePassword(String user, String newpass) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":3306/employees?autoReconnect=true&useSSL=false", this.user, pass);

            Statement stmt = con.createStatement();
            //  int rs = stmt.executeUpdate("DELETE FROM workers;");
            int rs2 = stmt.executeUpdate("UPDATE workers SET Password='" + newpass + "' WHERE Name='" + user + "'");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void Delete() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":3306/employees?autoReconnect=true&useSSL=false", this.user, pass);

            Statement stmt = con.createStatement();
            int rs = stmt.executeUpdate("DELETE FROM workers;");
            //     int rs2 = stmt.executeUpdate("UPDATE workers SET Status='"+type+"' WHERE Name='"+user+"'");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void WriteUser(String user, String pass) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":3306/employees?autoReconnect=true&useSSL=false", this.user, this.pass);
//here sonoo is database name, root is username and password  
            Statement stmt = con.createStatement();
            int rs = stmt.executeUpdate("INSERT INTO workers (Name , Password)\n"
                    + "VALUES ('" + user + "','" + pass + "');");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public String getPass(int id) {
        String res = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":3306/employees?autoReconnect=true&useSSL=false", user, pass);

//here sonoo is database name, root is username and password  
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Password FROM workers");
            res = rs.getString(id);
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return res;

    }

    public void DeleteUser(String s) {
        try {
            ArrayList<String> A = new ArrayList<String>();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":3306/employees?autoReconnect=true&useSSL=false", user, pass);
//here sonoo is database name, root is username and password
            Statement stmt = con.createStatement();
            int rs = stmt.executeUpdate("DELETE FROM workers WHERE Name='" + s + "';");
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(MYSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String Check() {

        String s = "";
        try {
            ArrayList<String> A = new ArrayList<String>();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":3306/employees?autoReconnect=true&useSSL=false", user, pass);
            s = "MYSQL : Connected";
        } catch (Exception e) {
            s = "MYSQL : Failed";
        }
        return s;
    }

    public void SetLogin(String user, String type) {
        try {
            java.net.InetAddress localMachine = java.net.InetAddress.getLocalHost();
            ArrayList<String> A = new ArrayList<String>();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":3306/employees?autoReconnect=true&useSSL=false", this.user, pass);
//here sonoo is database name, root is username and password
            Statement stmt = con.createStatement();
            DateFormat dateFormat2 = new SimpleDateFormat("dd/MM/yyyy hh.mm aa");// Create a date object
            String dateString2 = dateFormat2.format(new Date()).toString();
            int rs = stmt.executeUpdate("INSERT INTO logins (Name , Date , Logtype ,ComputerName)\n"
                    + "VALUES ('" + user + "','" + dateString2 + "','" + type + "','" + localMachine.getHostName() + "');");
            int rs2 = stmt.executeUpdate("UPDATE workers SET Status='" + type + "' WHERE Name='" + user + "'");
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(MYSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getSize() {
        int c = 0;
        try {
            ArrayList<String> A = new ArrayList<>();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":3306/employees?autoReconnect=true&useSSL=false", user, pass);
//here sonoo is database name, root is username and password
            Statement stmt = con.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery("SELECT * FROM workers");

            while (rs.next()) {
                c++;
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MYSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }

    public String[] get(int cas) {
        String res[] = null;
        switch (cas) {
            case 1:

                try {
                    ArrayList<String> A = new ArrayList<String>();
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":3306/employees?autoReconnect=true&useSSL=false", user, pass);
//here sonoo is database name, root is username and password  
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery("SELECT * FROM workers");
                    while (rs.next()) {
                        A.add(rs.getString("Password"));
                    }
                    res = new String[A.size()];
                    res = A.toArray(res);
                    con.close();
                } catch (Exception e) {
                    System.out.println(e);
                }
                break;
            case 2:
                try {
                    ArrayList<String> A = new ArrayList<String>();
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":3306/employees?autoReconnect=true&useSSL=false", user, pass);
//here sonoo is database name, root is username and password  
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery("SELECT * FROM workers");
                    while (rs.next()) {
                        A.add(rs.getString("Name"));
                    }
                    res = new String[A.size()];
                    res = A.toArray(res);
                    con.close();
                } catch (Exception e) {
                    System.out.println(e);
                }
                break;
        }
        return res;

    }
}
