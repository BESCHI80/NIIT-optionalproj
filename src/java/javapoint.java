/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class javapoint {

     String username;
     String password;
     String category;
     String email;

    public javapoint(String username, String password, String category, String email) {
        this.username = username;
        this.password = password;
        this.category = category;
        this.email = email;
    }

    public javapoint(String username, String password, String category) {
        this.username = username;
        this.password = password;
        this.category = category;
    }

    public javapoint(String username, String password) {
        this.username = username;
        this.password = password;
    }
     
}
