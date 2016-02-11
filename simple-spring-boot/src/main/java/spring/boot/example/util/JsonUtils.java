package spring.boot.example.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@SuppressWarnings("PMD.UseSingleton")
public final class JsonUtils {
  public static String toString(Object obj) {
    ObjectMapper mapper = new ObjectMapper();
    String result = "";
    try {
      result = mapper.writeValueAsString(obj);
    } catch (Exception e) {
      throw new RuntimeException(String.format("convert to json string error..,%s", e.toString()), e);
    }
    return result;
  }

  @SuppressWarnings("unchecked")
  public static <T> T toObject(String str, Class<?> clazz) {
      ObjectMapper mapper = new ObjectMapper();
      T result = null;
      try {
          result = (T)mapper.readValue(str, clazz);
      } catch (Exception e) {
          throw new RuntimeException(String.format("convert to object error..,%s", e.toString()), e);
      }
      return result;
  }
}
