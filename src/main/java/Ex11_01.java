// 기본은 자바 파일 1개당 클래스 1개 쓰는게 좋음. 좋은 예제는 아님.
// public이 안 써져있는 클래스는 public의 종속적인 클래스. (클래스 안에 클래스는 절대 x)
class Car{
    public String color;
    public int speed;
    public void upSpeed(int value){
        this.speed = this.speed + value; // this : 해당 클래스 안에 있는 전역변수를 사용할 때 붙임
    }
    public void downSpeed(int value){
        this.speed = this.speed - value;
    }
}

public class Ex11_01 {
    public static void main(String[] args) {

        Car myCar1 = new Car(); // Car라고 하는 클래스를 메모리에 올림. (인스턴스 생성)
        myCar1.color = "빨강";
        myCar1.speed = 0;

        Car myCar2 = new Car();
        myCar2.color = "파랑";
        myCar2.speed = 0;

        Car myCar3 = new Car();
        myCar3.color = "노랑";
        myCar3.speed = 0;

        myCar1.upSpeed(30);
        System.out.println("자동차1의 색상은 " + myCar1.color + "이며, 현재 속도는 " + myCar1.speed + "km 입니다.");

        myCar2.upSpeed(60);
        System.out.println("자동차2의 색상은 " + myCar2.color + "이며, 현재 속도는 " + myCar2.speed + "km 입니다.");

        myCar3.upSpeed(0);
        System.out.println("자동차3의 색상은 " + myCar3.color + "이며, 현재 속도는 " + myCar3.speed + "km 입니다.");
    }
}