package ua.lviv.lgs.entry;

import org.aspectj.weaver.ast.Or;

import javax.persistence.*;
import java.util.List;

/**
 * Created by admin on 30.06.2016.
 */
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private String name;
    @Column
    private int price;
    @Column
    private String specification;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
    private List<Order> orderList;
    @ManyToOne(fetch = FetchType.LAZY)
    private Brand brand;

    public Product() {
    }

    public Product(String name, int price, String specification) {
        this.name = name;
        this.price = price;
        this.specification = specification;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }
}
