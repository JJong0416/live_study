package gof.template.house;

public abstract class HouseTemplate {

    // final 선언으로 Override 방지
    public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildFoundation();
    }

    // 서브 클래스에서 직접 구현 할 메소드
    public abstract void buildWalls();

    public abstract void buildPillars();

    private void buildFoundation() {
        System.out.println("Building foundation with cement, iron rods and sand");
    }
}
