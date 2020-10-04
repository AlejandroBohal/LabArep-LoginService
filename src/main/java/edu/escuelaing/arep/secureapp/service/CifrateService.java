package edu.escuelaing.arep.secureapp.service;

import java.math.BigInteger;
import java.security.MessageDigest;

public class CifrateService {
    public CifrateService(){

    }
    public String cifrateSHA1(String password){
        String value = "this is a test";
        String sha1 = "";
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
            digest.reset();
            digest.update(value.getBytes("utf8"));
            sha1 = String.format("%040x", new BigInteger(1, digest.digest()));
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println( sha1 );
        return(sha1);
    }
}
