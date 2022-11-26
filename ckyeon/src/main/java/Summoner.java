public class Summoner {
    Champion champion;
    Spell spell;

    public Summoner(){
        System.out.println("소환사가 게임에 입장했습니다.");
    }
    void selectChampion(Champion champion){
        this.champion = champion;
    }

    void setSpell(Spell spell){
        this.spell = spell;
        System.out.println(spell + "을 선택했습니다.");
    }

    void useSpell(){
        System.out.println(spell + "을 사용합니다.");
        spell.use();
    }

    void attack(){
        System.out.println(champion + "이(가) 공격합니다.");
        champion.attack();
    }
}
