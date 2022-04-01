package be.technifutur.exohotel.models.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "chambre")
public class Chambre
{
    @Id
    @Column(name = "chambre_num", nullable = false, columnDefinition = "INT(11)")
    private Long id;

    @Column(name = "chambre_a_tele", nullable = false)
    private boolean aTele;

    @Column(name = "chambre_a_cuisine", nullable = false)
    private boolean aCuisine;

    @Column(name = "chambre_a_minibar", nullable = false)
    private boolean aMinibar;

    @Column(name = "prix", nullable = false)
    private double prix;

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;

    @ManyToMany(mappedBy = "chambres")
    private List<Client> clients;
}