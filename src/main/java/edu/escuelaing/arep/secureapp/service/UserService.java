package edu.escuelaing.arep.secureapp.service;

import edu.escuelaing.arep.secureapp.persistence.IPersistenceDAO;
import edu.escuelaing.arep.secureapp.persistence.InMemoryUserDAO;

import java.util.Map;

public class UserService {
    IPersistenceDAO persistence = new InMemoryUserDAO();
    public String getPassByUser(String user){
        return persistence.LoadPassByUser(user);
    }

    public Map<String, String> getUsers(){
        return persistence.loadUsers();
    }
}
