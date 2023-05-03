public class Log_test {
    public static void main(String[] args) {

        String log = "123.123.123.123 - - [12/Apr/2018:17:03:50 +0900] \"GET /api/aaaa HTTP/1.1\" 200 34 1468 \"https://m.naver.com\" \"Mozilla/5.0 (iPhone; CPU iPhone OS 11_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Mobile/15E216 NAVER(inapp; search; 580; 8.6.3; 7)";

        // 문제 1. IP만 출력하기 (출력결과 : 123.123.123.123)
        // 문제 2. 호출날짜와 시간만 출력하기 (출력결과 : 12/Apr/2018:17:03:50)

        String strAry[] = log.split(" ");
        System.out.println("ip는 : " + strAry[0]);

        String time = strAry[3].replace("[","");
        System.out.println("호출날짜와 시간은 : " + time);
    }
}
