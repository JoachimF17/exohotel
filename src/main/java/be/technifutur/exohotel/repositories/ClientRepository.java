package be.technifutur.exohotel.repositories;

import be.technifutur.exohotel.models.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long>
{
}
