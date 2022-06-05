package entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import  java.lang.String;

@Entity
@Getter
@Setter

public class Alphinist {

    private String name;
    private String adress;

    public Alphinist(String name, String adress){
        setName(name);
        setAdress(adress);
    }
}
