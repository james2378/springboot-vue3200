package com.dao;

import com.entity.MeitiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.MeitiView;

/**
 * 媒体 Dao 接口
 *
 * @author 
 */
public interface MeitiDao extends BaseMapper<MeitiEntity> {

   List<MeitiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
