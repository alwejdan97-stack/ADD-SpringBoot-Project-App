package DemoApp;

import Entities.Campaign;

import java.util.HashMap;
import java.util.Map;

public class CampaignManager {
    public static Map<Integer, Campaign> campaignMap=new HashMap<>();
    public static void main(String[] args){
        campaignMap.put(101, new Campaign(101, "Summer Sale", "Instagram", 500.00));
        campaignMap.put(202, new Campaign(202, "Black Friday", "Google Ads", 2500.50));
        campaignMap.put(303, new Campaign(303, "Brand Awareness", "TikTok", 1200.00));
        campaignMap.put(404, new Campaign(404, "App Installs", "Facebook", 850.75));

        System.out.println("\n*** Display Existing Campaign ***");
        if (campaignMap.isEmpty()){
            System.out.println("NO Campaign In The List, FAILD To Display");
        }else {
            for (Campaign c : campaignMap.values()) {
                System.out.println("Campaign ID: " + c.getCampaignId() + " | Campaign Name: " + c.getCampaignName() + " | Platform: " + c.getPlatform() + " | Budget:" + c.getBudget());
            }
        }

        System.out.println("\n*** Adding New Campaign ***");
        Campaign newCampaign=new Campaign(101, "Summer Sale", "Instagram", 500.00);
        addCampaign(newCampaign);

        System.out.println("\n*** Display Updated Campaign List ***");
        if (campaignMap.isEmpty()){
            System.out.println("NO Campaign In The List, FAILD To Display");
        }else{
            for(Campaign c:campaignMap.values()){
                System.out.println("Campaign ID: "+c.getCampaignId()+" | Campaign Name: "+ c.getCampaignName()+ " | Platform: "+c.getPlatform()+" | Budget:"+c.getBudget());
            }
        }
    }

    public static void addCampaign(Campaign newCampaign) {
        if (campaignMap.containsKey(newCampaign.getCampaignId())) {
            System.out.println("Campaign ID Is Already Exist, Adding NOT Perform...");
        } else {
            campaignMap.put(newCampaign.getCampaignId(), newCampaign);
            System.out.println("New Campaign Added Successfully... ");
            System.out.println("Campaign ID: " + newCampaign.getCampaignId() + " | Campaign Name: " + newCampaign.getCampaignName() + " | Platform: " + newCampaign.getPlatform() + " | Budget:" + newCampaign.getBudget());
        }
    }
}
