public class Auto {

    int maxPassagiere = 5;
    int aktuellePassagiere = 0;
    int befoerdertePassagiereInsgesamt = 0;

    public void einsteigen() {
        if (aktuellePassagiere < maxPassagiere) {
            aktuellePassagiere++;
            befoerdertePassagiereInsgesamt++;
        } else {
            System.out.println("Das Auto ist leider voll!");
        }
    }

    public void aussteigen() {
        if (aktuellePassagiere > 0) {
            aktuellePassagiere--;
        }
        if (aktuellePassagiere == 0) {
            System.out.println("Das Auto ist Leer");
        }
    }

    public void befoerdertePassagiereInsgesamt() {
        System.out.println("befoerdertePassagiere: " + befoerdertePassagiereInsgesamt);
    }

    public void farbe(String farbe){
        switch (farbe){
            case "Bordeaux":
                System.out.println("Tolles rot!");
                break;
            case "Kobalt":
                System.out.println("Schönes Blau");
                break;
            default:
                System.out.println("Unbekannte Farbe");
        }
    }

        public static void main(String[] args){
        Auto meinAuto = new Auto();

        meinAuto.einsteigen();
        meinAuto.einsteigen();
        meinAuto.einsteigen();

        meinAuto.aussteigen();

        meinAuto.befoerdertePassagiereInsgesamt();

        meinAuto.farbe("Bordeaux");
        }
    }