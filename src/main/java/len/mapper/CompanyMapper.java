package len.mapper;

import len.entity.Company;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 * 公司表：一个主体公司可以有分公司，目前分公司作用是用作合同 Mapper 接口
 * </p>
 *
 * @author len
 * @since 2019-03-23
 */
public interface CompanyMapper extends BaseMapper<Company> {

}
