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
@Table(name = "gerant")
public class Gerant
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gerant_id", nullable = false)
    private Long id;

    @Column(name = "gerant_nom", nullable = false, length = 50)
    private String nom;

    @Column(name = "gerant_prenom", nullable = false, length = 50)
    private String prenom;

}