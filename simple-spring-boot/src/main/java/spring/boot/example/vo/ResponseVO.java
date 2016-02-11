package spring.boot.example.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import spring.boot.example.base.BaseReturnCodes;

@NoArgsConstructor
@Getter
@Setter
public class ResponseVO {

  private String returnCode;

  private String message;

  public ResponseVO(String returnCode) {
    this.returnCode = returnCode;
  }

  public ResponseVO(String returnCode, String message) {
    this.returnCode = returnCode;
    this.message = message;
  }


  public static ResponseVO ok() {
    return new ResponseVO(BaseReturnCodes.OK);
  }

}
