package level_3;

import java.util.*;

public class Seminar_3 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
                // ex0();
        //        ex3();
    }

    static void ex0() {
    /*
    Р”Р°РЅС‹ СЃР»РµРґСѓСЋС‰РёРµ СЃС‚СЂРѕРєРё, cСЂР°РІРЅРёС‚СЊ РёС… СЃ РїРѕРјРѕС‰СЊСЋ == Рё РјРµС‚РѕРґР° equals() РєР»Р°СЃСЃР° Object
    String s1 = "hello";
    String s2 = "hello";
    String s3 = s1;
    String s4 = "h" + "e" + "l" + "l" + "o";
    String s5 = new String("hello");
    String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
     */
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        System.out.println(s1.equals(s6));
    }

    static void ex1(int n) {
    /*
    Р—Р°РїРѕР»РЅРёС‚СЊ СЃРїРёСЃРѕРє РґРµСЃСЏС‚СЊСЋ СЃР»СѓС‡Р°Р№РЅС‹РјРё С‡РёСЃР»Р°РјРё.
    РћС‚СЃРѕСЂС‚РёСЂРѕРІР°С‚СЊ СЃРїРёСЃРѕРє РјРµС‚РѕРґРѕРј sort() Рё РІС‹РІРµСЃС‚Рё РµРіРѕ РЅР° СЌРєСЂР°РЅ.
     */
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(100));
        }
        List<Integer> list2 = list;
        System.out.println(list);
        System.out.println();
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);
    }

    static void ex2() {
    /*
    РЎРѕР·РґР°С‚СЊ СЃРїРёСЃРѕРє С‚РёРїР° ArrayList
    РџРѕРјРµСЃС‚РёС‚СЊ РІ РЅРµРіРѕ РєР°Рє СЃС‚СЂРѕРєРё, С‚Р°Рє Рё С†РµР»С‹Рµ С‡РёСЃР»Р°.
    РџСЂРѕР№С‚Рё РїРѕ СЃРїРёСЃРєСѓ, РЅР°Р№С‚Рё Рё СѓРґР°Р»РёС‚СЊ С†РµР»С‹Рµ С‡РёСЃР»Р°.
     */
        List list = new ArrayList();
        list.add(55);
        list.add("РџСЂРёРІРµС‚");
        list.add("44");
        list.add(777);
        list.add(7.5);
        list.add("РџРѕРєР°");

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Number) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }

    static void ex3() {
    /*
    РљР°С‚Р°Р»РѕРі С‚РѕРІР°СЂРѕРІ РєРЅРёР¶РЅРѕРіРѕ РјР°РіР°Р·РёРЅР° СЃРѕС…СЂР°РЅРµРЅ РІ РІРёРґРµ РґРІСѓРјРµСЂРЅРѕРіРѕ СЃРїРёСЃРєР° List<ArrayList<String>> С‚Р°Рє,
    С‡С‚Рѕ РЅР° 0Р№ РїРѕР·РёС†РёРё РєР°Р¶РґРѕРіРѕ РІРЅСѓС‚СЂРµРЅРЅРµРіРѕ СЃРїРёСЃРєР° СЃРѕРґРµСЂР¶РёС‚СЃСЏ РЅР°Р·РІР°РЅРёРµ Р¶Р°РЅСЂР°,
    Р° РЅР° РѕСЃС‚Р°Р»СЊРЅС‹С… РїРѕР·РёС†РёСЏС… - РЅР°Р·РІР°РЅРёСЏ РєРЅРёРі. РќР°РїРёС€РёС‚Рµ РјРµС‚РѕРґ РґР»СЏ Р·Р°РїРѕР»РЅРµРЅРёСЏ РґР°РЅРЅРѕР№ СЃС‚СЂСѓРєС‚СѓСЂС‹.
     */
        List<List<String>> list = new ArrayList<>();
        addBook(list, "Р”РµС‚РµРєС‚РёРІ", "РЁРµСЂР»РѕРє РҐРѕР»РјСЃ");
        addBook(list, "Р”РµС‚РµРєС‚РёРІ", "РџСѓР°СЂРѕ");
        addBook(list, "Р РѕРјР°РЅ", "Р’РѕР№РЅР° Рё РјРёСЂ");

        System.out.println(list);
    }

    static void addBook(List<List<String>> list, String genre, String bookName) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).get(0).equals(genre)) {
                list.get(i).add(bookName);
                System.out.println(list);
                return;
            }
        }

        List<String> list1 = new ArrayList<>();
        list1.add(genre);
        list1.add(bookName);

        list.add(list1);
        System.out.println(list);
    }


}
