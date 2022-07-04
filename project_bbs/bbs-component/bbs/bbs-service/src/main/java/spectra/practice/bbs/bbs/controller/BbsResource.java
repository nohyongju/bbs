package spectra.practice.bbs.bbs.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spectra.practice.bbs.bbs.adapter.sdo.BbsRdoListRdo;
import spectra.practice.bbs.bbs.service.crud.BbsService;

@RestController
@RequestMapping("tickets")
@RequiredArgsConstructor
public class BbsResource {
    private final BbsService bbsService;

    public BbsRdoListRdo findAll() {
        return null;
    }
}
