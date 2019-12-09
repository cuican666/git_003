package cn.bdqn.mapper;

import cn.bdqn.domain.PeItems;

import java.util.List;

public interface PeItemsMapper {

    public List<PeItems> selectByTypeId(Integer typeId);

    public void updatePeItems(PeItems peItems);

    public PeItems selectByItemId(Integer itemId);
}
