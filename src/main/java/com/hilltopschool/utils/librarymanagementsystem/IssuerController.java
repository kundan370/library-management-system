package com.hilltopschool.utils.librarymanagementsystem;

import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

@RestController
@RequestMapping("/issuer")
public class IssuerController {

    private IssuerRepository issuerRepository;

    public IssuerController(IssuerRepository issuerRepository) {
        this.issuerRepository = issuerRepository;
    }

    @GetMapping("/all")
    public List<Issuer> getAll() {
        return this.issuerRepository.findAll();
    }

    @GetMapping
    public Issuer getByName(@RequestParam("name") String name) throws UnsupportedEncodingException {
        return this.issuerRepository.findFirstByNameIgnoreCase(name);
    }
}
