package entity;

import jakarta.persistence.*;
import lombok.*;

import  java.lang.String;

@EqualsAndHashCode(callSuper = true)
@Entity
@Getter
@Setter
@ToString(callSuper = true)
@NonNull
@RequiredArgsConstructor

public class Alpinist extends Iid {

    public Alpinist(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    @Column(unique = true)
    private String name;
    private String adress;

    @ManyToOne(fetch = FetchType.EAGER)
    @Setter
    private GroupList groupList;
}
