package com.sik.footy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Constants {
    /**
     * The total of the multipliers below must add up to 2 exactly.
     */
    public static final List<Double> LAST_6_MULTIPLIERS = Arrays.asList(0.04D,0.06D,0.1D,0.2D,0.6D,1.0D);

    public static final Double GOALS_FOR_DELTA_DRAW_MAX = 0.9;

    public static final Map<String,String> TABLE_URL_MAP = Stream.of("championship=https://www.bbc.co.uk/sport/football/championship/table",
            "premier-league=https://www.bbc.co.uk/sport/football/premier-league/table",
                    "league-one=https://www.bbc.co.uk/sport/football/league-one/table",
                    "league-two=https://www.bbc.co.uk/sport/football/league-two/table")
            .map(elem -> elem.split("="))
            .filter(elem -> elem.length==2)
            .collect(Collectors.toMap(e -> e[0], e -> e[1]));

    public static final Map<String,String> FIXTURE_URL_MAP = Stream.of("championship=https://www.bbc.co.uk/sport/football/championship/scores-fixtures",
                    "premier-league=https://www.bbc.co.uk/sport/football/premier-league/scores-fixtures",
                    "league-one=https://www.bbc.co.uk/sport/football/league-one/scores-fixtures",
                    "league-two=https://www.bbc.co.uk/sport/football/league-two/scores-fixtures")
            .map(elem -> elem.split("="))
            .filter(elem -> elem.length==2)
            .collect(Collectors.toMap(e -> e[0], e -> e[1]));

}
