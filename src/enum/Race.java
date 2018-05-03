import java.util.HashMap;
import java.util.Map;

public enum Race {
    THE_BARONY_OF_LETNEV(1),
    THE_EMIRATES_OF_HACAN(2),
    FEDERATION_OF_SOL(3),
    THE_L1Z1X_MINDNET(4),
    THE_MENTAK_COALITION(5),
    THE_NAALU_COLLECTIVE(6),
    SARDAKK_NORR(7),
    THE_UNIVERSITIES_OF_JOLNAR(8),
    THE_XXCHA_KINGDOM(9),
    THE_YSSARIL_TRIBES(10),
    THE_CLAN_OF_SAAR(11),
    THE_NEKRO_VIRUS(12),
    THE_ARBOREC(13),
    THE_YIN_BROTHERHOOD(14),
    THE_GHOSTS_OF_CREUSS(15),
    THE_WINNU(16);

    private int raceValue;

    private Race(int raceValue){
        this.raceValue = raceValue;
    }
    public int getRaceValue(){
        return raceValue;
    }
    public void setRaceValue(int raceValue){
        this.raceValue = raceValue;
    }

    public static Race getRaceValueById(int id) {
        Race race = null;

        switch (id) {
            case 1:
                race = THE_BARONY_OF_LETNEV;
                break;
            case 2:
                race = THE_EMIRATES_OF_HACAN;
                break;
            case 3:
                race = FEDERATION_OF_SOL;
                break;
            case 4:
                race = THE_L1Z1X_MINDNET;
                break;
            case 5:
                race = THE_MENTAK_COALITION;
                break;
            case 6:
                race = THE_NAALU_COLLECTIVE;
                break;
            case 7:
                race = SARDAKK_NORR;
                break;
            case 8:
                race = THE_UNIVERSITIES_OF_JOLNAR;
                break;
            case 9:
                race = THE_XXCHA_KINGDOM;
                break;
            case 10:
                race = THE_YSSARIL_TRIBES;
                break;
            case 11:
                race = THE_CLAN_OF_SAAR;
                break;
            case 12:
                race = THE_NEKRO_VIRUS;
                break;
            case 13:
                race = THE_ARBOREC;
                break;
            case 14:
                race = THE_YIN_BROTHERHOOD;
                break;
            case 15:
                race = THE_GHOSTS_OF_CREUSS;
                break;
            case 16:
                race = THE_WINNU;
                break;
            default:
                break;
            }
            return race;
        }
    }
