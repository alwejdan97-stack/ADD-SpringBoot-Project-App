package Services;

import Entities.Campaign;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class CampaignService {
    public Map<Integer, Campaign> campaignMap = new HashMap<>();

    public CampaignService() {
        campaignMap.put(101, new Campaign(101, "Summer Sale", "Instagram", 500.00));
        campaignMap.put(202, new Campaign(202, "Black Friday", "Google Ads", 2500.50));
        campaignMap.put(303, new Campaign(303, "Brand Awareness", "TikTok", 1200.00));
        campaignMap.put(404, new Campaign(404, "App Installs", "Facebook", 850.75));
    }


    public Collection<Campaign> displayCampaign() {
        return campaignMap.values();
    }

    public Collection<Campaign> displayUpdatedCampaign() {
        System.out.println("\n*** Display Updated Campaign List ***");
        for (Campaign c : campaignMap.values()) {
            System.out.println("Campaign ID: " + c.getCampaignId() + " | Campaign Name: " + c.getCampaignName() + " | Platform: " + c.getPlatform() + " | Budget:" + c.getBudget());
        }
        return campaignMap.values();
    }

    public String addCampaign(Campaign newCampaign) {
        if (campaignMap.containsKey(newCampaign.getCampaignId())) {
            return "Campaign ID Is Already Exist, Adding NOT Perform...";
        } else {
            campaignMap.put(newCampaign.getCampaignId(), newCampaign);
            System.out.println("New Campaign Added Successfully... ");
            return "Campaign ID: " + newCampaign.getCampaignId() + " | Campaign Name: " + newCampaign.getCampaignName() + " | Platform: " + newCampaign.getPlatform() + " | Budget:" + newCampaign.getBudget();
        }
    }
}
