package Task8App.demo.Services;

import Task8App.demo.Entities.Campaign;
import Task8App.demo.Entities.Employee;
import Task8App.demo.Entities.Vehicle;
import Task8App.demo.Interfaces.CampaignInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CampaignService {

    //MySQL
    @Autowired
    CampaignInterface campaignRepository;

    public Campaign saveCampaign(Campaign campaign){
        return campaignRepository.saveCampaign(campaign);
    }

    public List<Campaign> getAllCampaigns() {
        return campaignRepository.getAllCampaigns();
    }

    public Campaign getById(Integer id){
        return campaignRepository.getById(id);
    }

    public String getNameById(Integer id){
        return campaignRepository.getNameById(id);
    }

    public Campaign updateEmployee(Integer id,String name){
        Campaign campaign=campaignRepository.findById(id).get();
        if(!campaign.getCampaignName().equals(name)){
            campaign.setCampaignName(name);
        }
        return campaignRepository.saveCampaign(campaign);
    }

    public String deleteCampaign(Integer id){
        if(!campaignRepository.existsById(id)){
            return "ID NOT Found...";
        }else{
            Campaign campaign=campaignRepository.findById(id).get();
            campaignRepository.saveCampaign(campaign);
            return "DELETED...";
        }
    }

    //code for service class
    public Map<Integer, Campaign> campaignMap = new HashMap<>();

    public CampaignService() {
        campaignMap.put(101, new Campaign(101, "Summer Sale", "Instagram", 500.00));
        campaignMap.put(202, new Campaign(202, "Black Friday", "Google Ads", 2500.50));
        campaignMap.put(303, new Campaign(303, "Brand Awareness", "TikTok", 1200.00));
        campaignMap.put(404, new Campaign(404, "App Installs", "Facebook", 850.75));
    }

    public List<Campaign> displayCampaign() {
        return campaignMap.values().stream().toList();
    }

    public List<Campaign> displayUpdatedCampaign() {
        System.out.println("\n*** Display Updated Campaign List ***");
        for (Campaign c : campaignMap.values()) {
            System.out.println("Campaign ID: " + c.getCampaignId() + " | Campaign Name: " + c.getCampaignName() + " | Platform: " + c.getPlatform() + " | Budget:" + c.getBudget());
        }
        return campaignMap.values().stream().toList();
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
