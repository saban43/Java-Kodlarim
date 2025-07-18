import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {

        // LinkedHasSet ile HasSet in farkı linkedhasset de girilen sıra ile çıktı veriyor ancak hashset de böyle bir kural yok
        // ikisinin de ortak mözelliği ayntı türde aynı elemanları birden fazla kez bulundurmuyor

        LinkedHashSet gunler = new LinkedHashSet();

        gunler.add("pazartesi");
        gunler.add("salı");
        gunler.add("çarsamba");
        gunler.add("perşembe");
        gunler.add("cuma");
        gunler.add("cumartesi");
        gunler.add("pazar");

        gunler.add("pazartesi");

        gunler.forEach(item -> System.out.print(item + ","));

    }
}