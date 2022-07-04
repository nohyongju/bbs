package spectra.practice.bbs.bbs.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import spectra.attic.coreasset.share.util.JsonUtil;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Bbs {

    private String bbsId;

    private String memberId;

    private String title;

    private String contents;

    private String noticeFlag;

    private long createdAt;

    public Bbs (String bbsId, String memberId, String title, String contents, String noticeFlag) {
        this.bbsId = bbsId;
        this.memberId = memberId;
        this.title = title;
        this.contents = contents;
        this.noticeFlag = noticeFlag;
        this.createdAt = System.currentTimeMillis();
    }

    public static void main(String[] args) {
        System.out.println(sample());
    }

    public static Bbs sample () {
        return new Bbs (
            "BBS001",
            "customer1",
            "안녕하세요 제목입니다~!~!",
            "내용입니다 안녕하세요~!~!",
            "N"
        );
    }

    @Override
    public String toString() {
        return JsonUtil.toJson(this);
    }
}
