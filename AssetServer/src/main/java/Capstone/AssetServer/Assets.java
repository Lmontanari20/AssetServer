package Capstone.AssetServer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;


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

    public Integer getID() {
        return this.assetID;
    }

    public void setId(Integer id) {
        this.assetID = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getCurator() {
        return this.curator;
    }

    public void setCurator(String c) {
        this.curator = c;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String g) {
        this.genre = g;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String t) {
        this.type = t;
    }

}
