package pl.edu.pjwstk.zadanie6;
//By Januszewskijanuszek

import java.util.*;

public class Main {
    private static Player player = new Player(0, Weapon.NONE, ArmourBody.NONE, ArmourHead.NONE);
    private static Random rnd = new Random();
    private static boolean zgon = false;
    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu(){
        boolean exit = true;
        do{
            if(zgon){
                exit = false;
            }
            else{
                System.out.println("Menu gry");
                System.out.println("1\t-\tWalka!");
                System.out.println("2\t-\tSklep");
                System.out.println("3\t-\tEXIT");
                int choice = new Scanner(System.in).nextInt();
                switch (choice){
                    case 1:{
                        fight();
                        break;
                    }
                    case 2:{
                        shop();
                        break;
                    }
                    default:{
                        System.out.println("Czy napewno chcesz opóścić grę?");
                        System.out.println("Cały twój postęp zostanie stracony");
                        System.out.println("Y - Tak\tN - Nie");
                        String inputExit = new Scanner(System.in).next();
                        if(inputExit.equals("Y")||inputExit.equals("y")){
                            exit = false;
                        }
                        else{
                            System.out.println("Błąd");
                        }
                        break;
                    }
                }

            }

        }while(exit);
    }

    public static void fight(){
        player.setHealthPoints(100);
        int weapon = 0;
        int headArmor = 0;
        int bodyArmour = 0;
        int enemyTier = 2;
        if(player.getXp() > 4 && player.getXp() <= 15){
            enemyTier = 3;
            weapon = rnd.nextInt(2);
            headArmor = rnd.nextInt(2);
            bodyArmour = rnd.nextInt(2);
        }
        else if(player.getXp() > 15 && player.getXp() < 45){
            enemyTier = 4;
            weapon = rnd.nextInt(2) + 2;
            headArmor = rnd.nextInt(2) + 2;
            bodyArmour = rnd.nextInt(2) + 2;
        }
        else if(player.getXp() > 45){
            enemyTier = 5;
            weapon = rnd.nextInt(2) + 4;
            headArmor = rnd.nextInt(2) + 4;
            bodyArmour = rnd.nextInt(2) + 4;
        }
        Player enemy = new Player(0,Weapon.values()[weapon],ArmourBody.values()[bodyArmour],ArmourHead.values()[headArmor]);
        boolean won = true;
        boolean round = true;
        do{
            if(round){
                player.showStats(true);
                enemy.showStats(false);
                System.out.println("Przeciwnik uzbrojony jest w :"
                        + enemy.getArmourBody().getName() +", "
                        + enemy.getArmourHead().getName() + " i "
                        + enemy.getWeapon().getName());
                System.out.println("1 - Atak w głowę " + player.getWeapon().getHitChanceHead() +"% Szansy");
                System.out.println("2 - Atak w ciało " + player.getWeapon().getHitChanceBody() +"% Szansy");
                int fightPlayer = new Scanner(System.in).nextInt();
                switch (fightPlayer){
                    case 1:{
                        for(int i = 0 ; i < player.getWeapon().getHitCount() ; i++){
                            int rand = new Random().nextInt(100);
                            if(rand <= player.getWeapon().getHitChanceHead()){
                                enemy.hitHead(player.getWeapon().getDamageHead());
                                System.out.println("Trafienie w Głowę!");
                            }
                            else {
                                System.out.println("PUDŁO");
                            }
                        }
                        break;
                    }
                    case 2:{
                        for(int i = 0 ; i < player.getWeapon().getHitCount() ; i++){
                            int rand = new Random().nextInt(100);
                            if(rand <= player.getWeapon().getHitChanceBody()){
                                enemy.hitBody(player.getWeapon().getDamageBody());
                                System.out.println("Trafienie w Ciało!");
                            }
                            else {
                                System.out.println("PUDŁO");
                            }
                        }
                        break;
                    }
                }
                round = false;
            }
            else {
                System.out.println("Przeciwnik: ");
                int bit = new Random().nextInt(2);
                switch (bit){
                    case 0:{
                        for(int i = 0 ; i < enemy.getWeapon().getHitCount() ; i++){
                            int rand = new Random().nextInt(100);
                            if(rand <= enemy.getWeapon().getHitChanceHead()){
                                player.hitHead(enemy.getWeapon().getDamageHead());
                                System.out.println("Trafienie w Głowę!");
                            }
                            else {
                                System.out.println("PUDŁO");
                            }
                        }
                        break;
                    }
                    case 1:{
                        for(int i = 0 ; i < enemy.getWeapon().getHitCount() ; i++){
                            int rand = new Random().nextInt(100);
                            if(rand <= enemy.getWeapon().getHitChanceBody()){
                                player.hitBody(enemy.getWeapon().getDamageBody());
                                System.out.println("Trafienie w Ciało!");
                            }
                            else {
                                System.out.println("PUDŁO");
                            }
                        }
                        break;
                    }
                }
                round = true;
            }

            if(player.getHealthPoints() < 0 ){
                System.out.println("Koniec Gry");
                won = false;
                zgon = true;
            }
            if(enemy.getHealthPoints() < 0){
                System.out.println("Wygrana");
                System.out.println("Dostajesz "+ 10*enemyTier + "vł");
                won = false;
                player.setXp(player.getXp() + 1);
                player.setMoney(player.getMoney() + 10 * enemyTier);
            }
        }while(won);
    }

    public static void shop(){
        boolean exit = true;
        do{
            System.out.println("Witam w sklepie!");
            System.out.println("1\t-\tSklep z Bronią");
            System.out.println("2\t-\tSklep z Pancerzem Głowy");
            System.out.println("3\t-\tSklep z Pancerzem Ciała");
            System.out.println("4\t-\tSklep z Naprawami");
            System.out.println("5\t-\tEXIT");
            int choice = new Scanner(System.in).nextInt();
            switch (choice){
                case 1:{
                    weaponShop();
                    break;
                }
                case 2:{
                    armourHeadShop();
                    break;
                }
                case 3:{
                    armourBodyShop();
                    break;
                }
                case 4:{
                    repairShop();
                    break;
                }
                default:{
                    exit = false;
                    break;
                }
            }
        }while (exit);
    }

    public static void repairShop(){
        boolean exit = true;
        do{
            double percentUseHead = 100 * (player.getArmourHeadDurability() / player.getArmourHead().getDurability());
            double percentUseBody = 100 * (player.getArmourBodyDurability() / player.getArmourBody().getDurability());
            int headCost = ((int)((100 - percentUseHead)/100)) * player.getArmourHead().getCost();
            int bodyCost = ((int)((100 - percentUseHead)/100)) * player.getArmourBody().getCost();
            System.out.println("Sklep z naprawami");
            System.out.println("Twoja ilość pieniędzy: " + player.getMoney()+ "vł");
            System.out.println("1\t-\t"+ percentUseHead + "%\t"+headCost+"vł\tNapraw " + player.getArmourHead().getName());
            System.out.println("2\t-\t"+ percentUseBody + "%\t"+bodyCost+"vł\tNapraw " + player.getArmourBody().getName());
            System.out.println("3\t-\tEXIT");
            int repair = new Scanner(System.in).nextInt();
            switch (repair){
                case 1:{
                    if(player.getMoney() < headCost){
                        System.out.println("Niewystarczająca ilość vł!");
                    }else{
                        player.setMoney(player.getMoney() - headCost);
                        player.setArmourHeadDurability(player.getArmourHead().getDurability());
                        System.out.println("Naprawa dokonana!");
                    }
                    break;
                }
                case 2:{
                    player.setMoney(player.getMoney() - bodyCost);
                    player.setArmourBodyDurability(player.getArmourBody().getDurability());
                    System.out.println("Naprawa dokonana!");
                    break;
                }
                default:{
                    exit = false;
                    break;
                }
            }
        }while (exit);
    }

    public static void weaponShop(){
        boolean exit = true;
        do{
            System.out.println("Sklep z bronią");
            System.out.println("Twoja ilość pieniędzy: "                                + player.getMoney()+ "vł");
            System.out.println("Aktualna broń: "                                        + player.getWeapon().getName());
            System.out.println("1\t-\t"+ Weapon.KNIFE.getCost() +"vł\tKup "             + Weapon.KNIFE.getName());
            System.out.println("2\t-\t"+ Weapon.PISTOL.getCost() +"vł\tKup "            + Weapon.PISTOL.getName());
            System.out.println("3\t-\t"+ Weapon.MP5.getCost() +"vł\tKup "               + Weapon.MP5.getName());
            System.out.println("4\t-\t"+ Weapon.AKM.getCost() +"vł\tKup "               + Weapon.AKM.getName());
            System.out.println("5\t-\t"+ Weapon.SNIPER_RIFLE.getCost() +"vł\tKup "      + Weapon.SNIPER_RIFLE.getName());
            System.out.println("6\t-\t"+ Weapon.ROCKET_LAUNCHER.getCost() +"vł\tKup "   + Weapon.ROCKET_LAUNCHER.getName());
            System.out.println("7\t-\tEXIT");
            int input = new Scanner(System.in).nextInt();
            switch(input){
                case 1:{
                    if(player.getMoney() < Weapon.KNIFE.getCost()){
                        System.out.println("Niewystarczająca ilość vł!");
                    }else{
                        player.setMoney(player.getMoney() - Weapon.KNIFE.getCost());
                        System.out.println("Dokonano zakupu!");
                        player.setWeapon(Weapon.KNIFE);
                    }
                    break;
                }
                case 2:{
                    if(player.getMoney() < Weapon.PISTOL.getCost()){
                        System.out.println("Niewystarczająca ilość vł!");
                    }else{
                        player.setMoney(player.getMoney() - Weapon.PISTOL.getCost());
                        System.out.println("Dokonano zakupu!");
                        player.setWeapon(Weapon.PISTOL);
                    }
                    break;
                }
                case 3:{
                    if(player.getMoney() < Weapon.MP5.getCost()){
                        System.out.println("Niewystarczająca ilość vł!");
                    }else{
                        player.setMoney(player.getMoney() - Weapon.MP5.getCost());
                        System.out.println("Dokonano zakupu!");
                        player.setWeapon(Weapon.MP5);
                    }
                    break;
                }
                case 4:{
                    if(player.getMoney() < Weapon.AKM.getCost()){
                        System.out.println("Niewystarczająca ilość vł!");
                    }else{
                        player.setMoney(player.getMoney() - Weapon.AKM.getCost());
                        System.out.println("Dokonano zakupu!");
                        player.setWeapon(Weapon.AKM);
                    }
                    break;
                }
                case 5:{
                    if(player.getMoney() < Weapon.SNIPER_RIFLE.getCost()){
                        System.out.println("Niewystarczająca ilość vł!");
                    }else{
                        player.setMoney(player.getMoney() - Weapon.SNIPER_RIFLE.getCost());
                        System.out.println("Dokonano zakupu!");
                        player.setWeapon(Weapon.SNIPER_RIFLE);
                    }
                    break;
                }
                case 6:{
                    if(player.getMoney() < Weapon.ROCKET_LAUNCHER.getCost()){
                        System.out.println("Niewystarczająca ilość vł!");
                    }else{
                        player.setMoney(player.getMoney() - Weapon.ROCKET_LAUNCHER.getCost());
                        System.out.println("Dokonano zakupu!");
                        player.setWeapon(Weapon.ROCKET_LAUNCHER);
                    }
                    break;
                }
                default:{
                    exit = false;
                    break;
                }
            }
        }while(exit);

    }

    public static void armourHeadShop(){
        boolean exit = true;
        do{
            System.out.println("Sklep z pancerzem głowy");
            System.out.println("Twoja ilość pieniędzy: "                                                + player.getMoney()+ "vł");
            System.out.println("Aktualny pancerz: "                                                     + player.getArmourHead().getName());
            System.out.println("1\t-\t"+ ArmourHead.MILITARY_BERET.getCost() +"vł\tKup "                + ArmourHead.MILITARY_BERET.getName());
            System.out.println("2\t-\t"+ ArmourHead.RIOT_HELMET.getCost() +"vł\tKup "                   + ArmourHead.RIOT_HELMET.getName());
            System.out.println("3\t-\t"+ ArmourHead.STEEL_HELMET.getCost()+ "vł\tKup "                  + ArmourHead.STEEL_HELMET.getName());
            System.out.println("4\t-\t"+ ArmourHead.BALLISTIC_HELMET.getCost() +"vł\tKup "              + ArmourHead.BALLISTIC_HELMET.getName());
            System.out.println("5\t-\t"+ ArmourHead.SPECNAZ_MVD_HELMET.getCost() +"vł\tKup "            + ArmourHead.SPECNAZ_MVD_HELMET.getName());
            System.out.println("6\t-\t"+ ArmourHead.MILITARY_EXOSKELETON_HELMET.getCost() +"vł\tKup "   + ArmourHead.MILITARY_EXOSKELETON_HELMET.getName());
            System.out.println("7\t-\tEXIT");
            int input = new Scanner(System.in).nextInt();
            switch(input){
                case 1:{
                    if(player.getMoney() < ArmourHead.MILITARY_BERET.getCost()){
                        System.out.println("Niewystarczająca ilość vł!");
                    }else{
                        player.setMoney(player.getMoney() - ArmourHead.MILITARY_BERET.getCost());
                        System.out.println("Dokonano zakupu!");
                        player.setArmourHead(ArmourHead.MILITARY_BERET);
                    }
                    break;
                }
                case 2:{
                    if(player.getMoney() < ArmourHead.RIOT_HELMET.getCost()){
                        System.out.println("Niewystarczająca ilość vł!");
                    }else{
                        player.setMoney(player.getMoney() - ArmourHead.RIOT_HELMET.getCost());
                        System.out.println("Dokonano zakupu!");
                        player.setArmourHead(ArmourHead.RIOT_HELMET);
                    }
                    break;
                }
                case 3:{
                    if(player.getMoney() < ArmourHead.STEEL_HELMET.getCost()){
                        System.out.println("Niewystarczająca ilość vł!");
                    }else{
                        player.setMoney(player.getMoney() - ArmourHead.STEEL_HELMET.getCost());
                        System.out.println("Dokonano zakupu!");
                        player.setArmourHead(ArmourHead.STEEL_HELMET);
                    }
                    break;
                }
                case 4:{
                    if(player.getMoney() < ArmourHead.BALLISTIC_HELMET.getCost()){
                        System.out.println("Niewystarczająca ilość vł!");
                    }else{
                        player.setMoney(player.getMoney() - ArmourHead.BALLISTIC_HELMET.getCost());
                        System.out.println("Dokonano zakupu!");
                        player.setArmourHead(ArmourHead.BALLISTIC_HELMET);
                    }
                    break;
                }
                case 5:{
                    if(player.getMoney() < ArmourHead.SPECNAZ_MVD_HELMET.getCost()){
                        System.out.println("Niewystarczająca ilość vł!");
                    }else{
                        player.setMoney(player.getMoney() - ArmourHead.SPECNAZ_MVD_HELMET.getCost());
                        System.out.println("Dokonano zakupu!");
                        player.setArmourHead(ArmourHead.SPECNAZ_MVD_HELMET);
                    }
                    break;
                }
                case 6:{
                    if(player.getMoney() < ArmourHead.MILITARY_EXOSKELETON_HELMET.getCost()){
                        System.out.println("Niewystarczająca ilość vł!");
                    }else{
                        player.setMoney(player.getMoney() - ArmourHead.MILITARY_EXOSKELETON_HELMET.getCost());
                        System.out.println("Dokonano zakupu!");
                        player.setArmourHead(ArmourHead.MILITARY_EXOSKELETON_HELMET);
                    }
                    break;
                }
                default:{
                    exit = false;
                    break;
                }
            }
        }while(exit);
        player.setArmourHeadDurability(player.getArmourHead().getDurability());
    }

    public static void armourBodyShop(){
        boolean exit = true;
        do{
            System.out.println("Sklep z pancerzem ciała");
            System.out.println("Twoja ilość pieniędzy: "                                            + player.getMoney()+ "vł");
            System.out.println("Twój aktualny pancerz: "                                            + player.getArmourBody().getName());
            System.out.println("1\t-\t"+ ArmourBody.MILITARY_UNIFORM.getCost() +"vł\tKup "          + ArmourBody.MILITARY_UNIFORM.getName());
            System.out.println("2\t-\t"+ ArmourBody.LIGHT_BULLETPROOF_VEST.getCost() +"vł\tKup "    + ArmourBody.LIGHT_BULLETPROOF_VEST.getName());
            System.out.println("3\t-\t"+ ArmourBody.BULLETPROOF_VEST.getCost()+"vł\tKup "           + ArmourBody.BULLETPROOF_VEST.getName());
            System.out.println("4\t-\t"+ ArmourBody.HEAVY_BULLETPROOF_VEST.getCost() +"vł\tKup "    + ArmourBody.HEAVY_BULLETPROOF_VEST.getName());
            System.out.println("5\t-\t"+ ArmourBody.COMBAT_ARMOUR.getCost() +"vł\tKup "             + ArmourBody.COMBAT_ARMOUR.getName());
            System.out.println("6\t-\t"+ ArmourBody.MILITARY_EXOSKELETON.getCost() +"vł\tKup "      + ArmourBody.MILITARY_EXOSKELETON.getName());
            System.out.println("7\t-\tEXIT");
            int input = new Scanner(System.in).nextInt();
            switch(input){
                case 1:{
                    if(player.getMoney() < ArmourBody.MILITARY_UNIFORM.getCost()){
                        System.out.println("Niewystarczająca ilość vł!");
                    }else{
                        player.setMoney(player.getMoney() - ArmourBody.MILITARY_UNIFORM.getCost());
                        System.out.println("Dokonano zakupu!");
                        player.setArmourBody(ArmourBody.MILITARY_UNIFORM);
                    }
                    break;
                }
                case 2:{
                    if(player.getMoney() < ArmourBody.LIGHT_BULLETPROOF_VEST.getCost()){
                        System.out.println("Niewystarczająca ilość vł!");
                    }else{
                        player.setMoney(player.getMoney() - ArmourBody.LIGHT_BULLETPROOF_VEST.getCost());
                        System.out.println("Dokonano zakupu!");
                        player.setArmourBody(ArmourBody.LIGHT_BULLETPROOF_VEST);
                    }
                    break;
                }
                case 3:{
                    if(player.getMoney() < ArmourBody.BULLETPROOF_VEST.getCost()){
                        System.out.println("Niewystarczająca ilość vł!");
                    }else{
                        player.setMoney(player.getMoney() - ArmourBody.BULLETPROOF_VEST.getCost());
                        System.out.println("Dokonano zakupu!");
                        player.setArmourBody(ArmourBody.BULLETPROOF_VEST);
                    }
                    break;
                }
                case 4:{
                    if(player.getMoney() < ArmourBody.HEAVY_BULLETPROOF_VEST.getCost()){
                        System.out.println("Niewystarczająca ilość vł!");
                    }else{
                        player.setMoney(player.getMoney() - ArmourBody.HEAVY_BULLETPROOF_VEST.getCost());
                        System.out.println("Dokonano zakupu!");
                        player.setArmourBody(ArmourBody.HEAVY_BULLETPROOF_VEST);
                    }
                    break;
                }
                case 5:{
                    if(player.getMoney() < ArmourBody.COMBAT_ARMOUR.getCost()){
                        System.out.println("Niewystarczająca ilość vł!");
                    }else{
                        player.setMoney(player.getMoney() - ArmourBody.COMBAT_ARMOUR.getCost());
                        System.out.println("Dokonano zakupu!");
                        player.setArmourBody(ArmourBody.COMBAT_ARMOUR);
                    }
                    break;
                }
                case 6:{
                    if(player.getMoney() < ArmourBody.MILITARY_EXOSKELETON.getCost()){
                        System.out.println("Niewystarczająca ilość vł!");
                    }else{
                        player.setMoney(player.getMoney() - ArmourBody.MILITARY_EXOSKELETON.getCost());
                        System.out.println("Dokonano zakupu!");
                        player.setArmourBody(ArmourBody.MILITARY_EXOSKELETON);
                    }
                    break;
                }
                default:{
                    exit = false;
                    break;
                }
            }
        }while(exit);
        player.setArmourBodyDurability(player.getArmourBody().getDurability());
    }
}