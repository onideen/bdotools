package no.didi.bdotools.domain.util;

import no.didi.bdotools.domain.BDOStat;
import no.didi.bdotools.domain.BDOStat.BDOStatBuilder;

/**
 * @author Vegar Engen
 */
public final class TestUtil {
    public static final int AP = 120;
    public static final int AWAKENING_AP = 187;
    public static final int DP = 256;

    public static BDOStatBuilder createBdoStatBuilder(){
        return BDOStat.builder()
                .ap(AP)
                .awakeningAp(AWAKENING_AP)
                .dp(DP);
    }
}
