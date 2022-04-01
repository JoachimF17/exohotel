package be.technifutur.exohotel.repositories;

import be.technifutur.exohotel.models.entities.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChambreRepository extends JpaRepository<Chambre, Long>
{
}
