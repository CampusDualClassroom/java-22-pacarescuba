package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Exercise22 {

  public static List<String> createArrayList() {
    List<String> list = new ArrayList<>();
    list.add("GKFFD");
    list.add("TNANA");
    list.add("MPMSL");
    list.add("PSWME");
    list.add("LZMLF");
    list.add("JYEBV");
    list.add("YELNT");
    list.add("JSNKR");
    list.add("JFESF");
    list.add("TMJLL");
    return list;
  }

  public static void printElementsAndIndex(List<String> customList) {
    int i = 0;
    for (String s : customList) {
      System.out.println(i + " " + s);
      i++;
    }
  }

  public static boolean addElementToList(List<String> customList, String element) {
    return customList.add(element);
  }

  public static void main(String[] args) {
    printElementsAndIndex(createArrayList());
  }
}
