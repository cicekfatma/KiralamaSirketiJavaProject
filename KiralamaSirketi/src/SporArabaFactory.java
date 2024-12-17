public class SporArabaFactory implements IAracFactory{
    @Override
    public IMotor motorUret(){
        System.out.println("Motor Üretildi");
        return new SporArabaMotor();

    }
    @Override

    public ILastik lastikUret(){
        System.out.println("Lastik Üretildi");
       return new SporArabaLastik();
    }
    @Override
    public IIcMekan icMekanUret(){
        System.out.println("İç Mekan Üretildi");
        return new SporArabaIcMekan();

    }
}
