public abstract class SafeLocation extends Location{    //abstract olarak tanımladık çünkü buradan nesne üretilsin istemiyorum

    SafeLocation(Player player,String name){
        super(player);
        this.name = name;
    }

    @Override
    public boolean getLocation(){
        return true;
    }
}
