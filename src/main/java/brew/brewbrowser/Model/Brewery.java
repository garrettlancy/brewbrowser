package brew.brewbrowser.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="breweries", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
                "name"
        }),
        @UniqueConstraint(columnNames = {
                "brewery_id"
        })
})
public class Brewery {

    @OneToMany
    @JoinTable(name="brewery_beers",
            joinColumns = @JoinColumn(name="brewery_id"),
            inverseJoinColumns = @JoinColumn(name="beer_id")
    )
    private List<Beer> beers = new ArrayList<>();

    @OneToMany
    @JoinTable(name="locations",
            joinColumns = @JoinColumn(name="brewery_id"),
            inverseJoinColumns = @JoinColumn(name="location_id")
    )
    private List<BreweryLocation> breweryLocations = new ArrayList<>();

    @Id
    @Column(name="brewery_id")
    private String breweryId;

    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;

    @Column(name="website")
    private String website;

    @Column(name="icon")
    private String icon;

    @Column(name="image")
    private String image;

    public List<BreweryLocation> getBreweryLocations() {
        return breweryLocations;
    }

    public void setBreweryLocations(List<BreweryLocation> breweryLocations) {
        this.breweryLocations = breweryLocations;
    }

    public List<Beer> getBeers() {
        return beers;
    }

    public void setBeers(List<Beer> beers) {
        this.beers = beers;
    }

    public String getBreweryId() {
        return breweryId;
    }

    public void setBreweryId(String breweryId) {
        this.breweryId = breweryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
