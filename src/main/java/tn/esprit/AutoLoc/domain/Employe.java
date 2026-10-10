package tn.esprit.AutoLoc.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employe {
    @ManyToOne
    @JoinColumn(name = "id_agence")
    private Agence agence;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmployee;

    private String nom;

    private String prenom;

    @Enumerated(EnumType.STRING)
    private RoleEmploye role;


}