import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Computer computer = new Computer("i7", "16g", "512g ssd");
//
//        System.out.println("computer: "+computer);
//
//        Computer computer1 = ComputerBuilder
//                .builder()
//                .setCpu("i7")
//                .setRam("16g")
//                .setStorage("256g ssd")
//                .build();
//
//        System.out.println("#####: "+ computer1);

//        String의 메서드

//        int i = 12344;
        // 1) valueof
//        var s = String.valueOf(i);
//        System.out.println(s);

        var parseInt = Integer.parseInt("1234");
        System.out.println("parseInt: " + parseInt);

        // 2) equals

        String str = "bestjavabest";

        // 문자열 -> equals : 주소값 비교 vs '==' 값 비교
        // NPE -> "비교문자열".equals(변수)
        if("dsg".equals(str)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

//        boolean result = str.equals("dsg");

//        System.out.println("result: "+ result);

        // 3) startsWith , contains
        if (str.startsWith("java") || str.contains("java")) {
            System.out.println("java 문자열");
        } else{
            System.out.println("java 문자열 x");
        }

        // split
        String data = "202안1asf08-ㅀdf0AA1ZZㅀㅣㅏ";
        String pattern1 = "a*[0-9]*";
        String pattern2 = "^[가-힣ㄱ-ㅎㅏ-ㅣ]*$";
        String pattern3 = "^[a-zA-Z]*$";
//        String[] stra = new String[3];
        List<String> stra = Arrays.asList(data.split("-"));

        var join = String.join("", stra);
        System.out.println("join: "+join);

//        "-" -> "" // 단순한 정규표현식이 아닌 걸로.
        var replaceAll = data.replaceAll(pattern3, "");
        System.out.println("replaceAll: "+ replaceAll);

        var replace = data.replace("-", "");
        System.out.println("replace: "+ replace);

        // substring(index) vs substring(i1, i2)[남겨준다];
        var substring = data.substring(0,3);
        System.out.println("substring: "+ substring);



    }
}
