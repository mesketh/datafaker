package net.datafaker.providers.show;

import net.datafaker.providers.base.AbstractProvider;

/**
 * @since 0.8.0
 */
public class StarTrek extends AbstractProvider<ShowProviders> {

    protected StarTrek(ShowProviders faker) {
        super(faker);
    }

    public String character() {
        return resolve("star_trek.character");
    }

    public String location() {
        return resolve("star_trek.location");
    }

    public String species() {
        return resolve("star_trek.species");
    }

    public String villain() {
        return resolve("star_trek.villain");
    }

    public String klingon() {
        return resolve("star_trek.klingon");
    }
}
