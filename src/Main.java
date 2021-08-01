import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // 기존 방식
        Computer computer = new Computer("i7", "16g", "512g ssd"); // ... 순서

        System.out.println("computer: "+computer);

        // 빌더 패턴 방식 // 순서 상관x => return Dto 정리하는 데 빌더패턴을 쓴다. @Builder(Lombok) 어노테이션으로 Builder패턴양식을 바로 구현가능!
        Computer computer1 = ComputerBuilder
                .builder()
                .setCpu("i7")
                .setRam("16g")
                .setStorage("256g ssd")
                .build();

        // 객체에다가 값을 setter 해준다. 근데 '편하게'

        System.out.println("#####: "+ computer1);

//        String의 메서드

//        int i = 12344;
        // 1) valueof
//        var s = String.valueOf(i);
//        System.out.println(s);

//        var parseInt = Integer.parseInt("1234");
//        System.out.println("parseInt: " + parseInt);
//
//        // 2) equals
//
//        String str = "bestjavabest";
//
//        // 문자열 -> equals : 주소값 비교 vs '==' 값 비교
//        // NPE -> "비교문자열".equals(변수)
//        if("dsg".equals(str)){
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
//
////        boolean result = str.equals("dsg");
//
////        System.out.println("result: "+ result);
//
//        // 3) startsWith , contains
//        if (str.startsWith("java") || str.contains("java")) {
//            System.out.println("java 문자열");
//        } else{
//            System.out.println("java 문자열 x");
//        }
//
//        // split
//        String data = "202안1asf08-ㅀdf0AA1ZZㅀㅣㅏ";
//        String pattern1 = "a*[0-9]*";
//        String pattern2 = "^[가-힣ㄱ-ㅎㅏ-ㅣ]*$";
//        String pattern3 = "^[a-zA-Z]*$";
////        String[] stra = new String[3];
//        List<String> stra = Arrays.asList(data.split("-"));
//
//        var join = String.join("", stra);
//        System.out.println("join: "+join);
//
////        "-" -> "" // 단순한 정규표현식이 아닌 걸로.
//        var replaceAll = data.replaceAll(pattern3, "");
//        System.out.println("replaceAll: "+ replaceAll);
//
//        var replace = data.replace("-", "");
//        System.out.println("replace: "+ replace);
//
//        // substring(index) vs substring(i1, i2)[남겨준다];
//        var substring = data.substring(0,3);
//        System.out.println("substring: "+ substring);


        // String vs StringBuffer(동기화-> 멀티쓰레드) vs StringBuilder(동기화x -> 단일쓰레드)

//        String a = ""; // 레퍼런스변수 -> 힙 메모리
//        StringBuffer ab = new StringBuffer("");
//        StringBuilder ac = new StringBuilder("");
//
//        long start1 = System.currentTimeMillis();
//        for(int i =0; i<100000; i++){
//            a += "hello";
//
//        }
//        long end1 = System.currentTimeMillis();
//
//        long start2 = System.currentTimeMillis();
//        for(int i =0; i<100000; i++){
//            ab.append("hello");
//
//        }
//        long end2 = System.currentTimeMillis();
//
//        long start3 = System.currentTimeMillis();
//        for(int i =0; i<100000; i++){
//            ac.append("hello");
//
//        }
//        long end3 = System.currentTimeMillis();
//
//
//
//        System.out.println("a: "+(end1-start1));
//        System.out.println("ab: "+(end2-start2));
//        System.out.println("ac: "+(end3-start3));


        // Map -> forEach -> keySet, value ,entrySet(k=v)
//        Map<String, Object> pmap = new HashMap<>();
//
//        pmap.put("1", "dsg");
//        pmap.put("2", "kmb");
//        pmap.put("3", "lbk");
//
//
//        System.out.println("pmap: "+ pmap);
//
//
//        System.out.println("1===========================");
//        for (String key : pmap.keySet()) {
//            System.out.println(pmap.get(key));
//        }
//
//        System.out.println("2===========================");
//        for(Object value:pmap.values()){
//            System.out.println(value);
//        }
//
//        System.out.println("3===========================");
//        for (String key : pmap.keySet()) {
//            System.out.println(key);
//        }
//
//        System.out.println("4===========================");
//        for (Entry<String, Object> val : pmap.entrySet()) {
//            System.out.println("val: "+val.getValue()+", key: "+val.getKey());
//        }
//
//        System.out.println("======forEach메서드(최신)============");
//        // value 추출
//        pmap.entrySet() // k=v
//                .stream()
//                .map(Entry::getValue)
//                .forEach(System.out::println);
//
//        System.out.println("=====================");
//        pmap.keySet()
//                .forEach(System.out::println);
//        System.out.println("====================");
//        pmap.values()
//                .forEach(System.out::println);


        // iterator === > stream
//        List<String> stringList = Arrays.asList("월", "화", "수", "목", "금");

//        Iterator<String> iterator = stringList.iterator();
//
//        while (iterator.hasNext()) {
//            System.out.println("iterator.next(): "+iterator.next());
//
//            var day = iterator.next();
//            System.out.println("day: "+ day);
//
//            if (day.equals("수")) {
//                iterator.remove();  // NoSuchElementException
//            }
//        }

        // stream으로 하는 게 너무 편하다 iterator는 안쓴다. 요즘엔
//        Stream<String> stringStream = stringList.stream();
//
//        stringStream.filter(s -> !"수".equals(s))
//                .forEach(System.out::println);


    }
}
