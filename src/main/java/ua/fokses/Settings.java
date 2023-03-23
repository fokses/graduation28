package ua.fokses;

import java.util.HashMap;
import java.util.Map;

import static org.hibernate.cfg.AvailableSettings.*;

public class Settings {
    public static Map<String, String> getHibernateSettingsMap() {
        Map<String, String> map = new HashMap<>();
            map.put(FORMAT_SQL, "true");
//            map.put(JAKARTA_HBM2DDL_SCRIPTS_ACTION, "drop-and-create");
//            map.put(JAKARTA_HBM2DDL_SCRIPTS_CREATE_TARGET, "C:\\Users\\Ruslan.Budaiev\\IdeaProjects\\graduation28\\src\\main\\resources\\sql\\create.sql");
//            map.put(JAKARTA_HBM2DDL_SCRIPTS_DROP_TARGET, "C:\\Users\\Ruslan.Budaiev\\IdeaProjects\\graduation28\\src\\main\\resources\\sql\\drop.sql");
            map.put(HBM2DDL_AUTO, "create");

        return map;
    }
}
