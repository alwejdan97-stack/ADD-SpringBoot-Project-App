package Interfaces;

import Entities.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampaignInterface extends JpaRepository<Campaign,Integer> {
}
