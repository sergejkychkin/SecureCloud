package com.InteligentService.SecureCloud;


import lombok.Data;
import org.apache.http.HttpResponse;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import  javax.persistence.Id;



@Data
@Entity
public class User {


    private @Id @GeneratedValue Long id;
    private String name;


    User(String name){
        this.name = name;




    }
}
