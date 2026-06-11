package Task8App.demo.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;
import java.util.List;

@Data
//@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Campaign")
public class Campaign {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int campaignId;

    private String campaignName;
    private String platform;
    private double budget;

    @OneToMany(mappedBy = "campaign")
    @JsonIgnore
    private List<Vehicle> vehicles;

    /*public Campaign(int campaignId, String campaignName, String platform, double budget) {
        this.campaignId = campaignId;
        this.campaignName = campaignName;
        this.platform = platform;
        this.budget = budget;
    }*/
}
