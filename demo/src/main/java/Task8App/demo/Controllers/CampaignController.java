package Task8App.demo.Controllers;

import Task8App.demo.Entities.Campaign;

import Task8App.demo.Services.CampaignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class CampaignController {
    @Autowired
    CampaignService campaignService;

    @GetMapping("/displayCampaign")
    public Collection<Campaign> displayCampaign() {

        return campaignService.displayCampaign();
    }

    @GetMapping("/displayUpdatedCampaign")
    public Collection<Campaign> displayUpdatedCampaign() {
        return campaignService.displayUpdatedCampaign();
    }

    @PostMapping("/addCampaign")
    public Campaign addCampaign(@RequestBody Campaign newCampaign) {
        return campaignService.addCampaign(newCampaign);
    }
}
