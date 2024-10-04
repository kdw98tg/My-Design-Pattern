package src.builder;

import src.builder.builder.CityVacationBuilder;
import src.builder.builder.OutdoorsVacationBuilder;
import src.builder.builder.VacationBuilder;
import src.builder.elements.Vacation;

public class Main {
    public static void main(String[] args) {
        VacationBuilder cityVacationBuilder = new CityVacationBuilder();
        Vacation cityVacation = cityVacationBuilder
                .addAccommodation("그랜드 파카디안", 2020, 8, 1, 5, 0)
                .addAccommodation("호텔 커맨더", 2020, 8, 6, 2, 0)
                .addEvent("태양의 서커스")
                .getVacation();
        System.out.println(cityVacation);

        VacationBuilder outdoorVacationBuilder = new OutdoorsVacationBuilder();
        Vacation outdoorVacation =outdoorVacationBuilder
                .addAccommodation("2인용 텐트", 2020, 7, 1, 5, 34)
                .addEvent("해변")
                .addAccommodation("2인용 텐트")
                .addEvent("산")
                .getVacation();
        System.out.println(outdoorVacation);
    }
}
