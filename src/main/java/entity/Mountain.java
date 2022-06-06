package entity;

import jakarta.persistence.*;
import lombok.*;


@ToString(callSuper = true)
@Entity
@Getter
@Setter
@NonNull
@NoArgsConstructor

public class Mountain extends Iid{
    public Mountain(String mName, String country, int high) {
        this.mName = mName;
        this.country = country;
        this.high = high;
    }

    @Column(unique = true)
    private String mName;
    private String country;
    private int high;


    @OneToOne
    @JoinColumn(name = "group_list_iid")
    private GroupList groupList;
}
