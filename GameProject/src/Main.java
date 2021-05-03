import com.adapter.MersisServiceAdapter;
import com.concrete.CampaignManager;
import com.concrete.GameManager;
import com.concrete.OrderManager;
import com.concrete.UserManager;
import com.entities.Campaign;
import com.entities.Game;
import com.entities.User;

public class Main {

	public static void main(String args[]) throws Exception {

		User user1 = new User();
		user1.setId(1);
		user1.setFirstName("SEÇKİN EMRE");
		user1.setLastName("BAKIR");
		user1.setDateOfBirth(1998);
		user1.setNationalityId(17495041326L);

		UserManager manager = new UserManager(new MersisServiceAdapter());
		manager.add(user1);

		System.out.println("*********************");

		Game game1 = new Game(1, "Cs-Go", 20);
		GameManager gameManager1 = new GameManager();
		gameManager1.add(game1);

		System.out.println("*********************");

		Campaign campaign1 = new Campaign(1, "Hoşgeldin Kampanyası", 0.5);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);

		System.out.println("*********************");

		OrderManager orderManager = new OrderManager();
		orderManager.campWithSale(user1, game1, campaign1);
		orderManager.campWithoutSale(user1, game1);
	}
}
