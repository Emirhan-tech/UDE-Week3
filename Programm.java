public class Programm {

    public Programm() {
        System.out.println(Stringverbinde("Hallo ", "Welt"));
        System.out.println(aIstGleichB("Hallo", "Hallo"));
        System.out.println(aIstKleinerAlsB("Apfel", "Banane"));
        System.out.println(holeZeichenAnPosition("Hallo", 2));
        System.out.println(ersetzeMitte("Hallo-a-Welt", '-'));
        System.out.println(addition(10, 5));
        System.out.println(subtraktion(10, 5));
        System.out.println(multiplikation(10, 5));
        System.out.println(quersumme(349));
        System.out.println(millionaer(100000, 5));
    }

    public String Stringverbinde(String a, String b){
        return a + b;
    }
    public boolean aIstGleichB(String a, String b) {
        return a.equals(b);
    }
    public boolean aIstKleinerAlsB(String a, String b) {
        return a.compareTo(b) < 0;
    }
    public char holeZeichenAnPosition(String input, int position) {
        return input.charAt(position);
    }
    public String ersetzeMitte(String input, char trenner) {
        int anfang = input.indexOf(trenner), ende = input.lastIndexOf(trenner); //indexOf() sucht das erste Vorkommen eines Zeichens. lastIndexOf() sucht das letzte Vorkommen eines Zeichens.
        if (anfang != -1 && ende != -1 && anfang != ende) { //Wenn Java ein Zeichen mit indexOf() nicht findet, gibt es -1 zurück.
            return input.substring(0, anfang) + input.substring(anfang + 1, ende).replace('a', 'X') + input.substring(ende + 1);
        }
        return input; //Diese Zeile wird ausgeführt, wenn die if Bedingung nicht erfüllt ist.
    }
    public int addition(int a, int b){
        return a + b;
    }
    public int subtraktion(int a, int b){
        return a - b;
    }
    public int multiplikation(int a, int b){
        return a * b;
    }
    public int quersumme(int a) {
        int summe = 0; a = Math.abs(a); //Math.abs() macht eine negative Zahl positiv.
        while (a > 0) { summe += a % 10; a /= 10; } //a % 10 → Holt die letzte Ziffer heraus. a / 10 → Entfernt die letzte Ziffer.
        return summe;
    }
    public int millionaer(double startkapital, double zinssatz) {
        int jahre = 0; double kapital = startkapital;
        while (kapital < 1000000.0) { kapital += kapital * (zinssatz / 100.0); jahre++; }
        return jahre;
    }
    public static void main(String[] args) {
        Programm p = new Programm();
    }
}