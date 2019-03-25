package Capstone.AssetServer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
@Table(name="assets")
public class Assets {

    @Id
    @Column(name="assetID")
    private Integer assetID;

    @Column(name="name")
    private String name;

    @Column(name="curator")
    private String curator;

    @Column(name="genre")
    private String genre;

    @Column(name="type")
    private String type;

    Integer getID() {
        return this.assetID;
    }

    void setId(Integer id) {
        this.assetID = id;
    }

    String getName() {
        return this.name;
    }

    void setName(String n) {
        this.name = n;
    }

    String getCurator() {
        return this.curator;
    }

    void setCurator(String c) {
        this.curator = c;
    }

    String getGenre() {
        return this.genre;
    }

    void setGenre(String g) {
        this.genre = g;
    }

    String getType() {
        return this.type;
    }

    void setType(String t) {
        this.type = t;
    }

}
