package edu.escuelaing.arep.secureapp;


import edu.escuelaing.arep.secureapp.service.CifrateService;
import edu.escuelaing.arep.secureapp.service.UserService;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class SecureServicesTest {
    @Test
    public void shouldCifratePassword(){
        CifrateService cf = new CifrateService();
        Assert.assertEquals(cf.cifrateSHA1("hola123"), "fa26be19de6bff93f70bc2308434e4a440bbad02");
    }
    @Test
    public void shouldGetUsers(){
        UserService us = new UserService();
        Map<String,String> usersSet = us.getUsers();
        Assert.assertTrue(usersSet.containsKey("user1"));
        Assert.assertTrue(usersSet.containsKey("user2"));
        Assert.assertTrue(usersSet.containsKey("user3"));
    }
}
