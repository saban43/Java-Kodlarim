
public class ToolStore extends SafeLocation{

    ToolStore(Player player){
        super(player,"Mağaza");
    }

    @Override
    public boolean getLocation(){
        System.out.println("\nMevcut Altın: " + player.getGold());
        System.out.println("1- Silahlar");
        System.out.println("2- Zırhlar");
        System.out.println("3- Çıkış");
        System.out.print("Seçimin: ");
        int selectTool = scan.nextInt();
        int selectItemID;

        switch (selectTool){
            case 1:
                selectItemID = weaponMenu();
                buyWeapon(selectItemID);
                break;
            case 2:
                selectItemID = armorMenu();
                buyArmor(selectItemID);
                break;
            case 3:
                System.out.println("Çıkış yapılıyor.");
                break;
            default:
                break;
        }
        return true;
    }

    public int weaponMenu(){
        System.out.println("\n1- Kılıç\t Fiyat: 25 - Hasar: 2");
        System.out.println("2- Yay\t Fiyat: 35 - Hasar: 3");
        System.out.println("3- Savaş Baltası\t Fiyat: 45 - Hasar: 7");
        System.out.println("4- Çıkış");
        System.out.print("Seçimin: ");
        int selectWeaponID = scan.nextInt();
        return selectWeaponID;
    }

    public  void  buyWeapon(int itemID){
        int damage = 0, price = 0;
        String wName = null;
                switch (itemID){
                    case 1:
                        damage = 2;
                        price = 25;
                        wName = "Kılıç";
                        break;
                    case 2:
                        damage = 3;
                        price = 35;
                        wName = "Yay";
                        break;
                    case 3:
                        damage = 7;
                        price = 45;
                        wName = "Savaş Baltası";
                        break;
                    case 4:
                        System.out.println("Çıkış yapılıyor.");
                        break;
                    default:
                        System.out.println("Geçersiz işlem!!");
                }
                if(price > 0){
                    if(player.getGold() >= price){
                        player.getInventory().setDamage(damage);
                        player.getInventory().setWeaponName(wName);
                        player.setGold(player.getGold() - price);

                        System.out.println("Satın alım başarılı bir şekilde gerçekleşti!");
                        System.out.println("Önceki hasar: "+ player.getDamage() + " , Yeni hasar: "
                                + player.getTotalDamage() );
                        System.out.println("Kalan Altın: " + player.getGold());

                    }else {
                        System.out.println("Yeterli altının yok!!");
                    }
                }
    }

    public int armorMenu(){
        System.out.println("\n1- Bakır Zırh\t Fiyat: 15 - Engelleme: 1");
        System.out.println("2- Demir Zırh\t Fiyat: 25 - Engelleme: 3");
        System.out.println("3- Çelik Zırh\t Fiyat: 40 - Engelleme: 5");
        System.out.println("4- Çıkış");
        System.out.print("Seçimin: ");
        int selectArmorID = scan.nextInt();
        return selectArmorID;
    }

    public  void  buyArmor(int itemID){
        int avoid = 0, price = 0;
        String aName = null;
        switch (itemID){
            case 1:
                avoid = 1;
                price = 15;
                aName = "Bakır Zırh";
                break;
            case 2:
                avoid = 3;
                price = 25;
                aName = "Demir Zırh";
                break;
            case 3:
                avoid = 5;
                price = 40;
                aName = "Çelik Zırh";
                break;
            case 4:
                System.out.println("Çıkış yapılıyor.");
                break;
            default:
                System.out.println("Geçersiz işlem!!");
        }
        if(price > 0){
            if(player.getGold() >= price){
                player.getInventory().setArmor(avoid);
                player.getInventory().setArmorName(aName);
                player.setGold(player.getGold() - price);

                System.out.println("Satın alım başarılı bir şekilde gerçekleşti!");
                System.out.println("Engellenen Hasar: " + player.getInventory().getArmor());
                System.out.println("Kalan Altın: " + player.getGold());

            }else {
                System.out.println("Yeterli altının yok!!");
            }
        }
    }
}
