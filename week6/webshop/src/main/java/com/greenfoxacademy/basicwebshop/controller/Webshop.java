package com.greenfoxacademy.basicwebshop.controller;

import com.greenfoxacademy.basicwebshop.model.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class Webshop {


    List<ShopItem> items = new ArrayList<>(Arrays.asList(
       new ShopItem("Phone","The best phone what you can get",150000,42),
       new ShopItem("Tablet","The best tablet what you can get at the market",35470,11),
       new ShopItem("Shoes","Nike shoes for your uniform",24000,24),
       new ShopItem("AmazonBasics Multipurpose Copy Printer Paper ","The best phone what you can get",150000,74),
       new ShopItem("AmazonBasics Multipurpose, Comfort Grip, Titanium Fused, Stainless Steel Office Scissors - Pack of 3","3-pack of 8-inch scissors for cutting paper, cardboard, fabric, photos, and more",2500,85),
       new ShopItem("AmazonBasics Nylon Braided Lightning to USB A Cable, MFi Certified iPhone Charger, Dark Gray, 6-Foot","Apple MFi certified charging and syncing cable for your Apple devices",4000,0),
       new ShopItem("AmazonBasics 48-Count AA High-Performance Alkaline Batteries, 10-Year Shelf Life, Easy to Open Value Pack","AA 1.5-volt performance alkaline batteries for reliable performance across a wide range of devices",2470,47),
       new ShopItem("AmazonBasics Slim, Velvet, Non-Slip Clothes Suit Hangers, Ivory/Silver - Pack of 30","Ivory velvet surface and notched shoulders to prevent slipping",3490,5),
       new ShopItem("AmazonBasics 8-Sheet Capacity, Cross-Cut Paper and Credit Card Shredder, 4.1 Gallon","Cross-cut shred size: turns paper into small confetti-like pieces measuring 3/16 by 1-27/32 inches (5 by 47 mm); meets security level P-3 standards",11000,1),
       new ShopItem("AmazonBasics Blue, White, and Yellow Microfiber Cleaning Cloth - Pack of 24","Ultra soft, non-abrasive microfiber cloths will not scratch paints, coats or other surfaces",5400,67),
       new ShopItem("The Last of Us Part II - PlayStation 4","Pre-order & receive the following special in-game items:Ammo Capacity Upgrade:Unlock an ammo capacity upgrade for Ellie's pistol.Crafting Training Manual:Unlock the Crafting Training Manual, which provides access to new crafting recipes and upgrades.",15700,14),
       new ShopItem("SanDisk 128GB MicroSDXC UHS-I Memory Card for Nintendo Switch - SDSQXAO-128G-GNCZN","Incredible speeds in a microSD card officially licensed for the Nintendo Switch and Nintendo Switch Lite systems",9900,34),
       new ShopItem("Oculus Quest All-in-one VR Gaming Headset – 128GB","All-in-one VR: No PC. No wires. No limits. Oculus Quest is an all-in-one gaming system built for virtual reality. Now you can play almost anywhere with just a VR headset and controllers.",160000,18),
       new ShopItem("BENGOO G9000 Stereo Gaming Headset for PS4, PC, Xbox One com.greenfoxacademy.basicwebshop.Controller","【MULTI-PLATFORM COMPATIBLE】Support PlayStation 4, New Xbox One, PC, Nintendo 3DS, Laptop, PSP, Tablet, iPad, Computer, Mobile Phone. Please note you need an extra Microsoft Adapter (Not Included) when connect with an old version Xbox One controller.",8700,2),
       new ShopItem("Elite Series 2 com.greenfoxacademy.basicwebshop.Controller - Black","Play like a pro with the all new Xbox elite wireless controller series 2",54000,7),
       new ShopItem("The Legend of Zelda: Breath of the Wild - Nintendo Switch","Discover Hyrule as never before: by making your own path, choices, and consequences",15470,14),
       new ShopItem("Logitech Dual-Motor Feedback Driving Force G29 Gaming Racing Wheel with Responsive Pedals for PlayStation 4 and PlayStation 3 - Black","The definitive sim racing wheel for PlayStation 4 and PlayStation 3: Realistic steering and pedal action for the latest racing titles",99000,6),
       new ShopItem("amFilm Tempered Glass Screen Protector for Nintendo Switch 2017 (2-Pack)","Ultra-clear High Definition with 99.9% transparency to allow an optimal, natural viewing experience",2500,0),
       new ShopItem("Razer Kraken X Ultralight Gaming Headset: 7.1 Surround Sound Capable - Lightweight Frame - Integrated Audio Controls - Bendable Cardioid Microphone - For PC, Xbox, PS4, Nintendo Switch - Classic Black","The #1 Best-Selling Gaming Peripherals Manufacturer in the US: Source - The NPD Group, Inc., U.S. Retail Tracking Service, Keyboards, Mice, PC Headset, PC Microphone, Gaming Designed, Based on dollar sales, Jan. 2017- Mar. 2020 combined.",17400,14),
       new ShopItem("WD 2TB Gaming Drive Works with Playstation 4 Portable External Hard Drive -","Expand your PS4 gaming experience",27800,7)
            ));



    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("items", items);
        return "index";
    }

    @GetMapping("/webshop")
    @ResponseBody
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/only-availabe")
    public String available(Model model){

        List<ShopItem> available = items.stream()
                .filter(x -> x.getQuantityOfStock() >0)
                .collect(Collectors.toList());
        model.addAttribute("items",available);
        return "index";
    }

    @GetMapping("/cheapest-first")
    public String cheapest(Model model){
        List<ShopItem> cheapest = items.stream()
                .sorted(Comparator.comparingInt(ShopItem ::getPrice))
                .collect(Collectors.toList());
        model.addAttribute("items",cheapest);
        return "index";
    }
    @GetMapping("/contains-nike")
    public String nike(Model model){
        List<ShopItem> nike = items.stream()
                .filter(x -> x.getName().contains("nike") || x.getName().contains("Nike") || x.getDescription().contains("Nike") || x.getDescription().contains("nike"))
                .collect(Collectors.toList());
        model.addAttribute("items",nike);
        return "index";
    }

    @GetMapping("/avarage-stock")
    public Integer avgStock(Model model){
        long sum = 0;
        sum = items.stream()
                .
    }
}

