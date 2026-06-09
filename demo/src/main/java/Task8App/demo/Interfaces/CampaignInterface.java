package Task8App.demo.Interfaces;

import Task8App.demo.Entities.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampaignInterface extends JpaRepository<Campaign,Integer> {
}
