public class Flash implements Spell{

    @Override
    public void use() {
        System.out.println("점멸로 빠르게 이동합니다.");
    }

    @Override
    public String toString(){
        return "점멸";
    }
}
