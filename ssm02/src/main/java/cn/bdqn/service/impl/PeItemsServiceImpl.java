package cn.bdqn.service.impl;

import cn.bdqn.domain.PeItems;
import cn.bdqn.mapper.PeItemsMapper;
import cn.bdqn.service.PeItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("peItemsService")
public class PeItemsServiceImpl implements PeItemsService {

    @Autowired
    private PeItemsMapper peItemsMapper;

    @Override
    public List<PeItems> queryByTypeId(Integer typeId) {
        return peItemsMapper.selectByTypeId(typeId);
    }

    @Override
    public void changePeItems(PeItems peItems) {
        peItemsMapper.updatePeItems(peItems);
    }

    @Override
    public PeItems queryByItemId(Integer itemId) {
        return peItemsMapper.selectByItemId(itemId);
    }
}
