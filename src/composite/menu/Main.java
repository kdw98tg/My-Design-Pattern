package src.composite.menu;

public class Main {
    public static void main(String[] _args) {
        MenuComponent pancakeHouseMenu = new Menu("팬케이크 하우스 메뉴", "아침식사");
        MenuComponent dinerMenu = new Menu("다이너 메뉴", "점심식사");
        MenuComponent cafeMenu = new Menu("카페 메뉴", "저녁식사");
        MenuComponent dessertMenu = new Menu("디저트 메뉴", "당연히 디저트!");
        MenuComponent coffeeMenu = new Menu("커피 메뉴", "오후 커피와 함께할 메뉴");

        MenuComponent allMenus = new Menu("모든 메뉴", "모든 메뉴를 합친 것");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItem(
                "K&B의 팬케이크 아침식사",
                "스크램블 에그와 토스트를 곁들인 팬케이크",
                true,
                2.99));
        pancakeHouseMenu.add(new MenuItem(
                "일반 팬케이크 아침식사",
                "프라이드 에그와 소시지를 곁들인 팬케이크",
                false,
                2.99));
        pancakeHouseMenu.add(new MenuItem(
                "블루베리 팬케이크",
                "신선한 블루베리와 블루베리 시럽을 넣은 팬케이크",
                true,
                3.49));
        pancakeHouseMenu.add(new MenuItem(
                "와플",
                "블루베리 또는 딸기를 선택할 수 있는 와플",
                true,
                3.59));

        dinerMenu.add(new MenuItem(
                "채식주의자 BLT",
                "베이컨 대신 채식 베이컨을 사용한 상추와 토마토 샌드위치",
                true,
                2.99));
        dinerMenu.add(new MenuItem(
                "BLT",
                "베이컨과 상추, 토마토를 곁들인 샌드위치",
                false,
                2.99));
        dinerMenu.add(new MenuItem(
                "오늘의 스프",
                "감자 샐러드를 곁들인 오늘의 스프",
                false,
                3.29));
        dinerMenu.add(new MenuItem(
                "핫도그",
                "사워크라우트, 렐리쉬, 양파, 치즈를 얹은 핫도그",
                false,
                3.05));
        dinerMenu.add(new MenuItem(
                "찐 야채와 현미",
                "현미 위에 찐 야채를 얹은 요리",
                true,
                3.99));

        dinerMenu.add(new MenuItem(
                "파스타",
                "마리나라 소스를 곁들인 스파게티와 사워도우 빵 한 조각",
                true,
                3.89));

        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem(
                "애플파이",
                "바삭한 크러스트와 바닐라 아이스크림을 얹은 애플파이",
                true,
                1.59));

        dessertMenu.add(new MenuItem(
                "치즈케이크",
                "초콜릿 그레이엄 크러스트를 곁들인 뉴욕 스타일 크림치즈 케이크",
                true,
                1.99));
        dessertMenu.add(new MenuItem(
                "셔벗",
                "라즈베리 셔벗과 라임 셔벗 한 스쿱씩",
                true,
                1.89));

        cafeMenu.add(new MenuItem(
                "베지 버거와 에어프라이드 감자튀김",
                "통밀 빵에 상추, 토마토를 넣은 베지 버거와 감자튀김",
                true,
                3.99));
        cafeMenu.add(new MenuItem(
                "오늘의 스프",
                "샐러드를 곁들인 오늘의 스프",
                false,
                3.69));
        cafeMenu.add(new MenuItem(
                "부리또",
                "전체 통 팥, 살사, 과카몰리를 넣은 큰 부리또",
                true,
                4.29));

        cafeMenu.add(coffeeMenu);

        coffeeMenu.add(new MenuItem(
                "커피 케이크",
                "시나몬과 호두가 올라간 바삭한 케이크",
                true,
                1.59));
        coffeeMenu.add(new MenuItem(
                "베이글",
                "참깨, 양귀비씨, 시나몬 건포도, 호박 맛 중 선택 가능",
                false,
                0.69));
        coffeeMenu.add(new MenuItem(
                "비스코티",
                "아몬드 또는 헤이즐넛 비스코티 세 개",
                true,
                0.89));

        Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();
    }
}
