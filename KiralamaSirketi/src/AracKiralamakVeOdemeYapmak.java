public class AracKiralamakVeOdemeYapmak {
    public void aracKirala(String aracTipi){
        if(aracTipi== "sedan"){
            IAracFactory aracFactory = new SedanFactory();
            System.out.println(aracTipi);
            aracFactory.motorUret().motorUret();
            aracFactory.lastikUret();
            aracFactory.icMekanUret();

        }
        else if(aracTipi== "suv"){
            IAracFactory aracFactory = new SUVFactory();
            System.out.println(aracTipi);
            aracFactory.motorUret();
            aracFactory.lastikUret();
            aracFactory.icMekanUret();

        }
        else if(aracTipi=="spor araba"){
            IAracFactory aracFactory = new SporArabaFactory();
            System.out.println(aracTipi);
            aracFactory.motorUret();
            aracFactory.lastikUret();
            aracFactory.icMekanUret();

        }


    }
    public void odemeYap(String OdemeTuru,double miktar){
            if(OdemeTuru=="kredi kartı"){
                IOdemeStratejisi odemeStratejisi= new KrediKartiOdeme();
                odemeStratejisi.OdemeYap(miktar);
                System.out.println(miktar);
            }
            else if(OdemeTuru=="banka kartı"){
                IOdemeStratejisi odemeStratejisi = new BankaKartiOdeme();
                odemeStratejisi.OdemeYap(miktar);
                System.out.println(miktar);
            }
            else if(OdemeTuru== "nakit"){
                IOdemeStratejisi odemeStratejisi = new NakitOdeme();
                odemeStratejisi.OdemeYap(miktar);
                System.out.println(miktar);
            }
    }
}
