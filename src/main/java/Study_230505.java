import java.util.*;
public class Study_230505 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // 최종 저장 되는 List 구조
        List<Map<String, String>> list = new ArrayList<>();

        // List 구조 안에 저장될 Map 객체
        Map<String, String> map = null;

            System.out.print("이름 : ");
            String name = s.next(); // 이름 입력받기

            System.out.print("날짜 : ");
            String date = s.next(); // 날짜 입력받기

            System.out.print("운동 : ");
            String sport = s.next(); // 할 운동 입력받기

            System.out.println();

            map = new HashMap<>(); // List 구조에 저장할 Map 메모리에 올리기

            map.put("name", name); // 입력받은 값을 name 키에 저장
            map.put("date", date); // 입력받은 값을 date 키에 저장
            map.put("sport", sport); // 입력받은 값을 sport 키에 저장

            list.add(map); // Map 구조를 List에 저장하기
            map = null; // 다 사용하면 메모리 비우기

        list.forEach(rMap -> { // 입력한 값 출력
            System.out.println("name : " + rMap.get("name"));
            System.out.println("date : " + rMap.get("date"));
            System.out.println("sport : " + rMap.get("sport"));
            System.out.println();
        } );
    }



}