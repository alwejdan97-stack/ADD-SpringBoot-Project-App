package Task8App.demo.Interfaces;

import Task8App.demo.Entities.Campaign;
import Task8App.demo.Entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CampaignInterface extends JpaRepository<Campaign,Integer> {
    Campaign saveCampaign(Campaign campaign);

    List<Campaign> getAllCampaigns();

    Campaign getById(Integer id);

    String getNameById(Integer id);
}
