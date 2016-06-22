package ua.lviv.lgs.entry;
import javax.persistence.*;



/**
 * Created by admin on 23.06.2016.
 */
@
public class Author {
    private int id;
    private String name;
    private String country;

    public Author(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public Author() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
