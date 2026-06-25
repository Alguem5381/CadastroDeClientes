package util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataFormatada {
    public static String FormatarData(){
    LocalDate now = LocalDate.now();
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String dataFormatada = now.format(formato);
    return dataFormatada;
    }
}
