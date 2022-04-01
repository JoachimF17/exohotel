package be.technifutur.exohotel;

import be.technifutur.exohotel.models.entities.Chambre;
import be.technifutur.exohotel.models.entities.Client;
import be.technifutur.exohotel.models.entities.Gerant;
import be.technifutur.exohotel.models.entities.Hotel;
import be.technifutur.exohotel.repositories.ChambreRepository;
import be.technifutur.exohotel.repositories.ClientRepository;
import be.technifutur.exohotel.repositories.GerantRepository;
import be.technifutur.exohotel.repositories.HotelRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class ExohotelApplication {

	public static void main(String[] args)
	{
		ApplicationContext context = SpringApplication.run(ExohotelApplication.class, args);

		ChambreRepository chambreRepository = context.getBean(ChambreRepository.class);
		ClientRepository clientRepository = context.getBean(ClientRepository.class);
		GerantRepository gerantRepository = context.getBean(GerantRepository.class);
		HotelRepository hotelRepository = context.getBean(HotelRepository.class);

		Hotel hotel = new Hotel(
				0L,
				3,
				"Mon hotel",
				"Rue de l'hotel 17",
				null,
				null
		);

		Gerant gerant = new Gerant(
				0L,
				"Dupont",
				"Toto",
				LocalDate.of(1993, 6, 30),
				null
		);

		Chambre chambre = new Chambre(
				45L,
				true,
				false,
				true,
				45.17,
				null,
				null
		);

		Chambre chambre1 = new Chambre(
				22L,
				true,
				false,
				true,
				22.17,
				null,
				null
		);

		Client client = new Client(
				0L,
				"Dupond",
				"Test",
				null
		);

		hotel = hotelRepository.save(hotel);
		chambre = chambreRepository.save(chambre);
		chambre1 = chambreRepository.save(chambre1);
		client = clientRepository.save(client);
		gerant = gerantRepository.save(gerant);

		chambre.setHotel(hotel);
		chambre1.setHotel(hotel);
		hotel.setChambres(List.of(chambre, chambre1));
		client.setChambres(List.of(chambre, chambre1));
		chambre.setClients(List.of(client));
		chambre1.setClients(chambre.getClients());
		hotel.setGerant(gerant);
		gerant.setHotel(hotel);

		hotelRepository.save(hotel);
		chambreRepository.save(chambre);
		chambreRepository.save(chambre1);
		clientRepository.save(client);
		gerantRepository.save(gerant);
	}

}
