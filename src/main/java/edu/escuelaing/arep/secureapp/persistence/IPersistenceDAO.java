package edu.escuelaing.arep.secureapp.persistence;

import java.util.Map;

public interface IPersistenceDAO {
    public String LoadPassByUser(String user);

    public Map<String, String> loadUsers();

}
