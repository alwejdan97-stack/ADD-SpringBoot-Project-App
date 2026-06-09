package Entities;

import jakarta.persistence.*;
import lombok.*;

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

    /*public Campaign(int campaignId, String campaignName, String platform, double budget) {
        this.campaignId = campaignId;
        this.campaignName = campaignName;
        this.platform = platform;
        this.budget = budget;
    }*/
}
