package be.technifutur.exohotel.repositories;

import be.technifutur.exohotel.models.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Long>
{
}
