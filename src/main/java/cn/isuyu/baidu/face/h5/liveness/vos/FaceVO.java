package cn.isuyu.baidu.face.h5.liveness.vos;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author NieZhiLiang
 * @Email nzlsgg@163.com
 * @GitHub https://github.com/niezhiliang
 * @Date 2019-11-08 5:37 下午
 */
@Data
public class FaceVO implements Serializable {

    private static final long serialVersionUID = 4204133080529593709L;
    /**
     * 活体检测分数。此分数为视频分析结果，
     * 不包含语音验证结果，语音验证
     * 需开发基于自己的业务需求做判断。
     */
    private Float score;

    /**
     * 原先验证码和读取到的验证码
     */
    private CodeChkVO code;

    /**
     * 图片列表
     */
    private List<PicVO> pic_list;
}
