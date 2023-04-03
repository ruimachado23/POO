package avaliacao1;
import java.util.Random;
import java.util.Scanner;

public class Combat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Fighter[] fighters = new Fighter[10];

        int count = 0;

        while (true) {

            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Gerar lutadores aleatoriamente");
            System.out.println("2 - Combate entre dois lutadores escolhidos");
            System.out.println("3 - Combate entre dois lutadores aleatórios");
            System.out.println("4 - Sair");

            int choice = scanner.nextInt();

            if (choice == 1) {

                if (count < fighters.length) {
                    int type = random.nextInt(2);
                    String name = "Fighter " + (count + 1);
                    if (type == 0) {
                        int range = random.nextInt(10) + 1;
                        fighters[count] = new Boxer(name, range);
                        System.out.println(name + " (Boxer) gerado");
                    } else {
                        int speed = random.nextInt(10) + 1;
                        fighters[count] = new Wrestler(name, speed);
                        System.out.println(name + " (Wrestler) gerado");
                    }
                    count++;

                } else {
                    System.out.println("Não é possível gerar mais lutadores, capacidade máxima atingida");
                }

            } else if (choice == 2) {
                if (count < 2) {
                    System.out.println("É necessário pelo menos dois lutadores para iniciar um combate");

                } else {
                    System.out.println("\nSelecione dois Fighters para o combate:");

                    for (int i = 0; i < count; i++) {
                        System.out.println((i + 1) + " - " + fighters[i].getName());
                    }

                    int fighter1Index = scanner.nextInt() - 1;
                    int fighter2Index = scanner.nextInt() - 1;

                    if (fighter1Index >= 0 && fighter1Index < count && fighter2Index >= 0 && fighter2Index < count && fighter1Index != fighter2Index) {
                        Fighter fighter1 = fighters[fighter1Index];
                        Fighter fighter2 = fighters[fighter2Index];
                        System.out.println("Combate entre " + fighter1.getName() + " e " + fighter2.getName() + " :\n");

                        while (fighter1.isAlive() && fighter2.isAlive()) {
                            int attackerIndex = random.nextInt(2);
                            int defenderIndex = 1 - attackerIndex;
                            Fighter attacker = attackerIndex == 0 ? fighter1 : fighter2;
                            Fighter defender = defenderIndex == 0 ? fighter1 : fighter2;
                            attacker.attack(defender);
                        }

                        Fighter winner = fighter1.isAlive() ? fighter1 : fighter2;
                        Fighter loser = fighter1.isAlive() ? fighter2 : fighter1;

                        System.out.println("\n---> " + winner.getName() + " ganhou o combate!");
                        
                        winner.addVictory();
                        loser.addDefeat();

                        System.out.println(winner.getName() + ": " + winner.getVictories() + " vitórias e " + winner.getDefeats() + " derrotas");
                        System.out.println(loser.getName() + ": " + loser.getVictories() + " vitórias e " + loser.getDefeats() + " derrotas");

                    } else {
                        System.out.println("Seleção inválida!");
                    }
                }

            } else if (choice == 3){
                if (count < 2) {
                    System.out.println("É necessário pelo menos dois lutadores para iniciar um combate");

                } else {
                    int fighter1Index = random.nextInt(count);
                    int fighter2Index = random.nextInt(count);

                    while (fighter1Index == fighter2Index) {
                        fighter2Index = random.nextInt(count);
                    }

                    Fighter fighter1 = fighters[fighter1Index];
                    Fighter fighter2 = fighters[fighter2Index];
                    System.out.println("Combate entre " + fighter1.getName() + " e " + fighter2.getName() + " :\n");

                    while (fighter1.isAlive() && fighter2.isAlive()) {
                        int attackerIndex = random.nextInt(2);
                        int defenderIndex = 1 - attackerIndex;
                        Fighter attacker = attackerIndex == 0 ? fighter1 : fighter2;
                        Fighter defender = defenderIndex == 0 ? fighter1 : fighter2;
                        attacker.attack(defender);
                    }

                    Fighter winner = fighter1.isAlive() ? fighter1 : fighter2;
                    Fighter loser = fighter1.isAlive() ? fighter2 : fighter1;

                    System.out.println("\n---> " + winner.getName() + " ganhou o combate!");
                    
                    winner.addVictory();
                    loser.addDefeat();

                    System.out.println(winner.getName() + ": " + winner.getVictories() + " vitórias e " + winner.getDefeats() + " derrotas");
                    System.out.println(loser.getName() + ": " + loser.getVictories() + " vitórias e " + loser.getDefeats() + " derrotas");
                }

            } else if (choice == 4) {
                break;

            } else {
                System.out.println("Escolha inválida!");
            }
        }
        scanner.close();
    }
}
