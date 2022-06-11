package hu.progmatic;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        try {

            int evszam = 0;

            List<Matches> dontok = new ArrayList<>();

            try (BufferedReader reader = new BufferedReader(new FileReader("matches_all.txt"))) {
                String sor;

                reader.readLine();

                while ((sor = reader.readLine()) != null) {
                    Matches donto = new Matches(sor);
                    dontok.add(donto);
                }

                System.out.println("1.Number of matches: " + dontok.size());

                System.out.println("Year of worldcup:");
                Scanner scanner = new Scanner(System.in);
                evszam = Integer.parseInt(scanner.nextLine());

                int max = Integer.MIN_VALUE;

                for (Matches goldif : dontok) {
                    int sum = 0;
                    if (goldif.getYear() == evszam) {
                        sum = Math.abs(goldif.getGoals_a() - goldif.getGoals_b());
                        if (sum > max) {
                            max = sum;
                        }
                        try (PrintWriter writer = new PrintWriter("selected.csv")) {
                            writer.println("stage;date;team_a;team_b;goals_a;goals_b;penalties_a;penalties_b");
                            for (Matches mats : dontok) {
                                if (mats.getYear() == evszam) {
                                    writer.write(mats.getStage() + ";" +
                                            mats.getDate() + ";" + mats.getTeam_a() + ";"
                                            + mats.getTeam_b() + ";" +
                                            mats.getGoals_a() + ";" + mats.getGoals_b() + "\n");
                                }
                            }
                        }
                    }
                }
                System.out.println("2.Maximum goals different:" + max);
            }

            int sum = 0;

            for (Matches bitwin : dontok) {
                if (bitwin.getYear() == evszam)
                    if (bitwin.getGoals_a() > bitwin.getGoals_b())
                        sum++;
            }
            System.out.println("3.The Player has won " + sum + " bets");
            System.out.println("4. Total goals by stage");
            Map<String,Integer> fullgoals = new LinkedHashMap<>();
            for (Matches mat: dontok) {
                if (mat.getYear()==evszam){
                    int count = fullgoals.getOrDefault(mat.getStage(),0);
                    fullgoals.put(mat.getStage(),count+(mat.getGoals_a())+mat.getGoals_b());
                }
            }
            for(String stage : fullgoals.keySet()) {
                System.out.println(stage + ": " + fullgoals.get(stage));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}