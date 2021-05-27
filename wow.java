import java.util.*;

class wow {

    static int player, comp, score = 0, score1 = 0, w = 1, x = 1, y = 1, z = 1, v = 0, health = 500, health1 = 500;

    static void game(){
        System.out.print("\033[H\033[2J");
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Round 1 Begins\n\n");
        while(w <= 3){
            System.out.println("1. Fire🔥\n2. Water💧\n3. Leaf🍃\nChoose Your Element: ");
            player = sc.nextInt();
            if(player == 1 || player == 2 || player == 3){
                comp = 1 + random.nextInt(3 - 1 + 1);
                if(comp == 1 && player == 1){
                    System.out.println("\nComp : Fire🔥\nPlayer : Fire🔥\nMatch Tied\n");
                    w++;
                }else if (comp == 2 && player == 2) {
                    w++;
                    System.out.println("\nComp : Water💧\nPlayer : Water💧\nMatch Tied\n");
                } else if (comp == 3 && player == 3) {
                    w++;
                    System.out.println("\nComp : Leaf🍃\nPlayer : Leaf🍃\nMatch Tied\n");
                }
                else if (comp == 2 && player == 1) {
                    w++;
                    System.out.println("\nComp : Water💧\nPlayer : Fire🔥\nComp Win\n");
                    score1 = score1 + 1;
                } else if (comp == 1 && player == 3) {
                    w++;
                    System.out.println("\nComp : Fire🔥\nPlayer : Leaf🍃\nComp Win\n");
                    score1 = score1 + 1;
                } else if (comp == 2 && player == 3) {
                    w++;
                    System.out.println("\nComp : Leaf🍃\nPlayer : Water💧\nComp Win\n");
                    score1 = score1 + 1;
                } else if (comp == 1 && player == 2) {
                    w++;
                    System.out.println("\nComp : Fire🔥\nPlayer : Water💧\nPlayer Win\n");
                    score = score + 1;
                } else if (comp == 3 && player == 1) {
                    w++;
                    System.out.println("\nComp : Leaf🍃\nPlayer : Fire🔥\nPlayer Win\n");
                    score = score + 1;
                } else if (comp == 3 && player == 2) {
                    w++;
                    System.out.println("\nComp : Water💧\nPlayer : Leaf🍃\nPlayer Win\n");
                    score = score + 1;
                }
            }else{
                System.out.println("\nInvalid Input\n");
            }
        }

            System.out.println("Round 2 Begins\n\n");
            while(x <= 3){
                System.out.println("1. Fly🌀\n2. Rock🗿\n3. Fight🥊\nChoose Your Element: ");
            player = sc.nextInt();
            if(player == 1 || player == 2 || player == 3){
                comp = 1 + random.nextInt(3 - 1 + 1);
                if(comp == 1 && player == 1){
                    x++;
                    System.out.println("\nComp : Fly🌀\nPlayer : Fly🌀\nMatch Tied\n");
                }else if (comp == 2 && player == 2) {
                    x++;
                    System.out.println("\nComp : Rock🗿\nPlayer : Rock🗿\nMatch Tied\n");
                } else if (comp == 3 && player == 3) {
                    x++;
                    System.out.println("\nComp : Fight🥊\nPlayer : Fight🥊\nMatch Tied\n");
                }
                else if (comp == 2 && player == 1) {
                    x++;
                    System.out.println("\nComp : Rock🗿\nPlayer : Fly🌀\nComp Win\n");
                    score1 = score1 + 1;
                } else if (comp == 3 && player == 2) {
                    x++;
                    System.out.println("\nComp : Fight🥊\nPlayer : Rock🗿\nComp Win\n");
                    score1 = score1 + 1;
                } else if (comp == 1 && player == 3) {
                    x++;
                    System.out.println("\nComp : Fly🌀\nPlayer : Fight🥊\nComp Win\n");
                    score1 = score1 + 1;
                } else if (comp == 1 && player == 2) {
                    x++;
                    System.out.println("\nComp : Fly🌀\nPlayer : Rock🗿\nPlayer Win\n");
                    score = score + 1;
                } else if (comp == 2 && player == 3) {
                    x++;
                    System.out.println("\nComp : Rock🗿\nPlayer : Fight🥊\nPlayer Win\n");
                    score = score + 1;
                } else if (comp == 3 && player == 1) {
                    x++;
                    System.out.println("\nComp : Fight🥊\nPlayer : Fly🌀\nPlayer Win\n");
                    score = score + 1;
                }
            }else{
                System.out.println("\nInvalid Input\n");
            }
            }

            System.out.println("Round 3 Begins\n\n");
            while(y <= 3){
                System.out.println("1. Ground🟫\n2. Ice⚪\n3. Steel⚙️\nChoose Your Element: ");
            player = sc.nextInt();
            if(player == 1 || player == 2 || player == 3){
                comp = 1 + random.nextInt(3 - 1 + 1);
                if(comp == 1 && player == 1){
                    y++;
                    System.out.println("\nComp : Ground🟫\nPlayer : Ground🟫\nMatch Tied\n");
                }else if (comp == 2 && player == 2) {
                    y++;
                    System.out.println("\nComp : Ice⚪\nPlayer : Ice⚪\nMatch Tied\n");
                } else if (comp == 3 && player == 3) {
                    y++;
                    System.out.println("\nComp : Steel⚙️\nPlayer : Steel⚙️\nMatch Tied\n");
                }

                else if (comp == 2 && player == 1) {
                    y++;
                    System.out.println("\nComp : Ice⚪\nPlayer : Ground🟫\nComp Win\n");
                    score1 = score1 + 1;
                } else if (comp == 1 && player == 3) {
                    y++;
                    System.out.println("\nComp : Ground🟫\nPlayer : Steel⚙️\nComp Win\n");
                    score1 = score1 + 1;
                } else if (comp == 3 && player == 2) {
                    y++;
                    System.out.println("\nComp : Steel⚙️\nPlayer : Ice⚪\nComp Win\n");
                    score1 = score1 + 1;
                }
                
                else if (comp == 1 && player == 2) {
                    y++;
                    System.out.println("\nComp : Ground🟫\nPlayer : Ice⚪\nPlayer Win\n");
                    score = score + 1;
                } else if (comp == 3 && player == 1) {
                    y++;
                    System.out.println("\nComp : Steel⚙️\nPlayer : Ground🟫\nPlayer Win\n");
                    score = score + 1;
                } else if (comp == 2 && player == 3) {
                    y++;
                    System.out.println("\nComp : Ice⚪\nPlayer : Steel⚙️\nPlayer Win\n");
                    score = score + 1;
                }
            }else{
                System.out.println("\nInvalid Input\n");
            }
            }

            System.out.println("Round 4 Begins\n\n");
            while(z <= 3){
                System.out.println("1. Dark⚫\n2. Fairy⚜️\n3. Poison☣️\n4. Psychic🧿\nChoose Your Element: ");
            player = sc.nextInt();
            if(player == 1 || player == 2 || player == 3 || player == 4){
                comp = 1 + random.nextInt(3 - 1 + 1);
                if(comp == 1 && player == 1){
                    z++;
                    System.out.println("\nComp : Dark⚫\nPlayer : Dark⚫\nMatch Tied\n");
                }else if (comp == 2 && player == 2) {
                    z++;
                    System.out.println("\nComp : Fairy⚜️\nPlayer : Fairy⚜️\nMatch Tied\n");
                } else if (comp == 3 && player == 3) {
                    z++;
                    System.out.println("\nComp : Poison☣️\nPlayer : Poison☣️\nMatch Tied\n");
                }else if (comp == 4 && player == 4) {
                    z++;
                    System.out.println("\nComp : Psychic🧿\nPlayer : Psychic🧿\nMatch Tied\n");
                }

                else if (comp == 1 && player == 2) {
                    z++;
                    System.out.println("\nComp : Dark⚫\nPlayer : Fairy⚜️\nComp Win\n");
                    score1 = score1 + 1;
                } else if (comp == 2 && player == 3) {
                    z++;
                    System.out.println("\nComp : Fairy⚜️\nPlayer : Poisen☣️\nComp Win\n");
                    score1 = score1 + 1;
                } else if (comp == 3 && player == 4) {
                    z++;
                    System.out.println("\nComp : Poison☣️\nPlayer : Psychic🧿\nComp Win\n");
                    score1 = score1 + 1;
                }
                else if (comp == 4 && player == 1) {
                    z++;
                    System.out.println("\nComp : Psychic🧿\nPlayer : Dark⚫\nComp Win\n");
                    score1 = score1 + 1;
                }
                else if (comp == 3 && player == 1) {
                    z++;
                    System.out.println("\nComp : Poison☣️\nPlayer : Dark⚫\nComp Win\n");
                    score1 = score1 + 1;
                }
                else if (comp == 2 && player == 4) {
                    z++;
                    System.out.println("\nComp : Fairy⚜️\nPlayer : Psychic🧿\nComp Win\n");
                    score1 = score1 + 1;
                }
                
                else if (comp == 2 && player == 1) {
                    z++;
                    System.out.println("\nComp : Fairy⚜️\nPlayer : Dark⚫\nPlayer Win\n");
                    score = score + 1;
                } else if (comp == 3 && player == 2) {
                    z++;
                    System.out.println("\nComp : Poisen☣️\nPlayer : Fairy⚜️\nPlayer Win\n");
                    score = score + 1;
                } else if (comp == 4 && player == 3) {
                    z++;
                    System.out.println("\nComp : Psychic🧿\nPlayer : Poison☣️\nPlayer Win\n");
                    score = score + 1;
                }
                else if (comp == 1 && player == 4) {
                    z++;
                    System.out.println("\nComp : Dark⚫\nPlayer : Psychic🧿\nPlayer Win\n");
                    score = score + 1;
                }
                else if (comp == 1 && player == 3) {
                    z++;
                    System.out.println("\nComp : Dark⚫\nPlayer : Poison☣️\nPlayer Win\n");
                    score = score + 1;
                }
                else if (comp == 4 && player == 2) {
                    z++;
                    System.out.println("\nComp : Psychic🧿\nPlayer : Fairy⚜️\nPlayer Win\n");
                    score = score + 1;
                }
            }else{
                System.out.println("\nInvalid Input\n");
            }
            }

            System.out.println("CONGRATS YOU HAVE ENTERED IN LAST ROUND");
            System.out.println("....Round 5 begins....\n");
            do{
                if(health == 0 || health1 == 0){
                    v = 1;
                }else{
                    System.out.println("\nComp Health: " + health1 + "\nPlayer Health: " + health + "\n");
                    System.out.println("1. Fire🔥\n2. Water💧\n3. Leaf🍃\n4. Rock🗿\n5. Electric⚡\nEnter Your Choice: ");
                    player = sc.nextInt();
                    if(player == 1 || player == 2 || player == 3 || player == 4 || player == 5){
                        comp = 1 + random.nextInt(5 - 1 + 1);
                       if(player==1 && comp == 1){
                           System.out.println("Comp: FIRE🔥\nPlayer: FIRE🔥\n CLASH");
                       }
                       else if(player == 2 && comp == 2){
                        System.out.println("Comp: WATER💧\nPlayer: WATER💧\n CLASH");
                       }
                       else if(player == 3 && comp == 3){
                        System.out.println("Comp: LEAF🍃\nPlayer: LEAF🍃\n CLASH");
                       }
                       else if(player == 4 && comp == 4){
                        System.out.println("Comp: ROCK🗿\nPlayer: ROCK🗿\n CLASH");
                       }
                       else if(player == 5 && comp == 5){
                        System.out.println("Comp: ELECTRIC⚡\nPlayer: ELECTRIC⚡\n CLASH");
                       }
                       else if(player==1 && comp==2){
                           health=health-50;
                        System.out.println("Comp: WATER💧\nPlayer: FIRE🔥\n..COMP WINS..\n");
                       }
                       else if(player==1 && comp==4){
                           health=health-50;
                        System.out.println("Comp: WATER💧\nPlayer: ROCK🗿\n..COMP WINS..\n");
                       }
                       else if(player==3 && comp==1){
                           health=health-50;
                        System.out.println("Comp: FIRE🔥\nPlayer: LEAF🍃\n..COMP WINS..\n");
                       }
                       else if(player==5 && comp==1){
                           health=health-50;
                        System.out.println("Comp: FIRE🔥\nPlayer: ELECTRIC⚡\n..COMP WINS..\n");
                       }
                       else if(player==4 && comp==3){
                           health=health-50;
                        System.out.println("Comp: LEAF🍃\nPlayer: ROCK🗿\n..COMP WINS..\n");
                       }
                       else if(player==5 && comp==3){
                           health=health-50;
                        System.out.println("Comp: LEAF🍃\nPlayer: ELECTRIC⚡\n..COMP WINS..\n");
                       }
                       else if(player==5 && comp==4){
                           health=health-50;
                        System.out.println("Comp: LEAF🍃\nPlayer: ELECTRIC⚡\n ..COMP WINS..\n");
                       }
                       else if(player==1 && comp==4){
                           health=health-50;
                           System.out.println("Comp: ROCK🗿\nPlayer: FIRE🔥\n..COMP WINS..\n");
                        }
                        else if(player==2 && comp==5){
                           health=health-50;
                           System.out.println("Comp: ELECTRIC⚡\nPlayer: WATER💧\n");
                        }
                        else if(player==2 && comp==1){
                            health1=health1-50;
                         System.out.println("Comp: FIRE🔥\nPlayer: WATER💧\n ..PLAYER WINS..\n");
                        }
                        else if(player==4 && comp==1){
                            health1=health1-50;
                         System.out.println("Comp: ROCK🗿\nPlayer: WATER💧\n..PLAYER WINS..\n");
                        }
                        else if(player==1 && comp==3){
                            health1=health1-50;
                         System.out.println("Comp: LEAF🍃\nPlayer: FIRE🔥\n..PLAYER WINS..\n");
                        }
                        else if(player==1 && comp==5){
                            health1=health1-50;
                         System.out.println("Comp: ELECTRIC⚡\nPlayer: FIRE🔥\n..PLAYER WINS..\n");
                        }
                        else if(player==3 && comp==4){
                            health1=health1-50;
                         System.out.println("Comp: ROCK🗿\nPlayer: LEAF🍃\n..PLAYER WINS..\n");
                        }
                        else if(player==3 && comp==5){
                            health1=health1-50;
                         System.out.println("Comp: ELECTRIC⚡\nPlayer: LEAF🍃\n..PLAYER WINS..\n");
                        }
                        else if(player==4 && comp==5){
                            health1=health1-50;
                         System.out.println("Comp: ELECTRIC⚡\nPlayer: LEAF🍃\n..PLAYER WINS..\n");
                        }
                        else if(player==4 && comp==1){
                            health1=health1-50;
                            System.out.println("Comp: FIRE🔥\nPlayer: ROCK🗿\n..PLAYER WINS..\n");
                         }
                         else if(player==5 && comp==2){
                            health1=health1-50;
                            System.out.println("Comp: WATER💧\nPlayer: ELECTRIC⚡\n..PLAYER WINS..\n");
                        }
                }else{
                    System.out.println("\nInvalid Input\n");
                }
            }
            }while(v == 0);

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
            sc.close();
    }

    static void how(){
        System.out.print("\033[H\033[2J");
        Scanner enter1 = new Scanner(System.in);
        int enter;
        System.out.println("\n\nHow to Play\n\nFirst You need to Enter the Game by giving 1 as Input. There are 4 Rounds and each Round will be executed 3 times and Final Round is One on One Fight. From Round 1 to 4 there are elements and Each Element has a weakness So choose Wisely. Each Round has 3 Points so Total Points is 15, You have to Score more than Comp to Win. In Round 5 there is Health Bar System You and Comp will have 500 HP and the Match is like Match till Death You will continue Fighting untill Someone's Dead. All the best\n");
        System.out.println("\nPress any number to go back: \n");
        enter = enter1.nextInt();
        main();
        System.out.println(enter);
        enter1.close();
    }

    static void about(){
        System.out.print("\033[H\033[2J");
        Scanner enter1 = new Scanner(System.in);
        int enter;
        System.out.println("\n\nAbout\n\nWar Of Wizards Game using Java.\nGame Developed by viplovsurv3 and sachinl0har.\n\n@copyrights All Rights Reserved\n");
        System.out.println("\nPress any number to go back: \n");
        enter = enter1.nextInt();
        main();
        System.out.println(enter);
        enter1.close();
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
        sc.close();
    }
    public static void main(String[] args) {
        main();
    }
    
}
