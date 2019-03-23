package len.service.impl;

import len.entity.PowerActionApi;
import len.mapper.PowerActionApiMapper;
import len.service.IPowerActionApiService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 权限功能和接口关系表 服务实现类
 * </p>
 *
 * @author len
 * @since 2019-03-23
 */
@Service
public class PowerActionApiServiceImpl extends ServiceImpl<PowerActionApiMapper, PowerActionApi> implements IPowerActionApiService {

}
