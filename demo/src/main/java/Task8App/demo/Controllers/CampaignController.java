package Task8App.demo.Controllers;

import Task8App.demo.Entities.Campaign;

import Task8App.demo.Services.CampaignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
public class CampaignController {
    @Autowired
    CampaignService campaignService;

    @PostMapping("saveCampaign")
    public Campaign saveCampaign(Campaign campaign){
        return campaignService.saveCampaign(campaign);
    }

    @GetMapping("getAllCampaigns")
    public List<Campaign> getAllCampaigns() {
        return campaignService.getAllCampaigns();
    }

    @GetMapping("getById")
    public Campaign getById(Integer id){
        return campaignService.getById(id);
    }

    @GetMapping("getNameById")
    public String getNameById(Integer id){
        return campaignService.getNameById(id);
    }

    @PutMapping("updateEmployee")
    public Campaign updateEmployee(Integer id,String name){
        return campaignService.updateEmployee(id,name);
    }

    @DeleteMapping("deleteCampaign")
    public String deleteCampaign(Integer id){
        return campaignService.deleteCampaign(id);
    }
}
