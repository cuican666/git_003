package cn.bdqn.controller;

import cn.bdqn.domain.PeItems;
import cn.bdqn.service.PeItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/peItems")
public class PeItemsController {


    @Autowired
    private PeItemsService peItemsService;

    @RequestMapping("/itemList")
    public String itemList(Model model,Integer typeId){

        List<PeItems> peItems = peItemsService.queryByTypeId(typeId);
        model.addAttribute("peItems",peItems);
        return "itemList";
    }

    @RequestMapping("/show")
    public String show(Model model,Integer itemId){

        PeItems peItems=peItemsService.queryByItemId(itemId);
        model.addAttribute("item",peItems);
        return "changeUI";
    }

    @RequestMapping("/change")
    public String change(PeItems peItems){

        peItemsService.changePeItems(peItems);
        return "itemList";
    }

}
