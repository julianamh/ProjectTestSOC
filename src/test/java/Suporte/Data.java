package Suporte;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Data {

    public static String data()
    {
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        return dateName;
    }
}
