package edu.escuelaing.arep.secureapp.persistence;

import java.util.HashMap;
import java.util.Map;

public class InMemoryUserDAO implements IPersistenceDAO{
    private Map<String,String> users;

    public InMemoryUserDAO(){
        users = new HashMap<>();
        users.put("user1","fa26be19de6bff93f70bc2308434e4a440bbad02");
        users.put("user2","fa26be19de6bff93f70bc2308434e4a440bbad02");
        users.put("user3","fa26be19de6bff93f70bc2308434e4a440bbad02");
        users.put("user4","fa26be19de6bff93f70bc2308434e4a440bbad02");
        users.put("user5","fa26be19de6bff93f70bc2308434e4a440bbad02");
    }
    @Override
    public String LoadPassByUser(String user) {
        return users.get(user);
    }

    @Override
    public Map<String, String> loadUsers() {
        return users;
    }
}
