
public class CampaignManager implements ICampaignManager{
	double newPrice;

	@Override
	public void addCampaign(Product product, Campaign campaign) {
		newPrice = product.price - product.price*campaign.discount/100;
		System.out.println(product.productName + " �r�n�ne " + campaign.campaignName + " kampanyas� ile %" + campaign.discount + " indirim uyguland�");
		System.out.println(product.productName + " �r�n�n yeni fiyat�: " + newPrice);
		
	}

	@Override
	public void updateCampaign(Product product, Campaign campaign, String newCampaign, double discount) {
		campaign.setCampaignName(newCampaign);
		campaign.setDiscount(discount);
		newPrice = product.price - product.price*campaign.discount/100;
		System.out.println("Kampanya de�i�tirildi");
		System.out.println(product.productName + " �r�n�ne " + campaign.campaignName + " kampanyas� ile %" + discount + " indirim uyguland�");
		System.out.println(product.productName + " �r�n�n yeni fiyat�: " + newPrice);
						
	}

	@Override
	public void removeCampaign(Product product, Campaign campaign) {
		System.out.println(product.productName + " �r�n�nden " + campaign.campaignName + " kampanyas� kald�r�ld�." );
		System.out.println(product.productName + " �r�n�n�n fiyat�: " + product.price );
		campaign.setCampaignName("");
		campaign.setDiscount(0);		
		
	}

	
}
