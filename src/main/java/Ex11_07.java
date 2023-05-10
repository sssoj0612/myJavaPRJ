class Car2 {
    private String color;
    private int speed;

    Car2(String color, int speed){ // 생성자 생성
        this.color = color;
        this.speed = speed;
    }
    // 실습 11-6의 getColor(), getSpeed() 메소드와 동일
    public String getColor() {
        return this.color;
    }
    public int getSpeed() {
        return this.speed;
    }
}

public class Ex11_07 {
    public static void main(String[] args) {
        Car2 myCar1 = new Car2("빨강", 0);
        Car2 myCar2 = new Car2("파랑", 30);

        System.out.println("자동차1의 색상은 " + myCar1.getColor() + "이며, 현재속도는 " + myCar1.getSpeed() + "km입니다.");
        System.out.println("자동차2의 색상은 " + myCar2.getColor() + "이며, 현재속도는 " + myCar2.getSpeed() + "km입니다.");

    }
}
