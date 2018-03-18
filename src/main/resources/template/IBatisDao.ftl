package ${packageStr};

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.winit.common.orm.mybatis.MyBatisPageRepo;
import com.winit.common.orm.mybatis.MyBatisRepo;
import com.winit.common.orm.mybatis.PageBase;
import com.winit.common.query.Searchable;
${importStr}

/**
 * 
 * ${entityDesc}Dao
 * 
 * @version 
 * <pre>
 * Author	Version		Date		Changes
 * ${author} 	1.0  		${time} 	Created
 *
 * </pre>
 * @since 1.
 */
@Mapper
public interface ${className} {
    long insert${entityName}(${entityClassName} entity);
    
    Long insertBatch(@Param("list")List<${entityClassName}> list);
    
    long update${entityName}(${entityClassName} entity);
    
    long updateBatch(@Param("list")List<${entityClassName}> list);
    
    long delete${entityName}(${entityClassName} entity);
    
    long deleteBatch(@Param("list")List<${entityClassName}> list);
    
    PageBase<${entityClassName}> searchBySo( ${soClassName} searchable);
    
    Integer searchCountBySo( ${soClassName} searchable);
    
    ${entityClassName} get${entityName}(${entityClassName} entity);
}