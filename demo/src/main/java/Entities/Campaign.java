package Entities;

public class Campaign {
    private int campaignId;
    private String campaignName;
    private String platform;
    private double budget;

    public Campaign(int campaignId, String campaignName, String platform, double budget) {
        this.campaignId = campaignId;
        this.campaignName = campaignName;
        this.platform = platform;
        this.budget = budget;
    }


}
