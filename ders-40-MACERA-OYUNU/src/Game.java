import java.util.Scanner;

public class Game {
    Player player;
    Location location;
    Scanner scan = new Scanner(System.in);

    public void login(){
        Scanner scan = new Scanner(System.in);

        System.out.println("\n\tKöy Muhtarı: Hoşgeldin Maceracı! Tüm köy halkı merakla seni bekliyordu. Bilge köylünün söylediğine göre yakında" +
                " felaket bir kar fırtınası tüm köyü saracak!");
        System.out.println("\tKar fırtınası köye ulaşmadan önce yeterince su,yemek ve kömür toplaman lazım. Bu görevi başaracağından eminim!");
        System.out.println("\tKöy halkı çok heyecanlı. Ve herkes köyün kahramanının ismini merak ediyor!");
        System.out.print("İsmin: ");
        String playerName = scan.nextLine();

        player = new Player(playerName);
        player.selectCharacter();
        start();
    }

    public void start(){
        while (true){
            System.out.println("\n======================================================================================");
            System.out.println("\nNereye gitmek istersin?");
            System.out.println("1- Güvenli Ev --> Sana ait dinlenebileceğin güvenli bir ev.3 altın karşılığında canını doldurabilirsin");
            System.out.println("2- Mağara --> Karşına Zombi çıkabilir!");
            System.out.println("3- Orman --> Karşına Kurt çıkabilir!");
            System.out.println("4- Nehir --> Karşına Ayı çıkabilir!");
            System.out.println("5- Mağaza --> Bir miktar altın karşılığında Silah veya Zırh alabilirsin");
            System.out.print("Seçimin: ");
            int sellectLocation = scan.nextInt();
            while (sellectLocation < 1 || sellectLocation > 5){
                System.out.print("Lütfen geçerli bir yer seçiniz:");
                sellectLocation = scan.nextInt();
            }

            switch (sellectLocation){
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new Cave(player);
                    break;
                case 3:
                    location = new Forest(player);
                    break;
                case 4:
                    location = new River(player);
                    break;
                case 5:
                    location = new ToolStore(player);
                    break;
                default:
                    location = new SafeHouse(player);
            }

            //Oyunu kazanma şartı
            if (location.getClass().getName().equals("SafeHouse")){       //location.getName() == "Güvenli Ev"    aynı şey galiba
                if(player.getInventory().isFirewood() && player.getInventory().isWater() && player.getInventory().isFood()){
                    System.out.println("\n\n\tMuhtar: Harikasın savaşcı! Köyü büyük afetten kurtardın! Tüm halk çok heyecanlı! " +
                            "Fırtına gelmeden şenlik düzenlenecek!");
                            break;  //Baska islem yapmak istersen break yerine devam ettirebilirsin
                }
            }

           if( !location.getLocation() ){
               System.out.println("Düşman seni öldürdü! Kaybettin!");
               break;
           }


        }

    }
}
