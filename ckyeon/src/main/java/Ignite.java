public class Ignite implements Spell{

    @Override
    public void use() {
        System.out.println("점화로 적에게 지속적인 피해를 입힙니다.");
    }

    @Override
    public String toString(){
        return "점화";
    }
}
