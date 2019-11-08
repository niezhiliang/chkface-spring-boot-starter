package cn.isuyu.baidu.face.h5.liveness.vos;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author NieZhiLiang
 * @Email nzlsgg@163.com
 * @GitHub https://github.com/niezhiliang
 * @Date 2019-11-08 3:58 下午
 */
@Data
public class ResultTokenVO implements Serializable {

    private String refresh_token;

    private String expires_in;

    private String session_key;

    private String access_token;

    private String scope;

    private String session_secret;

    /**
     * 错误码
     */
    private String error;

    /**
     * 错误描述
     */
    private String error_description;

}
