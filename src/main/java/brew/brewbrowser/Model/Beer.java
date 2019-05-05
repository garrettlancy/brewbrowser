package brew.brewbrowser.Model;

import javax.persistence.*;

@Entity
@Table(name="beers", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
                "name"
        }),
        @UniqueConstraint(columnNames = {
                "beer_id"
        })
})
public class Beer {

    @Id
    @Column(name="beer_id")
    private String beerId;

    @Column(name="name")
    private String name;

    @Column(name="abv")
    private String abv;

    @Column(name="style_name")
    private String styleName;

    @Column(name="style_description")
    private String styleDescription;

    @Column(name="label_icon")
    private String labelIcon;

    @Column(name="label_image")
    private String labelImage;

    public String getBeerId() {
        return beerId;
    }

    public void setBeerId(String beerId) {
        this.beerId = beerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbv() {
        return abv;
    }

    public void setAbv(String abv) {
        this.abv = abv;
    }

    public String getStyleName() {
        return styleName;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }

    public String getStyleDescription() {
        return styleDescription;
    }

    public void setStyleDescription(String styleDescription) {
        this.styleDescription = styleDescription;
    }

    public String getLabelIcon() {
        return labelIcon;
    }

    public void setLabelIcon(String labelIcon) {
        this.labelIcon = labelIcon;
    }

    public String getLabelImage() {
        return labelImage;
    }

    public void setLabelImage(String labelImage) {
        this.labelImage = labelImage;
    }
}
