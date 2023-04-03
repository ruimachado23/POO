package aula07;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
      // criar robôs
      Robo r1 = new Robo(1, "Guarda Redes", 0);
      Robo r2 = new Robo(2, "Defesa", 0);
      Robo r3 = new Robo(3, "Medio", 0);
      Robo r4 = new Robo(4, "Guarda Redes", 0);
      Robo r5 = new Robo(5, "Defesa", 0);
      Robo r6 = new Robo(6, "Avancado", 0);
      
      // criar equipas
      Robo[] equipa1 = {r1, r2, r3};
      Equipa e1 = new Equipa("Azuis", "João Silva", 0, 0, equipa1);
      
      Robo[] equipa2 = {r4, r5, r6};
      Equipa e2 = new Equipa("Vermelhos", "José Santos", 0, 0, equipa2);
      
      // criar bola
      Bola bola = new Bola("Branca", 0, 0, 0);
      
      // criar jogo
      Jogo jogo = new Jogo(60);
      
      // simular jogo
      Random rand = new Random();
      
      for (int i = 0; i < jogo.getDuracao(); i++) {
          int randomRobo = rand.nextInt(3);
          int randomDirection = rand.nextInt(10);
          int distance = bola.move(randomDirection, randomDirection);
          bola.setDistance(distance);
          bola.setNewx(randomDirection);
          bola.setNewy(randomDirection);
          
          if (distance <= 5) {
              System.out.println("Golo!");
              if (bola.getCor().equals("Branca")) {
                  e1.setMarcados(e1.getMarcados() + 1);
              } else {
                  e2.setMarcados(e2.getMarcados() + 1);
              }
          }
          
          if (i % 10 == 0) {
              e1.getRobos()[randomRobo].marcarGolo();
          } else if (i % 5 == 0) {
              e2.getRobos()[randomRobo].marcarGolo();
          }
      }
      
      // imprimir resultado final
      System.out.println("Resultado final:");
      System.out.println(e1.getNome() + " " + e1.getMarcados() + " - " + e2.getMarcados() + " " + e2.getNome());
  }
}  