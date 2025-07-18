import java.util.Random;

public abstract class BattleLocation extends Location{     //abstract olarak tanımladık çünkü buradan nesne üretilsin istemiyorum
        protected Obstacle obstacle;
        protected String locationAward;
        Random rand = new Random();

    BattleLocation(Player player,String name,Obstacle obstacle,String locationAward){
        super(player);
        this.name = name;
        this.obstacle = obstacle;
        this.locationAward = locationAward;
    }

    @Override
    public boolean getLocation(){
        int obsCount = obstacle.count();
        System.out.println("Şuan buradasın: " + this.name);
        System.out.println("Dikkatli ol! Burada " + obsCount + " tane " + obstacle.getName() + " var!");
        System.out.print("<S>avas  veya <K>aç :");
        String selectCase = scan.nextLine();
        selectCase = selectCase.toUpperCase();

        if (selectCase.equals("S")) {
            if ( combat(obsCount)){
                System.out.println( this.getName() + " bölgesindeki tüm düşmanlar alt edildi!!");
                if(this.locationAward.equals("Yemek") &&player.getInventory().isFood() == false){
                    System.out.println(this.locationAward + " kazandın! ");
                    player.getInventory().setFood(true);
                } else if(this.locationAward.equals("Su") &&player.getInventory().isWater() == false){
                    System.out.println(this.locationAward + " kazandın! ");
                    player.getInventory().setWater(true);
                } else if(this.locationAward.equals("Kömür") &&player.getInventory().isFirewood() == false){
                    System.out.println(this.locationAward + " kazandın! ");
                    player.getInventory().setFirewood(true);
                }
                return true;
            }
            if (player.getHealth() <= 0){
                System.out.println("ÖLDÜN!! Köyü kurtaramadın!");
                return false;
            }
        }
        else if (selectCase.equals("K")){
            int randGold = rand.nextInt(5) + 3 ;
            player.setGold(player.getGold() - randGold );
            System.out.println("Hay aksi! Kaçarken " + randGold + " tane altın kaybettin!");
            System.out.println("Mevcut altının: " + player.getGold());
            return true;
        }
//*****************************
        else if(!selectCase.equals("K") || !selectCase.equals("S")){
            System.out.println("Hatalı tusladın savaşçı!!");
            return true;
        }
        return true;
    }

    public boolean combat(int obsCount){
        for (int i=0 ; i < obsCount ; i++){
            int defObHealth = obstacle.getHealth();     // her bir canavarin canını savas bitimi ayarlayabilmek için
            playerStats();
            enemyStats();
            while (player.getHealth() > 0 && obstacle.getHealth() > 0){
                System.out.print("<V>ur veya <K>aç :");
                String selectCase = scan.nextLine();
                selectCase = selectCase.toUpperCase();
                if (selectCase.equals("V")){
                    System.out.println("Saldırı yapıldı!");
                    obstacle.setHealth(obstacle.getHealth() - player.getTotalDamage());
                    aferHits();
                        if(obstacle.getHealth() > 0){   //canavarın canı 0 dan büyük ise canavar bize saldıracak
                            System.out.println(obstacle.getName() + " sana saldırdı!");
                            player.setHealth(player.getHealth() - (obstacle.getDamage() - player.getInventory().getArmor()) );
                            System.out.println("Kalan canın: " + player.getHealth());
                        }
                }else if (selectCase.equals("K")){
                    int randGold = rand.nextInt(5) + 3 ;
                    player.setGold(player.getGold() - randGold );
                    System.out.println("Hay aksi! Kaçarken " + randGold + " tane altın kaybettin!");
                    System.out.println("Mevcut altının: " + player.getGold());
                    return false;
                }
            }

            if (obstacle.getHealth() <= 0  && player.getHealth() > 0){
                System.out.println("Düşman alt edildi!");
                player.setGold(player.getGold() + obstacle.getAward() );
                System.out.println("Yeni mevcut altının: " + player.getGold() );
                obstacle.setHealth(defObHealth);
            }else {
                return false;
            }
            System.out.println("-------------------");
        }
        return true;
    }

    public void playerStats(){
        System.out.println("Karakterinin Değerleri\n----------------");
        System.out.println("Sağlık: " + player.getHealth() );
        System.out.println("Hasar: " + player.getTotalDamage() );
        System.out.println(" Altın: " + player.getGold());

        if (player.getInventory().getDamage() > 0){
            System.out.println("Silah: " + player.getInventory().getWeaponName());
        }
        if (player.getInventory().getArmor() > 0){
            System.out.println("Zırh: " + player.getInventory().getArmorName());
        }
    }

    public void enemyStats(){
        System.out.println(obstacle.getName() + " Değerleri\n----------------");
        System.out.println("Sağlık: " + obstacle.getHealth() );
        System.out.println("Hasar: " + obstacle.getDamage() );
        System.out.println("Ödül: " + obstacle.getAward() );
    }

    public void aferHits(){
        System.out.println(obstacle.getName() + " kalan canı: " +obstacle.getHealth());
        System.out.println();
    }
}
