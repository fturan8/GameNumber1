
public class Campaign {
	
	String campaignName = "";
	double discount = 0;
	
	public Campaign(String campaignName, double discount) {
		this.campaignName = campaignName;
		this.discount = discount;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

}
