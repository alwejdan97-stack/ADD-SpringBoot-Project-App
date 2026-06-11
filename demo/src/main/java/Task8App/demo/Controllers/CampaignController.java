package Task8App.demo.Controllers;

import Task8App.demo.Entities.Campaign;
import Task8App.demo.Services.CampaignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/campaigns")
public class CampaignController {
    @Autowired
    CampaignService campaignService;

    @PostMapping("/saveCampaign")
    public Campaign saveCampaign(@RequestBody Campaign campaign){
        return campaignService.saveCampaign(campaign);
    }

    @GetMapping("/getAllCampaigns")
    public List<Campaign> getAllCampaigns() {
        return campaignService.getAllCampaigns();
    }

    @GetMapping("/getById/{id}")
    public Campaign getById(@PathVariable Integer id){
        return campaignService.getById(id);
    }

    @GetMapping("/getNameById/{id}")
    public String getNameById(@PathVariable Integer id){
        return campaignService.getNameById(id);
    }

    @PutMapping("/updateCampaign/{id}")
    public Campaign updateCampaign(@PathVariable Integer id,@RequestParam String name){
        return campaignService.updateCampaign(id,name);
    }

    @DeleteMapping("/deleteCampaign/{id}")
    public Boolean deleteCampaign(@PathVariable Integer id){
        return campaignService.deleteCampaign(id);
    }
}
