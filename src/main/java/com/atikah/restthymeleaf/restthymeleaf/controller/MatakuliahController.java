package com.atikah.restthymeleaf.restthymeleaf.controller;

import com.atikah.restthymeleaf.restthymeleaf.entity.Fakultas;
import com.atikah.restthymeleaf.restthymeleaf.entity.Matakuliah;
import com.atikah.restthymeleaf.restthymeleaf.service.MatakuliahService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@RequestMapping ("/matakuliah")
public class MatakuliahController {

    @Autowired
    private MatakuliahService matakuliahService;


    @GetMapping(path = "/create")
    public String viewCreate(Model model){
        model.addAttribute("dataSets", new Matakuliah());
        return "/matakuliah/create";
    }

    @GetMapping(path = "/update/{id}")
    public String viewUpdate (Model model, @PathVariable(value = "id") int id) {
        model.addAttribute("dataSets", matakuliahService.findById(id));
        return "/matakuliah/update";
    }



    @PostMapping(value = "/create")
    public String save(Matakuliah param) {
        Matakuliah data = matakuliahService.save(param);
        if (data.getId() == 0) {
            return "redirect:/matakuliah/create?failed";
        } else {
            return "redirect:/matakuliah/create?success";
        }
    }


    @PutMapping(path = "/update")
    public String update(Matakuliah param) {
        Matakuliah data = matakuliahService.update(param);
        if (data.getId() == 0) {
            return "redirect:/matakuliah?ufailed";
        } else {
            return "redirect:/matakuliah?usuccess";
        }
    }



    @DeleteMapping(path = "/delete")
    public String delete(Matakuliah param) {
        int data = matakuliahService.delete(param);
        if (data == 0) {
            return "redirect:/matakuliah?dfailed";
        } else {
            return "redirect:/matakuliah?dsuccess";
        }
    }

    @GetMapping(path = "")
    public String viewData(Model model, @RequestParam(value = "search", required = false) String param,
                           @RequestParam(value = "filter", required = false) String param1) {
        if (param == null && param1 == null) {
            model.addAttribute("dataSets", matakuliahService.find());
        } else {
            Matakuliah matakuliah= new Matakuliah();
            matakuliah.setNama(param);;

            model.addAttribute("dataSets", matakuliahService.findByName(matakuliah));
        }
        return "/matakuliah/list";
    }
}



