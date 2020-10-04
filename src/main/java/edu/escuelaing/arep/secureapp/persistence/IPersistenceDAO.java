package edu.escuelaing.arep.secureapp.persistence;

import java.util.Map;

/**
 * The interface Persistence dao.
 */
public interface IPersistenceDAO {
    /**
     * Load pass by user string.
     *
     * @param user the user
     * @return the string
     */
    public String LoadPassByUser(String user);

    /**
     * Load users map.
     *
     * @return the map
     */
    public Map<String, String> loadUsers();

}
