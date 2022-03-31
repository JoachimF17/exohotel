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
@Table(name = "hotel")
public class Hotel
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hotel_id", nullable = false)
    private Long id;

    @Column(name = "hotel_etoiles", nullable = false)
    private int nbEtoiles;

    @Column(name = "hotel_nom", nullable = false, length = 50)
    private String nom;

    @Column(name = "hotel_adresse", nullable = false)
    private String adresse;
}