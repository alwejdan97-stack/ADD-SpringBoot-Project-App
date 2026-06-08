package Services;

import Entities.Campaign;
import Entities.Vehicle;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import static org.apache.logging.log4j.ThreadContext.containsKey;

public class CampaignController {
    public Map<Integer, Campaign> campaignMap = new HashMap<>();

    public CampaignController() {
        campaignMap.put(101, new Campaign(101, "Summer Sale", "Instagram", 500.00));
        campaignMap.put(202, new Campaign(202, "Black Friday", "Google Ads", 2500.50));
        campaignMap.put(303, new Campaign(303, "Brand Awareness", "TikTok", 1200.00));
        campaignMap.put(404, new Campaign(404, "App Installs", "Facebook", 850.75));
    }

    @GetMapping("displayCampaign")
    public Collection<Campaign> displayCampaign() {
        System.out.println("\n*** Display Existing Campaign ***");
        for (Campaign c : campaignMap.values()) {
            System.out.println("Campaign ID: " + c.getCampaignId() + " | Campaign Name: " + c.getCampaignName() + " | Platform: " + c.getPlatform() + " | Budget:" + c.getBudget());
        }
        return campaignMap.values();
    }

    @GetMapping("displayUpdatedCampaign")
    public Collection<Campaign> displayUpdatedCampaign() {
        System.out.println("\n*** Display Updated Campaign List ***");
        for (Campaign c : campaignMap.values()) {
            System.out.println("Campaign ID: " + c.getCampaignId() + " | Campaign Name: " + c.getCampaignName() + " | Platform: " + c.getPlatform() + " | Budget:" + c.getBudget());
        }
        return campaignMap.values();
    }

    @PostMapping("addCampaign")
    public String addCampaign(@RequestBody Campaign newCampaign) {
        if (campaignMap.containsKey(newCampaign.getCampaignId())) {
            String duplicateCampaign = "Campaign ID Is Already Exist, Adding NOT Perform...";
            return duplicateCampaign;
        }else {
            campaignMap.put(newCampaign.getCampaignId(), newCampaign);
            System.out.println("New Campaign Added Successfully... ");
            System.out.println("Campaign ID: " + newCampaign.getCampaignId() + " | Campaign Name: " + newCampaign.getCampaignName() + " | Platform: " + newCampaign.getPlatform() + " | Budget:" + newCampaign.getBudget());
            return "New Campaign Added Successfully: " + newCampaign.getCampaignId();

        }
    }
}
