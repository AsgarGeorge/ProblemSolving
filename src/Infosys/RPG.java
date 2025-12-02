package Infosys;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
class Monster {
    final int power;
    final int bonus;
    public Monster(int power, int bonus){
        this.power = power;
        this.bonus = bonus;
    }
}
public class RPG {
            public static void main(String[] args) {

            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int exp = s.nextInt();

            int monst[] = new int[n];
            int bonus[] = new int[n];

            for (int i = 0; i < n; i++) {
                monst[i] = s.nextInt();
            }
            for (int i = 0; i < n; i++) {
                bonus[i] = s.nextInt();
            }
            Monster[] monsters = new Monster[n];

            for(int i = 0; i < n; i++)
                monsters[i] = new Monster(monst[i], bonus[i]);
            Comparator<Monster> comp = new Comparator<Monster>() {
                @Override
                public int compare(Monster o1, Monster o2) {
                    if(o1.power > o2.power){
                        return 1;
                    }
                    else {
                        return -1;
                    }
                }
            };
//          Comparator.comparingInt(m -> m.power)
            Arrays.sort(monsters, comp);

            int count = 0;

            for(Monster m: monsters){
                if(exp < m.power) break;
                exp += m.bonus;
                ++count;
            }
            System.out.println(count);
        }
    }

