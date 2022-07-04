package spectra.practice.bbs.bbs.adapter.sdo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import spectra.attic.coreasset.share.util.JsonSerializable;
import spectra.practice.bbs.bbs.domain.Bbs;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BbsRdo implements JsonSerializable {

    private String bbsId;

    private String memberId;

    private String title;

    private String contents;

    private String noticeFlag;

    private long createdAt;

    public BbsRdo(Bbs bbs){
        this.bbsId = bbs.getBbsId();
        this.memberId = bbs.getMemberId();
        this.title = bbs.getTitle();
        this.contents = bbs.getContents();
        this.noticeFlag = bbs.getNoticeFlag();
        this.createdAt = bbs.getCreatedAt();
    }
}
