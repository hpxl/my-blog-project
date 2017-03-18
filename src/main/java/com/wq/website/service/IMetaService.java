package com.wq.website.service;

import com.wq.website.dto.MetaDto;
import com.wq.website.modal.Vo.MetaVo;

import java.util.List;

/**
 * 分类信息service接口
 * Created by BlueT on 2017/3/17.
 */
public interface IMetaService {
    /**
     * 根据类型和名字查询项
     *
     * @param type
     * @param name
     * @return
     */
    MetaDto getMeta(String type, String name);

    /**
     * 根据文章id获取项目个数
     * @param mid
     * @return
     */
    Integer countMeta(Integer mid);

    /**
     * 根据类型查询项目列表
     * @param types
     * @return
     */
    List<MetaVo> getMetas(String types);
}