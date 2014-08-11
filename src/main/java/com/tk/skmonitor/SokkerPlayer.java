package com.tk.skmonitor;

import java.util.Map;

/**
 * Created by ja on 05.08.2014.
 *
 <player>
 <ID>19930852</ID>
 <name>Walter</name>
 <surname>Bäuerle</surname>
 <countryID>15</countryID>
 <age>30</age>
 <height>173</height>
 <weight>69.9</weight>
 <BMI>23.35</BMI>
 <teamID>3477</teamID>
 <youthTeamID>0</youthTeamID>
 <value>1993000</value>
 <wage>24400</wage>
 <cards>2</cards>
 <goals>1</goals>
 <assists>3</assists>
 <matches>174</matches>
 <ntCards>0</ntCards>
 <ntGoals>0</ntGoals>
 <ntAssists>0</ntAssists>
 <ntMatches>0</ntMatches>
 <injuryDays>0</injuryDays>
 <national>0</national>
 <skillForm>11</skillForm>
 <skillExperience>11</skillExperience>
 <skillTeamwork>2</skillTeamwork>
 <skillDiscipline>7</skillDiscipline>
 <transferList>0</transferList>
 <skillStamina>10</skillStamina>
 <skillPace>14</skillPace>
 <skillTechnique>9</skillTechnique>
 <skillPassing>7</skillPassing>
 <skillKeeper>1</skillKeeper>
 <skillDefending>12</skillDefending>
 <skillPlaymaking>6</skillPlaymaking>
 <skillScoring>6</skillScoring>
 </player>

 */


public class SokkerPlayer {
    private String id;
    private String name;
    private String surname;
    private int countryID;
    private int age;
    private int height;
    private double weight;
    private double BMI;
    private long teamID;
    private long value;
    private long wage;
    private int cards;
    private int goals;
    private int assists;
    private int matches;
    private int ntCards;
    private int ntGoals;
    private int ntAssists;
    private int ntMatches;
    private int injuryDays;
    private int national;
    private Map<String, SkillValue> skills;
}
