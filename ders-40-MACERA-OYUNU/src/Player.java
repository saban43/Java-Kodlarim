import java.util.Scanner;

public class Player {
    private int damage,health,gold,realHealth;
    private String name, characterName;
    private Inventory inventory;
    Scanner scan = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    public void selectCharacter(){
        switch (characterMenu()){
            case 1:
                initPlayer("Samuray", 5, 21, 15);
                break;
            case 2:
                initPlayer("Okçu", 7, 18, 20);
                break;
            case 3:
                initPlayer("Şövalye", 8, 24, 5);
                break;

            default:    // olurda bir hata ile yanlıs secim olursa karakteri samuray olarak ayarlıyorum.
                initPlayer("Samuray", 5, 21, 15);
                break;
        }
        System.out.println(getCharacterName() +" "+ this.name + " macera başlıyor!" + " Hasarın:" + getDamage()
                + " Saglığın:" + getHealth() + " Altının:" + getGold());
    }

    public int characterMenu(){
        System.out.println("Maceranda hangi tür savaşcı olmak istersin " + this.name +"?");
        System.out.println("1- Samuray => Hasar: 5  Sağlık: 21  Altın: 15");
        System.out.println("2- Okçu => Hasar: 7  Sağlık: 18  Altın: 20");
        System.out.println("3- Sövalye => Hasar: 8  Sağlık: 24  Altın: 5");
        System.out.print("Seçimin: ");
        int charID = scan.nextInt();

        while ( charID < 1 || charID > 3 ){
            System.out.print("Lütfen geçerli bir karakter seçiniz: ");
            charID = scan.nextInt();
        }

        return charID;
    }

    public int getTotalDamage(){
       return this.getDamage() + this.getInventory().getDamage();
    }

    // switch-case yapısında her seferinde set metotlarını yazmamak icin initPlayer methodunu olusturdum
    public void initPlayer(String cName,int dmg,int hlth,int gold){
        setCharacterName(cName);
        setDamage(dmg);
        setHealth(hlth);
        setGold(gold);
        setRealHealth(hlth);
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getRealHealth() {
        return realHealth;
    }

    public void setRealHealth(int realHealth) {
        this.realHealth = realHealth;
    }
}
