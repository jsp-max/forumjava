package pub.developers.forum.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pub.developers.forum.common.enums.FollowedTypeEn;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Follow extends BaseEntity {

    private Long followed;

    private FollowedTypeEn followedType;

    private Long follower;

}
