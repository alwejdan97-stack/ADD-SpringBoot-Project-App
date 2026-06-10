package Task8App.demo.Interfaces;

import Task8App.demo.Entities.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CampaignInterface extends JpaRepository<Campaign,Integer> {
    //@Query("SELECT C FROM Campagin C")
    void deleteById(@Param("id") Integer campaignId);

}
