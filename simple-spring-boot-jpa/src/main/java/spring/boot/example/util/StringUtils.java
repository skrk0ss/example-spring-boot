package spring.boot.example.util;

public class StringUtils {

  public static boolean isBlank(String str) {
    return org.apache.commons.lang.StringUtils.isBlank(str);
  }

  public static boolean isBlank(String... args) {
    for (String str : args) {
      if (org.apache.commons.lang3.StringUtils.isBlank(str)) {
        return true;
      }
    }
    return false;
  }

  public static boolean isNotBlank(String str) {
    return org.apache.commons.lang.StringUtils.isNotBlank(str);
  }

  public static boolean isAnyNotBlank(String... args) {

    for (String str : args) {
      if (org.apache.commons.lang.StringUtils.isNotBlank(str)) {
        return true;
      }
    }
    return false;
  }
}
