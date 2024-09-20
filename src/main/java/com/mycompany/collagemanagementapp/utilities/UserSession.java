/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collagemanagementapp.utilities;

/**
 *
 * @author Kumra
 */
public class UserSession {
    static UserSession session ;
    
    int id;
    int userType;  // 1-> teacher , 2> Accountant

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    private UserSession(){
        
    }
    
    public static synchronized UserSession getInstance()
    {
        if(session==null)
            session = new UserSession();
  
       
      return session;
        
    }
    
}
