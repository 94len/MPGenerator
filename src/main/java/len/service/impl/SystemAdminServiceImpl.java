package len.service.impl;

import len.entity.SystemAdmin;
import len.mapper.SystemAdminMapper;
import len.service.ISystemAdminService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台管理员表 服务实现类
 * </p>
 *
 * @author len
 * @since 2019-03-23
 */
@Service
public class SystemAdminServiceImpl extends ServiceImpl<SystemAdminMapper, SystemAdmin> implements ISystemAdminService {

}
