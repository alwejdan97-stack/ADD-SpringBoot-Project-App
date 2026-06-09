package Task8App.demo.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name="Campaign")
public class Campaign {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int campaignId;

    private String campaignName;
    private String platform;
    private double budget;

    @OneToMany(mappedBy = "campaign")
    private Collection<Vehicle> vehicles;

    public Campaign(int campaignId, String campaignName, String platform, double budget) {
        this.campaignId = campaignId;
        this.campaignName = campaignName;
        this.platform = platform;
        this.budget = budget;
    }
}
