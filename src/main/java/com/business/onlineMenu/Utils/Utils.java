package com.business.onlineMenu.Utils;

import com.business.onlineMenu.enums.Category;

import java.util.Comparator;
import java.util.List;

public class Utils {

  /*
   * private constructor to prevent instantiation
   * all methods should be static
   * */
  private Utils() {
  }

  public static void sortCategories(List<Category> categories) {
    categories.sort(Comparator.comparing(Category::getSequence));
  }
}
