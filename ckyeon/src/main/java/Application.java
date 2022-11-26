public class Application {

    public static void main(String[] args) {
        Summoner summonerA = new Summoner();
        summonerA.setSpell(new Ignite());
        summonerA.selectChampion(new Aatrox());

        Summoner summonerB = new Summoner();
        summonerB.setSpell(new Flash());
        summonerB.selectChampion(new VoliBear());

        summonerA.attack();
        summonerA.useSpell();


        summonerB.attack();
        summonerB.useSpell();
    }
}
