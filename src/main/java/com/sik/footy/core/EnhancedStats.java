package com.sik.footy.core;

import lombok.*;

@Builder
@Getter
@ToString
@EqualsAndHashCode
public class EnhancedStats {
    Double averageGoalsFor;
    Double averageGoalsAgainst;
    Double averageGoalDifference;
    Double lastSixFormFactor;

}
