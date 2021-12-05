
public interface ICampaignManager {
	void addCampaign(Product product, Campaign campaign);
	void updateCampaign(Product product, Campaign campaign, String newCampaign, double discount);
	void removeCampaign(Product product, Campaign campaign);
}
