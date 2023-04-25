package com.kbstar.controller;

import com.kbstar.dto.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class MainController {
    @RequestMapping("/")
    public String main() {
        return "index";
    }

    @RequestMapping("/charts")
    public String charts(Model model) {
        model.addAttribute("center", "charts");
        return "index";
    }

    @RequestMapping("/tables")
    public String tables(Model model) {
        List<Item> list = new ArrayList<>();
        list.add(new Item(101, "butora", 1000, "a.jpg", new Date()));
        list.add(new Item(102, "tape", 2000, "b.jpg", new Date()));
        list.add(new Item(103, "chalk", 3000, "c.jpg", new Date()));
        list.add(new Item(104, "chalkbag", 4000, "d.jpg", new Date()));
        list.add(new Item(105, "bag", 5000, "e.jpg", new Date()));
        list.add(new Item(106, "pizza", 1000, "f.jpg", new Date()));
        list.add(new Item(107, "tteokbokki", 2000, "g.jpg", new Date()));
        list.add(new Item(108, "chicken", 3000, "h.jpg", new Date()));
        list.add(new Item(109, "udon", 4000, "i.jpg", new Date()));
        list.add(new Item(110, "kimbap", 5000, "j.jpg", new Date()));
        list.add(new Item(111, "coffee", 1000, "k.jpg", new Date()));
        list.add(new Item(112, "gloves", 2000, "l.jpg", new Date()));
        list.add(new Item(113, "chocolate", 3000, "m.jpg", new Date()));
        list.add(new Item(114, "candy", 4000, "n.jpg", new Date()));
        list.add(new Item(115, "hoodies", 5000, "o.jpg", new Date()));
        list.add(new Item(116, "shoes", 1000, "p.jpg", new Date()));
        list.add(new Item(117, "pho", 2000, "q.jpg", new Date()));
        list.add(new Item(118, "pork", 3000, "r.jpg", new Date()));
        list.add(new Item(119, "pasta", 4000, "s.jpg", new Date()));
        list.add(new Item(120, "salad", 5000, "t.jpg", new Date()));


        model.addAttribute("allitem", list);
        model.addAttribute("center", "tables");
        return "index";
    }
}
