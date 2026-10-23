package cm.laboacademy.inscriptions;

public class FraisInscription {

    public int calculer(String niveau, boolean boursier) {
        return calculer(niveau, boursier, false);
    }

    public int calculer(String niveau, boolean boursier, boolean anticipee) {
        int frais = switch (niveau) {
            case "L1", "L2", "L3" -> 50000;
            case "M1", "M2" -> 75000;
            default -> throw new IllegalArgumentException("Niveau inconnu : " + niveau);
        };
        if (boursier) {
            frais = frais / 2;
        }
        if (anticipee) {
            frais = frais * 9 / 10;
        }
        return frais;
    }
}
