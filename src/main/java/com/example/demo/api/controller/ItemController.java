package com.example.demo.api.controller;
import com.example.demo.api.models.Item;
import com.example.demo.api.service.RepositoryItem;
import org.springframework.web.bind.annotation.*;

@RestController
public class ItemController {

    private final RepositoryItem RepositoryItem;

    public ItemController(RepositoryItem RepositoryItem) {
        this.RepositoryItem = RepositoryItem;
    }

    @GetMapping(value = "/getAllItems")
    public Iterable<Item> getAllItems() {
        return RepositoryItem.findAll();
    }

    @GetMapping(value = "/item/{id}")
    public Item getItemById(@PathVariable int id) {
        try {
            return RepositoryItem.findById(id).get();
        }
        catch (Exception NoSuchElementException) {
            return null;
        }
    }

    @GetMapping(value = "/Withdrawal/{id}/{amount}")
    public String withdrawal(@PathVariable int id,@PathVariable int amount) {
        if(amount < 0) {
            return "The amount must be positive";
        }
        Item item=this.getItemById(id);
        if(item == null){
            return "The item don't exist";
        }
        if(item.getAmount() -amount <0){
            return "The quantity not enough";
        }
        item.setAmount(item.getAmount()-amount);
        RepositoryItem.save(item);
        return "The quantity has been reduced";
    }

    @GetMapping(value = "/deposit/{id}/{amount}")
    public String deposit(@PathVariable int id,@PathVariable int amount) {
        if(amount < 0) {
            return "The amount must be positive";
        }
        Item item=this.getItemById(id);
        if(item == null){
            return "The item don't exist";
        }
        item.setAmount(item.getAmount()+amount);
        RepositoryItem.save(item);
        return "The quantity has been added";
    }

    @DeleteMapping(value = "/deleteItem/{id}")
    public String deleteItemById(@PathVariable int id) {
        Item item=this.getItemById(id);

        if(item != null){
            RepositoryItem.deleteById(id);
            return "The item delete";
        }
        else{
            return "The item don't exist";
        }
    }

    @PostMapping(value = "/addItem")
    public String addItem(@RequestBody Item newItem) {
        if(newItem != null) {
            RepositoryItem.save(newItem);
            return "The item added";
        }
        return "The item is null";
    }

}
