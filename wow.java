import java.util.*;

class wow {

    static int player, comp, score = 0, score1 = 0, a = 1, b = 1, c = 1, d = 1, health = 500, health1 = 500, x = 0;

    static void game(){
        System.out.print("\033[H\033[2J");
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Round 1 Begins\n\n");
        while(a <= 3){
            System.out.println("1. Fire🔥\n2. Water💧\n3. Leaf🍃\nChoose Your Element: ");
            player = sc.nextInt();
            if(player == 1 || player == 2 || player == 3){
                comp = 1 + random.nextInt(3 - 1 + 1);
                System.out.println("\nComp = " + comp);
                if(comp == 1 && player == 1){
                    System.out.println("\nComp : Fire🔥\nPlayer : Fire🔥\nMatch Tied\n");
                    a++;
                }else if (comp == 2 && player == 2) {
                    a++;
                    System.out.println("\nComp : Water💧\nPlayer : Water💧\nMatch Tied\n");
                } else if (comp == 3 && player == 3) {
                    a++;
                    System.out.println("\nComp : Leaf🍃\nPlayer : Leaf🍃\nMatch Tied\n");
                }
                else if (comp == 2 && player == 1) {
                    a++;
                    System.out.println("\nComp : Water💧\nPlayer : Fire🔥\nComp Win\n");
                    score1 = score1 + 1;
                } else if (comp == 1 && player == 3) {
                    a++;
                    System.out.println("\nComp : Fire🔥\nPlayer : Leaf🍃\nComp Win\n");
                    score1 = score1 + 1;
                } else if (comp == 2 && player == 3) {
                    a++;
                    System.out.println("\nComp : Leaf🍃\nPlayer : Water💧\nComp Win\n");
                    score1 = score1 + 1;
                } else if (comp == 1 && player == 2) {
                    a++;
                    System.out.println("\nComp : Fire🔥\nPlayer : Water💧\nPlayer Win\n");
                    score = score + 1;
                } else if (comp == 3 && player == 1) {
                    a++;
                    System.out.println("\nComp : Leaf🍃\nPlayer : Fire🔥\nPlayer Win\n");
                    score = score + 1;
                } else if (comp == 3 && player == 2) {
                    a++;
                    System.out.println("\nComp : Water💧\nPlayer : Leaf🍃\nPlayer Win\n");
                    score = score + 1;
                }
            }else{
                System.out.println("\nInvalid Input\n");
            }
        }

            System.out.println("Round 2 Begins\n\n");
            while(b <= 3){
                System.out.println("1. Fly🥏\n2. Rock🧱\n3. Fight🥊\nChoose Your Element: ");
            player = sc.nextInt();
            if(player == 1 || player == 2 || player == 3){
                comp = 1 + random.nextInt(3 - 1 + 1);
                System.out.println("\nComp = " + comp);
                if(comp == 1 && player == 1){
                    b++;
                    System.out.println("\nComp : Fly🥏\nPlayer : Fly🥏\nMatch Tied\n");
                }else if (comp == 2 && player == 2) {
                    b++;
                    System.out.println("\nComp : Rock🧱\nPlayer : Rock🧱\nMatch Tied\n");
                } else if (comp == 3 && player == 3) {
                    b++;
                    System.out.println("\nComp : Fight🥊\nPlayer : Fight🥊\nMatch Tied\n");
                }
                else if (comp == 2 && player == 1) {
                    b++;
                    System.out.println("\nComp : Rock🧱\nPlayer : Fly🥏\nComp Win\n");
                    score1 = score1 + 1;
                } else if (comp == 3 && player == 2) {
                    b++;
                    System.out.println("\nComp : Fight🥊\nPlayer : Rock🧱\nComp Win\n");
                    score1 = score1 + 1;
                } else if (comp == 1 && player == 3) {
                    b++;
                    System.out.println("\nComp : Fly🥏\nPlayer : Fight🥊\nComp Win\n");
                    score1 = score1 + 1;
                } else if (comp == 1 && player == 2) {
                    b++;
                    System.out.println("\nComp : Fly🥏\nPlayer : Rock🧱\nPlayer Win\n");
                    score = score + 1;
                } else if (comp == 2 && player == 3) {
                    b++;
                    System.out.println("\nComp : Rock🧱\nPlayer : Fight🥊\nPlayer Win\n");
                    score = score + 1;
                } else if (comp == 3 && player == 1) {
                    b++;
                    System.out.println("\nComp : Fight🥊\nPlayer : Fly🥏\nPlayer Win\n");
                    score = score + 1;
                }
            }else{
                System.out.println("\nInvalid Input\n");
            }
            }

            System.out.println("Round 3 Begins\n\n");
            while(c <= 3){
                System.out.println("1. Ground🏝\n2. Ice❄\n3. Steel🔩\nChoose Your Element: ");
            player = sc.nextInt();
            if(player == 1 || player == 2 || player == 3){
                comp = 1 + random.nextInt(3 - 1 + 1);
                System.out.println("\nComp = " + comp);
                if(comp == 1 && player == 1){
                    c++;
                    System.out.println("\nComp : Ground🏝\nPlayer : Ground🏝\nMatch Tied\n");
                }else if (comp == 2 && player == 2) {
                    c++;
                    System.out.println("\nComp : Ice❄\nPlayer : Ice❄\nMatch Tied\n");
                } else if (comp == 3 && player == 3) {
                    c++;
                    System.out.println("\nComp : Steel🔩\nPlayer : Steel🔩\nMatch Tied\n");
                }

                else if (comp == 2 && player == 1) {
                    c++;
                    System.out.println("\nComp : Ice❄\nPlayer : Ground🏝\nComp Win\n");
                    score1 = score1 + 1;
                } else if (comp == 1 && player == 3) {
                    c++;
                    System.out.println("\nComp : Ground🏝\nPlayer : Steel🔩\nComp Win\n");
                    score1 = score1 + 1;
                } else if (comp == 3 && player == 2) {
                    c++;
                    System.out.println("\nComp : Steel🔩\nPlayer : Ice❄\nComp Win\n");
                    score1 = score1 + 1;
                }
                
                else if (comp == 1 && player == 2) {
                    c++;
                    System.out.println("\nComp : Ground🏝\nPlayer : Ice❄\nPlayer Win\n");
                    score = score + 1;
                } else if (comp == 3 && player == 1) {
                    c++;
                    System.out.println("\nComp : Steel🔩\nPlayer : Ground🏝\nPlayer Win\n");
                    score = score + 1;
                } else if (comp == 2 && player == 3) {
                    c++;
                    System.out.println("\nComp : Ice❄\nPlayer : Steel🔩\nPlayer Win\n");
                    score = score + 1;
                }
            }else{
                System.out.println("\nInvalid Input\n");
            }
            }

            System.out.println("Round 4 Begins\n\n");
            while(d <= 3){
                System.out.println("1. Dark🌑\n2. Fairy👸\n3. Poison💊\n4. Psychic😵\nChoose Your Element: ");
            player = sc.nextInt();
            if(player == 1 || player == 2 || player == 3 || player == 4){
                comp = 1 + random.nextInt(3 - 1 + 1);
                System.out.println("\nComp = " + comp);
                if(comp == 1 && player == 1){
                    d++;
                    System.out.println("\nComp : Dark🌑\nPlayer : Dark🌑\nMatch Tied\n");
                }else if (comp == 2 && player == 2) {
                    d++;
                    System.out.println("\nComp : Fairy👸\nPlayer : Fairy👸\nMatch Tied\n");
                } else if (comp == 3 && player == 3) {
                    d++;
                    System.out.println("\nComp : Poison💊\nPlayer : Poison💊\nMatch Tied\n");
                }else if (comp == 4 && player == 4) {
                    d++;
                    System.out.println("\nComp : Psychic😵\nPlayer : Psychic😵\nMatch Tied\n");
                }

                else if (comp == 1 && player == 2) {
                    d++;
                    System.out.println("\nComp : Dark🌑\nPlayer : Fairy👸\nComp Win\n");
                    score1 = score1 + 1;
                } else if (comp == 2 && player == 3) {
                    d++;
                    System.out.println("\nComp : Fairy👸\nPlayer : Poisen💊\nComp Win\n");
                    score1 = score1 + 1;
                } else if (comp == 3 && player == 4) {
                    d++;
                    System.out.println("\nComp : Poison💊\nPlayer : Psychic😵\nComp Win\n");
                    score1 = score1 + 1;
                }
                else if (comp == 4 && player == 1) {
                    d++;
                    System.out.println("\nComp : Psychic😵\nPlayer : Dark🌑\nComp Win\n");
                    score1 = score1 + 1;
                }
                else if (comp == 3 && player == 1) {
                    d++;
                    System.out.println("\nComp : Poison💊\nPlayer : Dark🌑\nComp Win\n");
                    score1 = score1 + 1;
                }
                else if (comp == 2 && player == 4) {
                    d++;
                    System.out.println("\nComp : Fairy👸\nPlayer : Psychic😵\nComp Win\n");
                    score1 = score1 + 1;
                }
                
                else if (comp == 2 && player == 1) {
                    d++;
                    System.out.println("\nComp : Fairy👸\nPlayer : Dark🌑\nPlayer Win\n");
                    score = score + 1;
                } else if (comp == 3 && player == 2) {
                    d++;
                    System.out.println("\nComp : Poisen💊\nPlayer : Fairy👸\nPlayer Win\n");
                    score = score + 1;
                } else if (comp == 4 && player == 3) {
                    d++;
                    System.out.println("\nComp : Psychic😵\nPlayer : Poison💊\nPlayer Win\n");
                    score = score + 1;
                }
                else if (comp == 1 && player == 4) {
                    d++;
                    System.out.println("\nComp : Dark🌑\nPlayer : Psychic😵\nPlayer Win\n");
                    score = score + 1;
                }
                else if (comp == 1 && player == 3) {
                    d++;
                    System.out.println("\nComp : Dark🌑\nPlayer : Poison💊\nPlayer Win\n");
                    score = score + 1;
                }
                else if (comp == 4 && player == 2) {
                    d++;
                    System.out.println("\nComp : Psychic😵\nPlayer : Fairy👸\nPlayer Win\n");
                    score = score + 1;
                }
            }else{
                System.out.println("\nInvalid Input\n");
            }
            }

            System.out.println("Round 5 Begins\n\n");
            System.out.println("One on One Fight You vs Comp.\nAll The Best\n");
            while(x == 0){
                if(health <= 0 || health1 <= 0){
                    x = 1;
                }else{
                    System.out.println("\nComp Health: " + health1 + "\nPlayer Health: " + health + "\n");
                System.out.println("1. Attack👊\n2. Special Move🦵\n3. Dodge🙌\n4. Finishing Move💪\nEnter Your Choice: ");
                player = sc.nextInt();
                if(player == 1 || player == 2 || player == 3 || player == 4){
                    comp = 1 + random.nextInt(12 - 1 + 1);
                    if(comp == 1 || comp == 2 || comp == 3 && player == 1){
                        System.out.println("Comp Attacked🤜\nYou Also Attacked🤛\n");
                    }else if(comp == 4 || comp == 5 || comp == 6 && player == 2){
                        System.out.println("Comp Used Special Move🦵\nYou Also Used Special Move🦵\n");
                    }else if(comp == 7 || comp == 8 || comp == 9 && player == 3){
                        System.out.println("Comp Dodged🙌\nYou Also Dodged🙌\n");
                    }else if(comp == 10 || comp == 11 || comp == 12 && player == 4){
                        System.out.println("Comp Used Finishing Move💪\nYou Also Used Finishing Move💪\n");
                    }
                    
                    else if(comp == 1 || comp == 2 || comp == 3 && player == 2){
                        health1 = health1 - 80;
                        System.out.println("Comp Attacked🤜\nYou Used Special Move🦵\n");
                    }else if(comp == 7 || comp == 8 || comp == 9 && player == 2){
                        System.out.println("Comp Dodged🙌\nYou Used Special Move🦵\n");
                    }else if(comp == 10 || comp == 11 || comp == 12 && player == 2){
                        health = health - 120;
                        System.out.println("Comp Used Finishing Move💪\nYou Used Special Move🦵\n");
                    }
                    
                    else if(comp == 1 || comp == 2 || comp == 3 && player == 3){
                        health = health - 50;
                        System.out.println("Comp Attacked🤜\nYou Dodged🙌\n");
                    }else if(comp == 4 || comp == 5 || comp == 6 && player == 3){
                        System.out.println("Comp Used Special Move🦵\nYou Dodged🙌\n");
                    }else if(comp == 10 || comp == 11 || comp == 12 && player == 3){
                        System.out.println("Comp Used Finishing Move💪\nYou Dodged🙌\n");
                    }
                    
                    else if(comp == 1 || comp == 2 || comp == 3 && player == 4){
                        health1 = health1 - 120;
                        System.out.println("Comp Attacked🤜\nYou Used Finishing Move💪\n");
                    }else if(comp == 4 || comp == 5 || comp == 6 && player == 4){
                        health1 = health1 - 120;
                        System.out.println("Comp Used Special Move🦵\nYou Used Finishing Move💪\n");
                    }else if(comp == 7 || comp == 8 || comp == 9 && player == 4){
                        System.out.println("Comp Dodged🙌\nYou Used Finishing Move💪\n");
                    }
                    
                    else if(comp == 4 || comp == 5 || comp == 6 && player == 1){
                        health = health - 80;
                        System.out.println("Comp Used Special Move🦵\nYou Attacked🤛\n");
                    }else if(comp == 7 || comp == 8 || comp == 9 && player == 1){
                        health1 = health1 - 50;
                        System.out.println("Comp Dodged🙌\nYou Attacked🤛\n");
                    }else if(comp == 10 || comp == 11 || comp == 12 && player == 1){
                        health = health - 120;
                        System.out.println("Comp Used Finishing Move💪\nYou Attacked🤛\n");
                    }
                }else{
                    System.out.println("\nInvalid Input\n");
                }
            }
            }

            if(health > health1){
                score = score + 1;
            }else if(health == health1){
                System.out.println("Round 5 Tied");
            }else{
                score1 = score1 + 1;
            }
            

            if(score > score1){
                System.out.println("Comp Score: " + score1 + "\nPlayer Score: " + score + "\nPlayer Win");
            }else if(score == score1){
                System.out.println("Comp Score: " + score1 + "\nPlayer Score: " + score + "\nMatch Tied");
            }else{
                System.out.print("Comp Score: " + score1 + "\nPlayer Score: " + score + "\nComp Win");
            }
    }

    static void how(){
        System.out.print("\033[H\033[2J");
        Scanner enter1 = new Scanner(System.in);
        int enter;
        System.out.println("\n\nHow to Play\n\nFirst You need to Enter the Game by giving 1 as Input. There are 4 Rounds and each Round will be executed 3 times and Final Round is One on One Fight. From Round 1 to 4 there are elements and Each Element has a weakness So choose Wisely. Each Round has 3 Points so Total Points is 15, You have to Score more than Comp to Win. In Round 5 there is Health Bar System You and Comp will have 500 HP and the Match is like Match till Death You will continue Fighting untill Someone's Dead. All the best\n");
        System.out.println("\nPress any number to go back: \n");
        enter = enter1.nextInt();
        main();
    }

    static void about(){
        System.out.print("\033[H\033[2J");
        Scanner enter1 = new Scanner(System.in);
        int enter;
        System.out.println("\n\nAbout\n\nWar Of Wizards Game using Java.\nGame Developed by viplovsurv3 and sachinl0har.\n\n@copyrights All Rights Reserved\n");
        System.out.println("\nPress any number to go back: \n");
        enter = enter1.nextInt();
        main();
    }

    static void main(){
        System.out.print("\033[H\033[2J");
        int option;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n1. Play Game\n2. How to Play?\n3. About\n4. Exit\nEnter Your Choice: ");
        option = sc.nextInt();
        switch(option){
            case 1:
            game();
            break;
            case 2:
            how();
            break;
            case 3:
            about();
            break;
            case 4:
            System.exit(1);
            break;
            default:
            System.out.println("\nInvalid Input\n");
        }
    }
    public static void main(String[] args) {
        main();
    }
    
}
