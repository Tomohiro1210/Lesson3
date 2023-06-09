import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

//九州地方の県庁所在地を調べるためのMap
public class Main {
    public static void main(String[] args) {
        Map<String, String> Japan = new HashMap<>();
        Japan.put("Fukuoka", "Fukuoka");
        Japan.put("Saga", "Saga");
        Japan.put("Oita", "Oita");
        Japan.put("Nagasaki", "Nagasaki");
        Japan.put("Kumamoto", "Kumamoto");
        Japan.put("Miyazaki", "Miyazaki");
        Japan.put("Kagoshima", "Kagoshima");
        Japan.put("Okinawa", "Naha");

        //Mapの中身を画面に表示させる
        for (Map.Entry<String, String> entry : Japan.entrySet()) {
            System.out.println("県名:" + entry.getKey() + "　県庁所在地：" + entry.getValue());
        }

        //入力内容に応じて例外処理を実施する
        System.out.println("九州地方の県名をローマ字でいれてください　例：Fukuoka");
        String name = new java.util.Scanner(System.in).nextLine();

//        String result;
//        result = Japan.get(name);

        //上の文に対するアドバイス：宣言と初期化は一緒でよいのでは。
        String result = Japan.get(name);

        try {
//            if (result != null) {
//                System.out.println("県庁所在地は" + result + "です。");
//            } else {
//                throw new Exception();
//            }

            //上の文に対するアドバイス：isNull()を使ったほうが見やすい！
            if (Objects.isNull(result)) {
                throw new Exception();
            } else {
                System.out.println("県庁所在地は" + result + "です。");
            }

        } catch (Exception e) {
            System.out.println(name + "は見つかりませんでした");
        } finally {
            System.out.println("検索を終了します。");
        }
    }
}