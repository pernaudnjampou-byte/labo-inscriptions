package cm.laboacademy.inscriptions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FraisReductionTest {

    private final FraisInscription frais = new FraisInscription();

    @Test
    void inscriptionAnticipeeReduitDeDixPourCent() {
        assertEquals(45000, frais.calculer("L2", false, true));
    }

    @Test
    void reductionSAjouteALaBourse() {
        assertEquals(22500, frais.calculer("L1", true, true));
    }

    @Test
    void sansAnticipationPasDeReduction() {
        assertEquals(50000, frais.calculer("L2", false, false));
    }
}
