package cn.bdqn.service;

import cn.bdqn.domain.ItemTypes;
import cn.bdqn.domain.PeItems;

import java.util.List;

public interface PeItemsService {

    public List<PeItems> queryByTypeId(Integer typeId);

    public void changePeItems(PeItems peItems);

    public PeItems queryByItemId(Integer itemId);
}
