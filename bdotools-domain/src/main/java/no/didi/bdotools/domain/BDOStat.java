package no.didi.bdotools.domain;

import lombok.*;

import java.time.LocalDateTime;

/**
 * @author Vegar Engen
 */

@Getter
@ToString
public class BDOStat implements Comparable<BDOStat>{

    private int ap;

    private int awakeningAp;

    private int dp;

    private LocalDateTime changeStamp;

    @Builder
    private BDOStat( @NonNull int ap, @NonNull int awakeningAp, @NonNull int dp){
        this.ap = ap;
        this.awakeningAp = awakeningAp;
        this.dp = dp;
        this.changeStamp = LocalDateTime.now();
    }

    @Override
    public int compareTo(BDOStat o) {
        return getChangeStamp().isAfter(o.getChangeStamp()) ? -1 : 1;
    }
}
