
public class PlayerManager implements IPlayerManager{
	
	private IPlayerCheckManager playerCheckmanager;
	
	public PlayerManager (IPlayerCheckManager playerCheckManager) {
		this.playerCheckmanager = playerCheckManager;
	}
	

	@Override
	public void register(Player player) {
		if(playerCheckmanager.isRealPerson(player)) {
			System.out.println("Oyuncu kaydedildi: " + player.firstName);
		}else {
			System.out.println("Oyuncu Bilgisi Doðrulanamadý: " + player.firstName);
		}
		
	}

	@Override
	public void remove(Player player) {
		System.out.println("Oyuncu silindi: " + player.firstName);
		
	}

	@Override
	public void update(Player player) {
		System.out.println("Oyuncu bilgisi güncellendi: " + player.firstName);
	}

	

}
