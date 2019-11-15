package cn.isuyu.baidu.face.h5.liveness.service;

import cn.isuyu.baidu.face.h5.liveness.dtos.FaceChkDTO;
import cn.isuyu.baidu.face.h5.liveness.vos.CodeVO;
import cn.isuyu.baidu.face.h5.liveness.vos.FaceVO;
import cn.isuyu.baidu.face.h5.liveness.vos.ResultTokenVO;
import cn.isuyu.baidu.face.h5.liveness.vos.ResultVO;

import java.io.IOException;

/**
 * @Author NieZhiLiang
 * @Email nzlsgg@163.com
 * @GitHub https://github.com/niezhiliang
 * @Date 2019-11-08 3:41 下午
 */
public interface FaceChkService {

    /** 获取accert_token **/
    ResultTokenVO getAccessToken() throws IOException;

    /**获取验证码**/
    ResultVO<CodeVO> getCode(String accessToken) throws IOException;

    /**
     * 获取活体检测的结果
     * @return
     */
    ResultVO<FaceVO> getFaceResult(FaceChkDTO faceChkDTO) throws IOException;
}
