package len.service.impl;

import len.entity.PowerActionGroup;
import len.mapper.PowerActionGroupMapper;
import len.service.IPowerActionGroupService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 权限功能和权限组关系表 服务实现类
 * </p>
 *
 * @author len
 * @since 2019-03-23
 */
@Service
public class PowerActionGroupServiceImpl extends ServiceImpl<PowerActionGroupMapper, PowerActionGroup> implements IPowerActionGroupService {

}
