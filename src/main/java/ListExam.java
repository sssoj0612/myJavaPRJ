import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ListExam {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("이협건"); // List 객체에 데이터 추가하기
        list.add("홍길동");
        list.add("임꺽정");
        list.add("고길동");

        int listSize = list.size(); // List 저장된 데이터 수

        System.out.println("저장된 데이터 수 : " + listSize);

        System.out.println("1세대 반복문"); // 일반적인 반복문 (1세대)
        // 단점 : 반드시 반복의 횟수를 알고있어야 사용 가능
        for (int i = 0; i < listSize; i++) {
            System.out.println("이름 : " + list.get(i));
        }

        System.out.println("2세대 반복문"); // 개선된 for 반복문 (2세대)
        // 장점 : 1세대의 반드시 반복의 횟수를 알고있어야 사용 가능한 문제점을 개선
        for (String name : list) {
            System.out.println("이름 : " + name);
        }

        System.out.println("3세대 반복문"); // 개선된 for 반복문 (3세대)
        // 장점 : 2세대보다 라인이 감소, 람다식 적용, 자바 1.8부터 사용 가능
        list.forEach(name -> System.out.println("name : " + name));

        System.out.println("4세대 반복문"); // 개선된 for 반복문 (4세대)
        // 장점 : 3세대에 비동기식 처리 방법 적용
        // 단점 : 뭐가 먼저 처리 완료 될지 알 수 없기에 모든 경우에 쓸 수는 없음
        list.parallelStream().forEach(name -> System.out.println("name : " + name));

        System.out.println("1.5세대 반복문"); // while 반복문 (1.5세대)
        // 1세대 for 반복문보다 처리 속도가 빠름. 자바 1.7까지 가장 많이 썼음
        // 단점 : 코드가 길어짐
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String name = it.next();
            System.out.println("이름 : " + name);
        }
    }
}


