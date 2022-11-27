package strategy;

import java.util.Arrays;

public class Example {

    public static void main(String[] args) {
        HeroInfo[] heroInfos = HeroInfo.values();

        Arrays.stream(heroInfos)
            .forEach(heroInfo -> {
                Hero hero = HeroFactory.generate(heroInfo);
                hero.introduce();
                hero.attack();
            });
    }
}
