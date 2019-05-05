package brew.brewbrowser.Model;

import javax.persistence.*;

@Entity
@Table(name="brewery_locations", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
                "location_id"
        })
})
public class BreweryLocation {

    @Id
    @Column(name="location_id")
    private String locationId;

    @Column(name="street_address")
    private String streetAddress;

    @Column(name="locality")
    private String locality;

    @Column(name="region")
    private String region;

    @Column(name="postal_code")
    private String postalCode;

    @Column(name="phone")
    private String phone;

    @Column(name="website")
    private String website;

    @Column(name="latitude")
    private double latitude;

    @Column(name="longitude")
    private double longitude;

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
