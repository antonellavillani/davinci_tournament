import java.util.Date;

public class Main {
    public static void main(String[] args) {
    System.out.println("Da Vinci Tournament");

        torneoDaVinci.setName();
        Date comienzoDeCursada = new Date();
        comienzoDeCursada.setYear(2022);
        comienzoDeCursada.setMonth(7); //Enero 0, Agosto 7
        comienzoDeCursada.setDate(18);
        torneoDaVinci.setStartDate(comienzoDeCursada);
        Date finDeCursada = new Date();
        finDeCursada.setYear(2022);
        finDeCursada.setMonth(11); //Enero 0, Dic 11
        finDeCursada.setDate(5);
        torneoDaVinci.setEndDate(finDeCursada);

        Season torneoDaVinci = new Season("Torneo 2022, 2do cuatri",comienzoDeCursada,finDeCursada);
    }
}
