package pub.developers.forum.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pub.developers.forum.common.enums.SearchTypeEn;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Search extends BaseEntity {

    private SearchTypeEn type;

    private Long entityId;

    private String title;

    private String content;

}
