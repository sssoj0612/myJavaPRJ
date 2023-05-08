import java.util.*;
public class Study_230505 {
    public static void record(String yes) {

        Scanner s = new Scanner(System.in);

        // 최종 저장 되는 List 구조
        List<Map<String, String>> list = new ArrayList<>();

        // List 구조 안에 저장될 Map 객체
        Map<String, String> map = null;

            System.out.print("날짜 : "); // 값 입력 받기
            String date = s.next();

            System.out.print("아침 : ");
            String brekker = s.next();

            System.out.print("점심 : ");
            String launch = s.next();

            System.out.print("저녁 : ");
            String dinner = s.next();

            System.out.print("몸무게 : ");
            String weight = s.next();

            System.out.println();

            map = new HashMap<>(); // List 구조에 저장할 Map 메모리에 올리기

            map.put("date", date); // 입력받은 값을 각각 키에 저장
            map.put("brekker", brekker);
            map.put("launch", launch);
            map.put("dinner", dinner);
            map.put("weight", weight);

            list.add(map); // Map 구조를 List에 저장하기
            map = null; // 다 사용하면 메모리 비우기

            list.forEach(rMap -> { // 입력한 값 출력
                System.out.println("date : " + rMap.get("date"));
                System.out.println("brekker : " + rMap.get("brekker"));
                System.out.println("launch : " + rMap.get("launch"));
                System.out.println("dinner : " + rMap.get("dinner"));
                System.out.println("weight : " + rMap.get("weight"));
                System.out.println("- 정상적으로 기록되었습니다. -");
                System.out.println();
            });
        }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("식단 기록을 하시겠습니까? <1>yes <2>no");
        int a = s.nextInt();

        if (a==1){ // record 메소드 호출
            record("yes");
        }

        else
            System.out.print("종료합니다.");
    }
}