public class SedanFactory implements IAracFactory{

    @Override
    public IMotor motorUret() {
        System.out.println("Motor Üretildi");
        return new SedanMotor();
    }

    public ILastik lastikUret() {
        System.out.println("Lastik Üretildi");
        return new SedanLastik();
    }

    @Override

    public IIcMekan icMekanUret() {
        System.out.println("İç mekan üretildi");
        return new SedanIcMekan();
    }
}
