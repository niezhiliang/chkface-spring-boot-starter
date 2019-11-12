package cn.isuyu.baidu.face.h5.liveness.vos;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author NieZhiLiang
 * @Email nzlsgg@163.com
 * @GitHub https://github.com/niezhiliang
 * @Date 2019-11-08 5:40 下午
 */
@Data
public class PicVO implements Serializable {

    private static final long serialVersionUID = 5890072992205389428L;
    /**
     * face唯一ID
     */
    private String face_id;

    /**
     * base64图片
     */
    private String pic;
}
