package com.chulk;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// Рассмотрим Set
        //Основные операции над множеством (обьединение,разность,пересечение)
        //Обьединение
        Set<Integer> set1=new HashSet<Integer>();
        Set<Integer> set2=new HashSet<Integer>();
        for(int i=0;i<5;i++)
        {
            set1.add(i);
            set2.add(i+2);
        }
        System.out.println(set1.toString());
        System.out.println("********");
        System.out.println(set2.toString());
        System.out.println("********");
        set1.addAll(set2);
        System.out.println(set1.toString());//только уникальные
        System.out.println("********");
        System.out.println(set2.size());
        set2.clear();
        System.out.println(set2.size());
        ///LinkedHashSet
        System.out.println("********");
        Set<Integer> set=new LinkedHashSet<Integer>();
        System.out.println(set.size());
        Collections.addAll(set,3,1,3,3,3,4,5,5,5,6);
        System.out.println(set.toString());//важен порядок вставки
        //TreeSet
        TreeSet <Integer> treeSet=new TreeSet<Integer>();
        Collections.addAll(treeSet,4,4,4,8,8,3,2,2,1);
        System.out.println(treeSet.toString());
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        //Map
        HashMap<String,Integer>map=new HashMap<String, Integer>();
        map.put("Kate",20);
        map.put("Alex",19);
        System.out.println(map.toString());
        System.out.println(map.get("Kate"));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        Set<String>sett=map.keySet();
        System.out.println(sett.toString());//все ключи
        Collection<Integer>arr=map.values();
        System.out.println(arr.toString());//все значения
        System.out.println("********");
        ///List
        ArrayList<Integer>arr1=new ArrayList<Integer>();
        arr1.add(10);
        System.out.println(arr1.get(0));
        System.out.println(arr1.isEmpty());
        arr1.add(8);
        arr1.add(9);
        arr1.add(2);
        arr1.add(11);
        System.out.println(arr1.toString());
        arr1.subList(1,3).clear();
        System.out.println(arr1.toString());
        arr1.remove(Integer.valueOf(2));
        System.out.println(arr1.toString());
        System.out.println(arr1.indexOf(10));
     //Queue
        Queue<Integer>queue=new ArrayDeque<Integer>();//первый пришел,первый ушел
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.add(5);
        while(!queue.isEmpty())
        {
            System.out.print(queue.poll()+" ");
        }
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.add(5);
        Deque<Integer>deque=new ArrayDeque<Integer>();//первый пришел,последний ушел
        deque.push(11);
        deque.push(12);
        deque.push(13);
        deque.push(14);
        while(!deque.isEmpty())
        {
            System.out.print(deque.pop()+" ");
        }
    ArrayDeque<Integer> arrayDeque=new ArrayDeque<Integer>();
        arrayDeque.addAll(queue);
        arrayDeque.addFirst(115);
        arrayDeque.addLast(200);
        System.out.println(arrayDeque.toString());
        arrayDeque.remove(2);
        System.out.println(arrayDeque.toString());
        System.out.println(arrayDeque.peek());
    }
}
