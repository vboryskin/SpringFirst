package ua.lviv.lgs.entry;

import javax.persistence.*;

/**
 * Created by vboryskin on 16.07.2016.
 */
@Entity
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private String name;

    public Categories(){

    }
    public Categories(String name){
        this.name=name;
    }


    public int getId(){
        return id;
    }
    public void setId(int id){
        id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){ name=name;}


}
