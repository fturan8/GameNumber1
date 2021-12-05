
public class CampaignManager implements ICampaignManager{
	double newPrice;

	@Override
	public void addCampaign(Product product, Campaign campaign) {
		newPrice = product.price - product.price*campaign.discount/100;
		System.out.println(product.productName + " ürününe " + campaign.campaignName + " kampanyasý ile %" + campaign.discount + " indirim uygulandý");
		System.out.println(product.productName + " ürünün yeni fiyatý: " + newPrice);
		
	}

	@Override
	public void updateCampaign(Product product, Campaign campaign, String newCampaign, double discount) {
		campaign.setCampaignName(newCampaign);
		campaign.setDiscount(discount);
		newPrice = product.price - product.price*campaign.discount/100;
		System.out.println("Kampanya deðiþtirildi");
		System.out.println(product.productName + " ürününe " + campaign.campaignName + " kampanyasý ile %" + discount + " indirim uygulandý");
		System.out.println(product.productName + " ürünün yeni fiyatý: " + newPrice);
						
	}

	@Override
	public void removeCampaign(Product product, Campaign campaign) {
		System.out.println(product.productName + " ürününden " + campaign.campaignName + " kampanyasý kaldýrýldý." );
		System.out.println(product.productName + " ürününün fiyatý: " + product.price );
		campaign.setCampaignName("");
		campaign.setDiscount(0);		
		
	}

	
}
