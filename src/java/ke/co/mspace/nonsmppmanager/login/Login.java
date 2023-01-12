/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke.co.mspace.nonsmppmanager.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import ke.co.mspace.nonsmppmanager.user.User;
import util.Database;

/**
 *
 * @author developer
 */
@ManagedBean(name = "login")
public class Login {

    static Database database = new Database();
    static ResultSet result;
    Connection connection;

    @ManagedProperty(value = "#{user}")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String login() {
        System.out.println("Clicked");
        return "dashboard.xhtml";
    }

    public String authenticateUser(){
        String username = null;
        String password = null;
        connection = database.getConnection();
        String query = "SELECT * FROM tUSER WHERE username = ? AND password = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            result = ps.executeQuery();
            while (result.next()) {
                username = result.getString("username");
                password = result.getString("password");
                System.out.println(username);
            }
            System.out.println("query done:");
            System.out.println(result);
            System.out.println(username);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
            System.out.println(username);
            System.out.println(password);
            return "dashboard.xhtml";
        } else {
            System.out.println(username);
            System.out.println(password);
            return "index.xhtml";
        }
    }

}
