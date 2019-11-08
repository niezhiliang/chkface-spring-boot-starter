package cn.isuyu.baidu.face.h5.liveness.vos;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author NieZhiLiang
 * @Email nzlsgg@163.com
 * @GitHub https://github.com/niezhiliang
 * @Date 2019-11-08 3:44 下午
 */
@Data
public class ResultVO<T> implements Serializable {

    private String err_no;

    private String err_msg;

    private T result;

    private String timestamp;

    private String cached;

    private String serverlogid;

    private String error_code;

    private String error_msg;
}
