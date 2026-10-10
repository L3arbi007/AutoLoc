package tn.esprit.AutoLoc.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contrat {
    @OneToOne
    @jakarta.persistence.JoinColumn(name = "id_reservation", unique = true)
    private Reservation reservation;

    @OneToOne(mappedBy = "contrat")
    private Paiement paiement;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat;

    private LocalDate dateSignature;

    private BigDecimal montantTotal;

    private boolean valide;
}