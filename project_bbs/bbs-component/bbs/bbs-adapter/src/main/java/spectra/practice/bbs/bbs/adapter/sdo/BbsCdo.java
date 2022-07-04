package spectra.practice.bbs.bbs.adapter.sdo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import spectra.attic.coreasset.share.util.JsonSerializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class BbsCdo implements JsonSerializable{

    private String writerId;

    private String title;

    private String contents;

    private String noticeFlag;

    public static BbsCdo sample() {
        return new BbsCdo("customer2", "question title..", "contents...", "N");
    }

    @Override
    public String toString() {
        return toJson();
    }
}
