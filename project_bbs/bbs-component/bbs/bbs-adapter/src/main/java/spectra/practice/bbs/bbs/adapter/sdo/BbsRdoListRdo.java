package spectra.practice.bbs.bbs.adapter.sdo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import spectra.attic.coreasset.share.util.JsonSerializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class BbsRdoListRdo implements JsonSerializable {
    private List<BbsRdo> list;
}
