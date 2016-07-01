package ua.lviv.lgs.entry;

import javax.persistence.*;
import java.util.List;

/**
 * Created by admin on 30.06.2016.
 */
@Entity
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int Id;
    @Column
    private String brandName;
    @Column
    private String country;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "brand")
    private List<Product> productList;


    public Brand() {
    }

    public Brand(String brandName, String country) {
        this.brandName = brandName;
        this.country = country;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
