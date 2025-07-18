public class SafeHouse extends SafeLocation{

    public SafeHouse(Player player) {
        super(player, "Güvenli Ev");
    }

    @Override
    public boolean getLocation(){
        player.setHealth(player.getRealHealth());
        player.setGold(player.getGold() - 3 );
        System.out.println("Sağlığınız 3 altın karşılığında maximum seviyede iyileştirildi!");
        return true;
    }

}
