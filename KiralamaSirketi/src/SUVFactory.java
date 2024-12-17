public class SUVFactory implements IAracFactory{
    @Override
    public IMotor motorUret()
    {
        System.out.println("Motor Üretildi");
      return new SUVMotor();
    }
    @Override
    public ILastik lastikUret(){

        System.out.println("Lastik Üretildi");
        return new SUVLastik();
    }
    @Override
    public IIcMekan icMekanUret(){
        System.out.println("İç Mekan Üretildi");
        return new SUVIcMekan();
    }
}
