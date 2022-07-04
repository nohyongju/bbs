package spectra.practice.bbs.member.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import spectra.attic.coreasset.share.util.JsonUtil;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Member {

    private String memberId;

    private String memberName;

    private String grade;

    private String password;

    private String deleteFlag;

    public static void main(String[] args) {
        System.out.println(sample());
    }

    public static Member sample () {
        return new Member (
            "customer1", "이용자", "NOMAL", "1", "N"
        );
    }

    @Override
    public String toString() {
        return JsonUtil.toJson(this);
    }
}
