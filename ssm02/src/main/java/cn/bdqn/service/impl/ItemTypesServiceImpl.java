package cn.bdqn.service.impl;

import cn.bdqn.domain.ItemTypes;
import cn.bdqn.mapper.ItemTypesMapper;
import cn.bdqn.service.ItemTypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("itemTypesService")
public class ItemTypesServiceImpl implements ItemTypesService {

    @Autowired
    private ItemTypesMapper itemTypesMapper;

    @Override
    public List<ItemTypes> queryAllItemTypes() {
        return itemTypesMapper.selectAllItemType();
    }
}
