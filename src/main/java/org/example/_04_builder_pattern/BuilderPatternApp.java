package org.example._04_builder_pattern;

import java.time.LocalDate;

public class BuilderPatternApp {
    public static void main(String[] args) {
        TourPlanBuilder builder = new TourBuilderImpl();
        TourPlan plan = builder.title("하와이")
                .nightsAndDays(2,3)
                .startDate(LocalDate.of(2020,12,9))
                .whereToStay("호텔")
                .addPlan(0, "ㅎㅎ")
                .addPlan(1, "오토바이")
                .getPlan();

        TourPlan hawaiiTrip = builder.title("하와이")
                .startDate(LocalDate.of(2021,3,2))
                .getPlan();

        System.out.println(hawaiiTrip.toString());

        /*
            빌더 패턴
            1. 순서를 지정해 줄 수 있다.
            2. 다형성을 이용해 확장 할 수 있다 ( VIP 전용 TourPlanBuilder interface를 구현한 구현체를 만들어서 등등)
            3. 불안전한 객체를 생성하지 못하게하는 안전장치가 있다.
         */
    }
}
