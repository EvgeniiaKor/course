package entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NonNull
@NoArgsConstructor
@ToString(callSuper = true)
public class GroupList extends  Iid{
    private boolean openGroup = true;
    @OneToMany(mappedBy = "groupList", cascade = CascadeType.PERSIST)
    private final List<Alpinist> alpinists = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "mountain_iid")
    private Mountain mountain;


    public GroupList(Mountain mountain) {
        this.mountain = mountain;
    }

    ////
    public  void  addAlpinist(Alpinist... alp){
        if (!openGroup){
            System.out.println("мест нет");
            return;
        }
        for (Alpinist alpinist : alp) {
            if (alpinists.size() < 3) {
                alpinist.setGroupList(this);
                alpinists.add(alpinist);
            }
            if (alpinists.size() == 3){
                openGroup = false;
                System.out.println("Места закончились");
            }
        }
    }
}