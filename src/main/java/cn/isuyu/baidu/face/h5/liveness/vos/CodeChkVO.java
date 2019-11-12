package cn.isuyu.baidu.face.h5.liveness.vos;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author NieZhiLiang
 * @Email nzlsgg@163.com
 * @GitHub https://github.com/niezhiliang
 * @Date 2019-11-08 5:38 下午
 */
@Data
public class CodeChkVO implements Serializable {

    private static final long serialVersionUID = -2204931996397646081L;
    /**
     * 预先保存的验证码
     */
    private String create;

    /**
     * 视频读取结果验证码
     */
    private String identify;

}
