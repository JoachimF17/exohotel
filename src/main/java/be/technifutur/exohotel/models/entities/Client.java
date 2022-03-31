package be.technifutur.exohotel.models.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "client")
public class Client
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id", nullable = false)
    private Long id;

    @Column(name = "client_nom", nullable = false, length = 50)
    private String nom;

    @Column(name = "client_prenom", nullable = false, length = 50)
    private String prenom;

}