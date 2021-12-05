
public class Main {

	public static void main(String[] args) {
		
		Player player1 = new Player(1, "Fýrat", "Turan", 1995, "12345678901");
		
		PlayerManager playerManager = new PlayerManager(new PlayerCheckManager());
		
		playerManager.register(player1);
		playerManager.remove(player1);
		playerManager.update(player1);
		
		Product playStation = new Product(1, "PlayStation", 8700);
		
		Campaign campaign = new Campaign("Muhteþem Cuma", 20);
		
		SalesManager salesManager = new SalesManager(campaign);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addCampaign(playStation, campaign);
		campaignManager.updateCampaign(playStation, campaign, "Þahane Salý", 25);	
		
		salesManager.buy(player1, playStation);	
		
		campaignManager.removeCampaign(playStation, campaign); 
		
		salesManager.buy(player1, playStation);
	}
	

}
