
package level_4;

import level_4.MyMetods;

import java.util.Iterator;
import java.util.LinkedList;

public class Homework_4 {
    public Homework_4() {
    }

    public static void main(String[] args) {
        MyMetods myMetods = new MyMetods();
        myMetods.enqueue(1);
        myMetods.enqueue(5);
        myMetods.enqueue(55);
        myMetods.enqueue(33);
        myMetods.printList();
        myMetods.dequeue();
        myMetods.printList();
        myMetods.first();
        myMetods.enqueue(13);
        myMetods.dequeue();
        myMetods.printList();
        summator();
    }

    static LinkedList getList() {
        LinkedList<Character> ll = new LinkedList();
        ll.add('a');
        ll.add('n');
        ll.add('t');
        ll.add('o');
        ll.add('n');
        return ll;
    }

    static LinkedList revers(LinkedList list) {
        LinkedList<Character> ll = new LinkedList();
        Iterator<Character> iterator = list.descendingIterator();

        while(iterator.hasNext()) {
            Character ch = (Character)iterator.next();
            ll.add(ch);
        }

        return ll;
    }

    static void summator() {
        LinkedList<Integer> list = new LinkedList();

        int sum;
        for(sum = 0; sum < 12; sum += 2) {
            list.add(sum);
        }

        System.out.println(list);
        sum = 0;

        int item;
        for(Iterator<Integer> iterator = list.iterator(); iterator.hasNext(); sum += item) {
            item = (Integer)iterator.next();
        }

        System.out.println(sum);
    }
}
