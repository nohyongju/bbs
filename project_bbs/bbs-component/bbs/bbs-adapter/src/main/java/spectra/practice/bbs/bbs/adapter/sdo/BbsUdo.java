package spectra.practice.bbs.bbs.adapter.sdo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import spectra.attic.coreasset.share.util.JsonSerializable;
import spectra.practice.bbs.bbs.domain.Bbs;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class BbsUdo implements JsonSerializable {

    private String title;

    private String contents;

    private String noticeFlag;

    public static BbsUdo sample () {
        return new BbsUdo("제목수정해주세요~~~~", "내용수정해주세요~~", "N");
    }

    @Override
    public String toString() {
        return toJson();
    }
}
