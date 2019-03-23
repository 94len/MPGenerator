package len.service.impl;

import len.entity.Company;
import len.mapper.CompanyMapper;
import len.service.ICompanyService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 公司表：一个主体公司可以有分公司，目前分公司作用是用作合同 服务实现类
 * </p>
 *
 * @author len
 * @since 2019-03-23
 */
@Service
public class CompanyServiceImpl extends ServiceImpl<CompanyMapper, Company> implements ICompanyService {

}
