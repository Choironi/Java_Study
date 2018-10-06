package ce;

public class Setting {

    private static Setting ourInstance = new Setting();

    public static Setting getInstance() {
        return ourInstance;
    }

    private Setting() { //싱글톤패턴

    }

}
