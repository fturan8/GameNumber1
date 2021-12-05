
public class SalesManager implements ISalesManager{
	
	private Campaign campaign;
	public SalesManager (Campaign campaign) {
		this.campaign = campaign;
					
	}
	
	@Override
	public void buy(Player player, Product product) {
		System.out.println(player.firstName + ", " + product.productName + " satýn aldý. " + campaign.campaignName + " " + (product.price - product.price*campaign.discount/100));
				
	}


	
}
