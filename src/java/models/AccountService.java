/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author WCour
 */
public class AccountService {
    
    public String user1 = "abe";
    public String user2 = "barb";
    public String pass = "pass";
    
    public Boolean login(String username, String password){
        
        boolean auth = false;
        if(username != null || username != "" || username.equalsIgnoreCase(user1) || username.equalsIgnoreCase(user2) ||
           password != null || password != "" || password.equalsIgnoreCase(pass)){
            auth = true;
        }
        
        return auth;
        
    }
    
  
          
}
