package gof.template.house;

public class HousingMain {
    public static void main(String[] args) {
        HouseTemplate houseType = new WoodenHouse();
        houseType.buildHouse();

        //구분 선
        System.out.println();
        System.out.println("-------");
        System.out.println();

        // 템플릿 메소드 사용(Glass House)
        houseType = new GlassHouse();
        houseType.buildHouse();
    }
}
