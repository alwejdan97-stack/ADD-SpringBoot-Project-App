package Services;

import Entities.Campaign;

import java.util.HashMap;
import java.util.Map;

public class CampaignManager {
    public static Map<Integer, Campaign> campaignMap=new HashMap<>();
    public static void main(String[] args){
        campaignMap.put(101,new Campaign(101, "Summer Sale", "Instagram", 500.00));
        campaignMap.put(202, new Campaign(202, "Black Friday", "Google Ads", 2500.50));
        campaignMap.put(303, new Campaign(303, "Brand Awareness", "TikTok", 1200.00));
        campaignMap.put(404, new Campaign(404, "App Installs", "Facebook", 850.75)):
    }
}
