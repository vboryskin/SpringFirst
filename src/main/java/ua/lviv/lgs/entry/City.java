package ua.lviv.lgs.entry;

import javax.persistence.*;
import java.util.List;

/**
 * Created by admin on 30.06.2016.
 */
@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private String cityName;
    @Column
    private String country;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "city")
    private List<User> userList;

    public City() {
    }

    public City(String cityName, String country) {
        this.cityName = cityName;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
