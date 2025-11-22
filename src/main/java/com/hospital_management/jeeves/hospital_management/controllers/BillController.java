package com.hospital_management.jeeves.hospital_management.controllers;

import com.hospital_management.jeeves.hospital_management.models.Bill;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bills")
public class BillController {

    @GetMapping
    public List<Bill> getBills(){
        System.out.println("Get all bills");
        return null;
    }

    @PostMapping
    public Bill createBill(@RequestBody Bill bill){
        System.out.println("Create a bills");
        return bill;
    }

    @GetMapping("/id")
    public Bill getBillById(@PathVariable Long id){
        System.out.println("Get bill by id");
        return null;
    }

    @PutMapping("/id")
    public Bill updateBillById(@PathVariable Long id){
        System.out.println("Update bill by id");
        return null;
    }

    @DeleteMapping("/id")
    public Bill deleteBillById(@PathVariable Long id){
        System.out.println("Delete bill of id");
        return null;
    }
}
