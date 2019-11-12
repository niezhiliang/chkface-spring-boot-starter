package cn.isuyu.baidu.face.h5.liveness.vos;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author NieZhiLiang
 * @Email nzlsgg@163.com
 * @GitHub https://github.com/niezhiliang
 * @Date 2019-11-08 4:16 下午
 */
@Data
public class CodeVO implements Serializable {

    private static final long serialVersionUID = 7104370035926637549L;

    private String session_id;

    private String code;
}
