package pub.developers.forum.infrastructure.dal.dataobject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CacheDO extends BaseDO {

    private String type;

    private String key;

    private String value;

}
